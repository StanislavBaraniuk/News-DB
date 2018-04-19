/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newsdb;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DX
 */
class mySQL{
    
    //jdbc:mysql://ТУТ ПОТРІБНО ВКАЗАТИ АДРЕСУ СЕРВЕРА:ПОРТ/ІМ’Я_БАЗИ_ДАНИХ?кодировка
    private String dbUrl = "jdbc:mysql://127.0.0.1:3306/test?characterEncoding=Cp1251";//рядок для зв’язку з БД
    private General gFrame;
    private String user ="root";//КОРИСТУВАЧ
    private String password="";//ПАРОЛЬ
    private Connection conn = null;
    private String tbl="test";//ТАБЛИЦЯ З ЯКОЮ БУДЕМО ПРАЦЮВАТИ
    private Statement s=null;
    
    public mySQL(General gFrame) {
        this.gFrame = gFrame;
    }
    
    public void set_connect_info(String SERVER, String PORT, String DB, String USR, String PAS){
        //    "jdbc:mysql://СЕРВЕР:ПОРТ/БД";
        dbUrl="jdbc:mysql://"  + SERVER + ":" + PORT +"/" +DB+"?characterEncoding=Cp1251";
        user=USR;
        password=PAS;
        
    }
    
    public void set_table(String TBL) {
        tbl = TBL;
        System.out.println(tbl);
    }
    
    public ArrayList get_available_table(){
        ArrayList s = new ArrayList();
        System.out.println(Conect());
        try {
            try {
                DatabaseMetaData md = conn.getMetaData();
                ResultSet rs = md.getTables(null, null, "%", null);
                while (rs.next()) {
                    s.add(rs.getString(3));
                }

                return s;
            } catch (NullPointerException ex) {
                return null;
            }
        } catch (Exception ex) {
            return null;
        }
    }

    public String Conect(){
        try {
            Class.forName ("com.mysql.jdbc.Driver").newInstance ();
            conn = DriverManager.getConnection (dbUrl, user,password);
            gFrame.jTextField1.setBackground(Color.green);
            return "Ok";
        } catch (Exception e) {
            gFrame.jTextField1.setBackground(Color.white);
//            System.err.println ("Cannot connect to database server");
            return e.getLocalizedMessage();
        }
    }
    public Statement getStatement(){
        try {
            return (Statement) conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(mySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public ArrayList GetData() {// метод повертає всі записи з таблиці у вигляді
                             // великого рядка
//        String rez="Помилка!!!";
        ArrayList rez = new ArrayList();
        int i;//кількість колонок
        try{
            
            s = (Statement) conn.createStatement();
            
            // запит до БД
            ResultSet r =null;
                  //r=s.executeQuery("SET NAMES utf8");
                  r=s.executeQuery(
                    "SELECT * " +
                    "FROM  " + tbl +" WHERE 1"
                  );
            //Наступні 2 рядки я використовую, для визначення к-кості колонок
            //в таблиці tbl тобі це певно не потрібно ти знаєш структуру своїх
            //таблиць
            ResultSetMetaData colonki =r.getMetaData();
            i=colonki.getColumnCount();//к-ть колонок
            rez.add(i);
            
            for (int j=1;j<=i;j++){
                rez.add(colonki.getColumnName(j));
            }
            
            while(r.next()) {
                for (int j=1;j<=i;j++){
                    rez.add(r.getString(j));
                }
            }
        }
        catch (Exception e)
        {
            return rez;
        }
        return rez;
    }
    public ResultSet GetDataSet(){ // метод поверне об’єкт НАБІР ЗАПИСІВ
                                   // який потiм буде використано для виведення
                                   //в таблицю на формі
        ResultSet Xrez = null;
        try {
            if (s == null) {
                s = (Statement) conn.createStatement();
            }
            Xrez = s.executeQuery("SELECT * " + "FROM  " + tbl);
            return Xrez;
        } catch (SQLException ex) {
            Logger.getLogger(mySQL.class.getName()).log(Level.SEVERE, null, ex);
            return Xrez;
        }
    }
    public PreparedStatement insert(ArrayList<String> columnArr){
        try{
            String mySQLquery="";
            /*
            conn.prepareStatement(mySQLquery);
            mySQLquery=
              "INSERT INTO `"+ tbl +"` " +
              "(`FirstName`, `LastName`) " +
              "VALUES ('"+ id1 +"', '"+ id2+"');"
            ;
            PreparedStatement X=(PreparedStatement) conn.prepareStatement(mySQLquery);      
            */
            mySQLquery = "INSERT INTO " + tbl + " " + "(";
            for (int i = 0; i < columnArr.size(); i++) {
                if (i != columnArr.size()-1) {
                    mySQLquery = mySQLquery + "" + columnArr.get(i) + ", ";
                } else {
                    mySQLquery = mySQLquery + "" + columnArr.get(i) + "";
                }
            }
            mySQLquery = mySQLquery + ")" + "VALUES (";
            for (int i = 0; i < columnArr.size(); i++) {
                if (i != columnArr.size()-1) {
                    mySQLquery = mySQLquery + "?, ";
                } else {
                    mySQLquery = mySQLquery + "?";
                }
            }
            mySQLquery = mySQLquery + ");";
            System.out.println(mySQLquery);
            PreparedStatement X=(PreparedStatement) conn.prepareStatement(mySQLquery);
            return X;
        }
        catch (Exception e){
            System.out.println(e.fillInStackTrace());
            return null;
        }
    }
    
    public void del(int id, String idN){
        String mySQLquery="";
        try{
            
            //Statement X=(Statement) conn.createStatement();                    
                  mySQLquery=
                    "DELETE FROM `"+ tbl +"` " +
                    "WHERE `"+ idN + "`= "+ id +";"
                  ;
            //X.executeQuery(mySQLquery);
            conn.prepareStatement(mySQLquery);                     
            PreparedStatement X=(PreparedStatement) conn.prepareStatement(mySQLquery);
            X.execute();
        }
        catch (Exception e){
            System.out.println(e.fillInStackTrace()+"\n"+mySQLquery);
        }
    }
    
    public void delAll(){
        String mySQLquery="";
        try{
            
            //Statement X=(Statement) conn.createStatement();                    
                  mySQLquery=
                    "TRUNCATE `"+ tbl +"`;"
                  ;
            //X.executeQuery(mySQLquery);
            conn.prepareStatement(mySQLquery);                     
            PreparedStatement X=(PreparedStatement) conn.prepareStatement(mySQLquery);
            X.execute();
        }
        catch (Exception e){
            System.out.println(e.fillInStackTrace()+"\n"+mySQLquery);
        }
    }
    
    public void close_conections() {
        if (conn != null){
            try
            {
                conn.close ();
            }
            catch (Exception e) { }
        }
    }
    
    @Override
    protected void finalize(){
        if (conn != null){
            try
            {
                conn.close ();
            }
            catch (Exception e) { }
        }
    }
}

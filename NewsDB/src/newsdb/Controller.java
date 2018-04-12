/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newsdb;

import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author stanislaw
 */
public class Controller {
    private String func[] = {"add element", "search element", "delete element", "sample element"};
    private General gFrame = new General(this);
    private Setting sFrame = new Setting(this);
    private Functions fFrame = new Functions(this);
    private mySQL SQL = new mySQL();
    private String user = "rootor", password="root", DBName, SERVER = "127.0.0.1";
    private String PORT = "3306";
    
    public void show_general_frame() {
        gFrame.setVisible(true);
    }
    
    public void show_setting_frame() {
        gFrame.setEnabled(false);
        sFrame.setVisible(true);
    }
    
    public void hide_setting_frame() {
        gFrame.setEnabled(true);
        sFrame.setVisible(false);
    }
    
    public void connect_db() {
        SQL.set_table(gFrame.jComboBox1.getSelectedItem().toString());
        SQL.set_connect_info(SERVER, PORT, DBName, user, password);
        System.out.println(SQL.Conect());
        write_to_table();
    }
    
    public void load_fanctions() {
        gFrame.jComboBox2.removeAllItems();
        for (String s : func) {
            gFrame.jComboBox2.addItem(s);
        }
    }
    
    public void do_functions(int functionsNumb) {
        switch (functionsNumb) {
            case 0: 
                add_element();
                break;
            case 1: 
                break;
            case 2: 
                delete_element();
                break;    
        }
    }
    
    public void delete_element() {
        int X;
        X=gFrame.jTable1.getSelectedRow();
        X=(int) Integer.valueOf((String)gFrame.jTable1.getValueAt(X, 0));
        SQL.del(X, gFrame.jTable1.getColumnName(0));
        connect_db();
    }
    
    public void add_element() {
        ArrayList columnArr = new ArrayList(), valueArr = new ArrayList();
        for (int i = 0; i < gFrame.jTable2.getModel().getColumnCount(); i++) {
            columnArr.add(gFrame.jTable2.getModel().getColumnName(i));
        }
        for (int i = 0; i < gFrame.jTable2.getModel().getColumnCount(); i++) {
            valueArr.add(gFrame.jTable2.getModel().getValueAt(0, i));
        }
//        System.err.println(arr);
        PreparedStatement X = SQL.insert(columnArr, valueArr);
        try {
            int l = 1;
            for (int i = 0; i < gFrame.jTable2.getModel().getColumnCount(); i++) {
                X.setString(l, (String) gFrame.jTable2.getModel().getValueAt(0, i));
                l++;
            }
            X.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        connect_db();
    }
    
    public void show_functions_frame() {
        fFrame.setVisible(true);
        for (String s : func) {
            fFrame.jComboBox2.addItem(s);
        }
    }
    
    
    public void write_to_table() {
        ArrayList list = SQL.GetData();
        System.out.println(list);
        String[] columns = new String[(int)list.get(0)];

        list.remove(0);
        
        for (int i = 0; i < columns.length; i++) { 
            columns[i] = (String) list.get(i);
            System.out.println(columns[i]);
        }
        
        
        
        for (int i = 0; i < columns.length; i++) { 
            list.remove(0);
        }
        
        String[][] data = new String[][]{};
        String[][] data2 = new String[1][1];
        
        gFrame.jTable1.setModel(new DefaultTableModel(data,columns));
        gFrame.jTable2.setModel(new DefaultTableModel(data2,columns));
        DefaultTableModel model = (DefaultTableModel) gFrame.jTable1.getModel();
        System.out.println("tupo pizda - " + list.size()/columns.length);
        ArrayList s = new ArrayList();
        for (Object strings : list) {
            s.add(strings);
        }
        for (int i = 0; i < list.size()/columns.length; i++) {
            model.addRow(new String[columns.length]);
            for (int j = 0; j < columns.length; j++) {
                gFrame.jTable1.setValueAt(s.get(j), i, j);
            }
            for (int k = 0; k < columns.length; k++) { 
                s.remove(0);
            }
        }   
    }
    
    public void check_available_table() {
        
        SQL.set_connect_info(SERVER, PORT, DBName, user, password);
        ArrayList<String> tables = SQL.get_available_table();
        try {
            gFrame.jComboBox1.removeAllItems();
            tables.forEach((a) -> {
                gFrame.jComboBox1.addItem(a);
            });
            for (int i = tables.size(); i < (tables.size()*2); i++) {
                gFrame.jComboBox1.removeItemAt(i);
            }
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
        
        }
    }
    
    public void load_setting_info() {
        sFrame.jTextField1.setText(SERVER);
        sFrame.jTextField2.setText(PORT);
        sFrame.jTextField3.setText(this.user);
        sFrame.jTextField4.setText(this.password);
    }
    
    public void set_connect_info(String user, String password, String SERVER, String PORT) {
        this.user = user;
        this.password = password;
        this.SERVER = SERVER;
        this.PORT = PORT;
    }
    
    public void set_user(String user){
        this.user = user;
    }
    
    public void set_password(String password){
        this.password = password;
    }
    
    public void set_DBName(String DBName){
        this.DBName = DBName;
    }
    
    public void set_SERVER(String SERVER){
        this.SERVER = SERVER;
    }
    
    public void set_PORT(String PORT){
        this.PORT = PORT;
    }
    
    public String get_user(){
        return this.user;
    }
    
    public String get_password(){
        return this.password;
    }
    
    public String get_DBName(){
        return this.DBName;
    }
    
    public String get_SERVER(){
        return this.SERVER;
    }
    
    public String get_PORT(){
        return this.PORT;
    }
    
}






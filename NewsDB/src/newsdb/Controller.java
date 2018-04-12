/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newsdb;

import java.util.ArrayList;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author stanislaw
 */
public class Controller {
    private General gFrame = new General(this);
    private Setting sFrame = new Setting(this);
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
    
    public void write_to_table() {
        ArrayList list = SQL.GetData();
        System.out.println(list);
        String[] columns = new String[(int)list.get(0)];

        list.remove(0);
        
        for (int i = 0; i < columns.length; i++) { 
            columns[i] = (String) list.get(i);
            System.out.println(columns[i]);
        }
        
        System.out.println(list);
        
        for (int i = 0; i < columns.length; i++) { 
            list.remove(0);
        }
        
        System.out.println(list);
        
        String[][] data = new String[][]{};
        
        gFrame.jTable1.setModel(new DefaultTableModel(data,columns));
        
        for (int i = 0; i < list.size(); i++) {
            DefaultTableModel model = (DefaultTableModel) gFrame.jTable1.getModel();
            model.addRow(new String[columns.length]);
//            UDBObject ob = (UDBObject) udb.getObject(i);
            gFrame.jTable1.setValueAt(list.get(i), i, 0);
            for (int l = 1; l <= list.size(); l++) {
//                UDBObjectProperty p = (UDBObjectProperty) arP.get(l-1);
                gFrame.jTable1.setValueAt(list.get(l), i, l);
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






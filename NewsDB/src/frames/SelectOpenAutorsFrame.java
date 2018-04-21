/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import newsdb.*;
import classes.News;
import static frames.SelectOpenNewsFrame.controller;

/**
 *
 * @author Vitaly
 */
public class SelectOpenAutorsFrame extends javax.swing.JFrame {
    private static Controller controller;
    public ArrayList<classes.Account> accounts;
    public String selectedIndex;
    /**
     * Creates new form SelectOpenNewsFrame
     */
    public SelectOpenAutorsFrame(Controller controller) {
        initComponents();
        SelectOpenAutorsFrame.controller = controller;
        Dimension sSize = Toolkit.getDefaultToolkit ().getScreenSize ();
        this.setLocation(sSize.width/2-this.getWidth()/2, sSize.height/2-this.getHeight()/2);
        
//        jLabel3.setIcon(controller.frameController.createIcon("/res/img/ok_standart.png"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        surnameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fotoField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        chisloComboBox = new javax.swing.JComboBox<>();
        monthComboBox2 = new javax.swing.JComboBox<>();
        ricComboBox = new javax.swing.JComboBox<>();
        sexComboBox = new javax.swing.JComboBox<>();
        countryComboBox = new javax.swing.JComboBox<>();
        profTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        aboutTextPane = new javax.swing.JTextPane();

        setResizable(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Ім'я");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Прізвище");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Аватар URL ");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Стать");

        jLabel5.setText("Дата народження");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Країна");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Професія");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Про себе");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("E-mail");

        chisloComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        chisloComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chisloComboBoxActionPerformed(evt);
            }
        });

        monthComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Січень", "Лютий", "Березень", "Квітень", "Травень", "Червень", "Липень", "Серпень", "Вересень", "Жовтень", "Листопад", "Грудень" }));

        ricComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017" }));

        sexComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Чоловіча", "Жіноча" }));

        countryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Австралія", "Австрія", "Азербайджан", "Албанія", "Алжир", "Ангола", "Андорра", "Аргентина", "Афганістан", "Багами", "Бангладеш", "Барбадос", "Бахрейн", "Беліз", "Білорусія", "Бельгія", "Бенін", "Болгарія", "Болівія", "Боснія і Герцеговина", "Ботсвана", "Бразилія", "Бруней", "Буркина-Фасо", "Бурунді", "Бутан", "Вануату", "Ватикан", "Вірменія", "Великобританія", "Венесуела", "В'єтнам", "Габон", "Гаїті", "Гайана", "Гамбія", "Гана", "Гватемала", "Гвінея", "Гвінея-Бісау", "Гондурас", "Гренада", "Греція", "Грузія", "Данія", "Джібуті", "Домініка", "Домініканська Республіка", "Єгипет", "Ємен", "Замбія", "Зимбабве", "Еквадор", "Екваторіальна Гвінея", "Еритрея", "Естонія", "Ефіопія", "Ізраїль", "Індія", "Індонезія", "Ірак", "Іран", "Ірландія", "Ісландія", "Іспанія", "Італія", "Йорданія", "Кабо-Верде", "Казахстан", "Камбоджа", "Камерун", "Канада", "Катар", "Кенія", "Кіпр", "Киргизія", "Кірібаті", "Китай", "Колумбія", "Коморські Острови", "Конго (Демократична республіка)", "Конго", "Коста-Рика", "Кот-д'Івуар", "Куба", "Кувейт", "Лаос", "Латвія", "Лесото", "Ліберія", "Ліван", "Лівія", "Литва", "Ліхтенштейн", "Люксембург", "Маврикій", "Мавританія", "Мадагаскар", "Македонії", "Малаві", "Малайзія", "Малі", "Мальта", "Мальдіви", "Марокко", "Маршаллові острови ", "Мексика", "Мозамбік", "Молдова", "Монако", "Монголія", "М'янма", "Намібія", "Науру", "Непал", "Нігер", "Нігерія", "Нідерланди", "Нікарагуа", "Німеччина", "Нова Зеландія", "Норвегія ", "Об'єднані Арабські Емірати", "Оман", "Пакистан", "Палау", "Панама", "Папуа", "Нова Гвінея", "Парагвай", "Перу", "Південна Корея", "Північна Корея", "Південно-Африканська Республіка", "Польща", "Португалія", "Росія", "Руанда", "Румунія", "Сальвадор", "Самоа", "Сан-Марино", "Сан-Томе і Принсипи", "Саудівська Аравія", "Свазіленд", "Сейшели", "Сенегал", "Сент-Вінсент і Гренадіни", "Сент-Китс і Невис", "Сент-Люсія", "Сербія", "Сінгапур", "Сирія", "Словаччина", "Словенія", "США", "Соломонові", "Острови", "Сомалі", "Судан", "Суринам", "Сьерра-Леоне", "Східний Тимор", "Таджикистан", "Таїланд", "Танзанія", "Того", "Тонга", "Тринидад і Тобаго", "Тувалу", "Туніс", "Туркменістан", "Туреччина", "Уганда", "Угорщина", "Узбекистан", "Україна", "Уругвай", "Фед. Штати", "Мікронезії", "Фіджі", "Філіппіни", "Фінляндія", "Франція", "Хорватія", "ЦАР", "Чад", "Чорногорія", "Чехія", "Чилі", "Швейцарія", "Швеція", "Шри-Ланка", "Ямайка", "Японія" }));

        jButton1.setText("Прийняти");
        jButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton1MouseMoved(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(aboutTextPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(surnameField)
                                    .addComponent(nameTextField)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(chisloComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(monthComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ricComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(26, 26, 26))
                                    .addComponent(fotoField)
                                    .addComponent(emailField)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sexComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(131, 131, 131))
                                    .addComponent(countryComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(profTextField)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(surnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fotoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chisloComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ricComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sexComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(countryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(profTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseMoved
        jButton1.setForeground(Color.black);
    }//GEN-LAST:event_jButton1MouseMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        controller.update_conect("autors");
        if (nameTextField.getText().length() > 0) 
        {
            controller.add_autors_auto(accounts, selectedIndex);
            jButton1.setForeground(Color.green);
            controller.load_autors();
        } else {
            jButton1.setForeground(Color.red);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void chisloComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chisloComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chisloComboBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SelectOpenAutorsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectOpenAutorsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectOpenAutorsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectOpenAutorsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectOpenAutorsFrame(controller).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextPane aboutTextPane;
    public javax.swing.JComboBox<String> chisloComboBox;
    public javax.swing.JComboBox<String> countryComboBox;
    public javax.swing.JTextField emailField;
    public javax.swing.JTextField fotoField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JComboBox<String> monthComboBox2;
    public javax.swing.JTextField nameTextField;
    public javax.swing.JTextField profTextField;
    public javax.swing.JComboBox<String> ricComboBox;
    public javax.swing.JComboBox<String> sexComboBox;
    public javax.swing.JTextField surnameField;
    // End of variables declaration//GEN-END:variables
}

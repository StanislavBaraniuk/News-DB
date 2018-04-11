/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newsdb;

/**
 *
 * @author stanislaw
 */
public class Controller {
    private General gFrame = new General(this);
    private Setting sFrame = new Setting(this);
    
    public void show_general_frame() {
        gFrame.setVisible(true);
    }
    
    public void show_setting_frame() {
        gFrame.setEnabled(false);
        sFrame.setVisible(true);
    }
    
    public void hide_setting_frame() {
        gFrame.setEnabled(true);
    }
}

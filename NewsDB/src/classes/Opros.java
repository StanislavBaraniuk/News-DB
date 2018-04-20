/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author stanislaw
 */
public class Opros {
    String id, title, data, time, result;
    
    public Opros(String id, String title, String data, String time, String result) {
        this.id = id;
        this.title = title;
        this.data = data;
        this.time = time;
        this.result = result;
    }
}

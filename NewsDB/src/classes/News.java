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
public class News {
    public String txt, date, time, autor, title, tegs, photo, index, photoTitle;
   
    public News(String index, String title, String date, String time, String txt, String autor, String tegs, String photo, String photoTitle) {
        this.index = index;
        this.txt = txt;
        this.date = date;
        this.time = time;
        this.autor = autor;
        this.title = title;
        this.tegs = tegs;
        this.photo = photo;
        this.photoTitle = photoTitle;
    }
}

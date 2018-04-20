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
public class Coments {
    public String id, text, autor, data, time, like, answer, country, news;
    
    public Coments(String id, String text, String autor, String data, 
                String time, String like, String answer, String country, String news) {
        this.id = id;
        this.text = text;
        this.autor = autor;
        this.data = data;
        this.time = time;
        this.like = like;
        this.answer = answer;
        this.country = country;
        this.news = news;
    }
}

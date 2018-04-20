/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author stanislaw
 */
public class Category {
    private String id;
    private String title;
    private ArrayList<Integer> news = new ArrayList<Integer>();
    
    public Category(String id, String title){
        this.id=id;
        this.title=title;
    }
    
    public void setNews(String cat) {
        String n[] = cat.split(",");
        for (int i = 0; i < n.length; i++) {
            this.news.add(Integer.parseInt(n[i]));
        }
    }
}

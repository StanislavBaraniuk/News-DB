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
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the news
     */
    public ArrayList<Integer> getNews() {
        return news;
    }

    /**
     * @param news the news to set
     */
    public void setNews(String cat) {
        String n[] = cat.split(",");
        for (int i = 0; i < n.length; i++) {
            this.news.add(Integer.parseInt(n[i]));
        }
    }
    
}

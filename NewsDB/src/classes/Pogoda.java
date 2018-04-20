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
public class Pogoda {
    String id, cities, temperature;

    public Pogoda(String id, String cities, String temperature) {
        this.id = id;
        this.cities = cities;
        this.temperature = temperature;
    }
}

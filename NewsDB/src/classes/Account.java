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
public class Account {
    public String id, name, surname, avatar, burthday, sex, country, speciality, about, email, password;

    public Account(String id, String name, String surname, String avatar, String burthday, 
                   String sex, String country, String speciality, String about, String email, String password) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.avatar = avatar;
        this.burthday = burthday;
        this.sex = sex;
        this.country = country;
        this.speciality = speciality;
        this.about = about;
        this.email = email;
        this.password = password;
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pp;

import java.io.File;
import java.util.List;
import javax.swing.ListModel;

/**
 *
 * @author geertjan
 */
public class Person {

    String name;
    String city;
    File photo;
    String[] courses;

    public Person(String name, String city, File file, String[] courses) {
        this.name = name;
        this.city = city;
        this.photo = file;
        this.courses = courses;
    }

    public String[] getCourses() {return courses;}
    public void setCourses(String[] courses) {this.courses = courses;}
    public File getPhoto() {return photo;}
    public void setPhoto(File photo) {this.photo = photo;}
    public String getCity() {return city;}
    public void setCity(String city) {this.city = city;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    
}

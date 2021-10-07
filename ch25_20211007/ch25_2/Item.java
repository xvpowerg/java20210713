/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch25_20211007.ch25_2;
import java.io.Serializable;
/**
 *
 * @author xvpow
 */
public class Item implements Serializable {
    private String name;
    private int id;
    private User user = new User();
    public Item(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Item{" + "name=" + name + ", id=" + id + '}';
    }
    
    
}

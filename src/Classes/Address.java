/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author fiwie
 */
public class Address {
    private String street;
    private String city;

    public Address() {
    }    
    
    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }   

    public void setStreet(String street) {
        this.street = street;
    }    

    public void setCity(String city) {
        this.city = city;
    }
    
     public String getStreet() {
        return street;
    }
     
    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return street + "@" + city;
    }
    
}


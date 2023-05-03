/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author fiwie
 */
public class Airport {
    private String airportID;   //three letters
    private String city;
    private String country;
    
    //const01
    public Airport() {
        this.airportID = "";
        this.city = "";
        this.country = "";
    }

    //const02
    public Airport(String airportID, String city, String country) {
        
        this.setAirportID(airportID);
        this.setCity(city);
        this.setCountry(country);
    }

    public void setAirportID(String airportID) {             
        
        if(airportID.matches("[a-zA-Z]+$") && airportID.length()==3){
            this.airportID = airportID.toUpperCase();
        }
        else{
            System.out.println("Invalid Airport ID");
        }
          
    }

    public void setCity(String city) {
        if (city.matches("[a-zA-Z ]+$")) {
            this.city = city;
        }
        else{
            System.out.println("Invalid City Name");
        }
    }

    public void setCountry(String country) {
        if (country.matches("[a-zA-Z ]+$")) {
            this.country = country;
        }
        else{
            System.out.println("Invalid Airline Name");
        }
    }

    public String getAirportID() {
        return airportID; //returns airportID in capitals
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return this.getAirportID() + "," + this.getCity() + "," + this.getCountry();
    }
        
}


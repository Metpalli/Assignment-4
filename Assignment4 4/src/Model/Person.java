/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author sundermetpalli
 */
public class Person extends House {
    
    private String firstName;
    private String lastName;
    private long age;
    private long stateID;
    private Patient patient;
    private  City citynme;
    private Community commname;
    private House housenum;
         

    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public long getAge() {
        return age;
    }
    
    public void setAge(long age) {
        this.age = age;
    }
    
  
    public Patient getPatient() {
        return patient;
    }
    
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
     public long getStateID() {
        return stateID;
    }
    
    public void setStateID(long stateID) {
        this.stateID = stateID;
    }

    public City getCitynme() {
        return citynme;
    }

    public void setCitynme(City citynme) {
        this.citynme = citynme;
    }


    public Community getCommname() {
        return commname;
    }

    public void setCommname(Community commname) {
        this.commname = commname;
    }

    public House getHousenum() {
        return housenum;
    }

    public void setHousenum(House housenum) {
        this.housenum = housenum;
    }
    
   
    
    
    
    
    @Override
    public String toString()
    {
        return this.firstName;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private String city;
    private String community;
    private long house;
    
    
    
    
    
       public String getCity() {
        return city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
     public String getCommunity() {
        return community;
    }
    
    public void setCommunity(String community) {
        this.community = community;
    }
    
     public long getHouse() {
        return house;
    }
    
    public void setHouse(long house) {
        this.house = house;
    }
    
    
}

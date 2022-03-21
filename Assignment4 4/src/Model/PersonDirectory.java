/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author sundermetpalli
 */
public class PersonDirectory {
    
    private ArrayList<Person> personDirectory;
    private ArrayList<Person> samecommDirectory;
    
    public PersonDirectory() {
        personDirectory = new ArrayList<>();
    }
    
    public ArrayList<Person> getPersonHistory() {
        return personDirectory;
    }
    
    public void setPersonHistory(ArrayList<Person> personHistory) {
        this.personDirectory = personHistory;
    }
    
    public Person addPerson() {
        Person person = new Person();
        personDirectory.add(person);
        return person;
    }
    
    public void deletePerson(Person person) {
        personDirectory.remove(person);
    }
    
    public ArrayList<Person> sameCommunity(String community)
    {
        ArrayList<Person> samecommDirectory = new ArrayList();
        for(Person person: personDirectory)
        {
            if(person.getCommunity().equalsIgnoreCase(community))
            {
                if(person.getPatient()!=null)
                {
                    samecommDirectory.add(person);
                }
            }
        }
        return samecommDirectory;
    }

    
}

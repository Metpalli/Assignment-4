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
public class Patient extends Person{
    
    protected String patientID;
    protected EncounterHistory vitalSignHistory;
    
    public Patient() {
        this.vitalSignHistory = new EncounterHistory();
    }
    
    public String getPatientID() {
        return patientID;
    }
    
    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }
    
    public EncounterHistory getVitalSignHistory() {
        return vitalSignHistory;
    }
    
    public void setVitalSignHistory(EncounterHistory vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    @Override
    public String toString()
    {
        return String.valueOf(this.patientID);
    } 
    
    
}

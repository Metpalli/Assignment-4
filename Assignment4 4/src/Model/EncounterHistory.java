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
public class EncounterHistory extends VitalSigns{
    
   private ArrayList<VitalSigns> history;
    
    public EncounterHistory() {
        history = new ArrayList<>();
    }
    
    public ArrayList<VitalSigns> getHistory() {
        return history;
    }
    
    public void setHistory(ArrayList<VitalSigns> history) {
        this.history = history;
    }
    
    public VitalSigns createAndAddVitalSign() {
        VitalSigns vitalSign = new VitalSigns();
        history.add(vitalSign);
        return vitalSign;
    }
    
    public void deleteVitalSign(VitalSigns vitalSign) {
        history.remove(vitalSign);
    } 
    
    
    

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author sundermetpalli
 */
public class VitalSigns {
   
    private int bodyTemp;
    private int respiratoryRate;
    private int pulseRate;
    private int bloodPressure;
    private Date timestamp;
    
    public int getBodyTemp() {
        return bodyTemp;
    }

    public void setBodyTemp(int bodyTemp) {
        this.bodyTemp = bodyTemp;
    }

    public int getPulseRate() {
        return pulseRate;
    }

    public void setPulseRate(int pulseRate) {
        this.pulseRate = pulseRate;
    }

    
    public int getRespiratoryRate() {
        return respiratoryRate;
    }
    
    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }
    
    
    public int getBloodPressure() {
        return bloodPressure;
    }
    
    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }
    
  
    
    public Date getTimestamp() {
        return timestamp;
    }
    
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    
    public String RRStatus(long pAge, VitalSigns vs) {
        String RRStatus = "Abnormal";
        
        int RR=vs.getRespiratoryRate();
        
        if(pAge>=1 && pAge<=3){
        if(RR>=20 && RR<=30) RRStatus = "Normal";
        }else if(pAge>3 && pAge<=5){
        if(RR>=20 && RR<=30) RRStatus = "Normal";
        }else if(pAge>5 && pAge<=12){
        if(RR>=20 && RR<=30) RRStatus = "Normal";
        } else if(pAge>12){
        if(RR>=12 && RR<=20) RRStatus = "Normal";   
        }

        return RRStatus;
    }
   
public String PRStatus(long pAge, VitalSigns vs) {
        
        String PRStatus = "Abnormal";
        int PR=vs.getPulseRate();
        
        if((pAge>=1 && pAge<=3)&&(PR>=80 && PR<=130))
            PRStatus = "Normal";
        else if((pAge>3 && pAge<=5) && (PR>=80 && PR<=120))
                PRStatus = "Normal";
        else if ((pAge>5 && pAge<=12)&&(PR>=70 && PR<=110))
                     PRStatus = "Normal";
        else if((pAge>12)&&(PR>=55 && PR<=105))
            PRStatus = "Normal";

        return PRStatus;
    }

public String BTStatus(long pAge, VitalSigns vs) {

        String BTStatus = "Abnormal";
        int BT=vs.getBodyTemp();
        if(BT<=37 && BT>=36)
        BTStatus="Normal";
        return BTStatus;
    }

public String BPStatus(long pAge, VitalSigns vs) {
        String BPStatus = "Abnormal";

        int BP=vs.getBloodPressure();

        if(pAge>=1 && pAge<=3){
        if(BP>=80 && BP<=110) BPStatus = "Normal";
        }else if(pAge>3 && pAge<=5){
        if(BP>=80 && BP<=110) BPStatus = "Normal";
        }else if(pAge>5 && pAge<=12){
        if(BP>=80 && BP<=110) BPStatus = "Normal";
        } else if(pAge>12){
        if(BP>=110 && BP<=120) BPStatus = "Normal";    
        }

        return BPStatus;
    }
   
    
    
    @Override
    public String toString() {
        SimpleDateFormat ft = new SimpleDateFormat("MM/dd/yyyy 'at' hh:mm:ss a");
        return ft.format(timestamp);
    }
    
    
}

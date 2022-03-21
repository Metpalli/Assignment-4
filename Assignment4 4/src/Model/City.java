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
public class City {
     private String cityname;
    private ArrayList<Community> CommunityList;

        
        
        public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
        
        }
    public ArrayList<Community> getCityList() {
        return CommunityList;
    }

    public void setCityList(ArrayList<Community> CityList) {
        this.CommunityList = CityList;
    }
}

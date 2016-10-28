/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author INAMETCLIN-3
 */
public class stationnetworkdefinition {
    private String networkAbbreviation;
    private String networkFullName;

    public stationnetworkdefinition(String networkAbbreviation, String networkFullName) {
        this.networkAbbreviation = networkAbbreviation;
        this.networkFullName = networkFullName;
    }
    
    public String getNetworkAbbreviation() {
        return networkAbbreviation;
    }

    public void setNetworkAbbreviation(String networkAbbreviation) {
        this.networkAbbreviation = networkAbbreviation;
    }

    public String getNetworkFullName() {
        return networkFullName;
    }

    public void setNetworkFullName(String networkFullName) {
        this.networkFullName = networkFullName;
    }
    
}

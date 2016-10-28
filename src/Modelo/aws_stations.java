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
public class aws_stations {
    private String aws_id;
    private String national_id;
    private String station_name;

    public aws_stations(String aws_id, String national_id, String station_name) {
        this.aws_id = aws_id;
        this.national_id = national_id;
        this.station_name = station_name;
    }

    public String getAws_id() {
        return aws_id;
    }

    public void setAws_id(String aws_id) {
        this.aws_id = aws_id;
    }

    public String getNational_id() {
        return national_id;
    }

    public void setNational_id(String national_id) {
        this.national_id = national_id;
    }

    public String getStation_name() {
        return station_name;
    }

    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }
    
}

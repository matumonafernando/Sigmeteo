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
public class instrumentinspection 
{
private String performedOn;
private int  inspectionDatetime;
private String performedBy;
private String status ; 
private String remack ; 
private String performedAt;

    public instrumentinspection(String performedOn, int inspectionDatetime, String performedBy, String status, String remack, String performedAt) {
        this.performedOn = performedOn;
        this.inspectionDatetime = inspectionDatetime;
        this.performedBy = performedBy;
        this.status = status;
        this.remack = remack;
        this.performedAt = performedAt;
    }

    public String getPerformedOn() {
        return performedOn;
    }

    public void setPerformedOn(String performedOn) {
        this.performedOn = performedOn;
    }

    public int getInspectionDatetime() {
        return inspectionDatetime;
    }

    public void setInspectionDatetime(int inspectionDatetime) {
        this.inspectionDatetime = inspectionDatetime;
    }

    public String getPerformedBy() {
        return performedBy;
    }

    public void setPerformedBy(String performedBy) {
        this.performedBy = performedBy;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemack() {
        return remack;
    }

    public void setRemack(String remack) {
        this.remack = remack;
    }

    public String getPerformedAt() {
        return performedAt;
    }

    public void setPerformedAt(String performedAt) {
        this.performedAt = performedAt;
    }

}

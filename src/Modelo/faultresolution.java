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
public class faultresolution {
    private int resolvedDatetime;
    private String resolvedBy;
private int associatedWith;
private String remarks;

    public faultresolution(int resolvedDatetime, String resolvedBy, int associatedWith, String remarks) {
        this.resolvedDatetime = resolvedDatetime;
        this.resolvedBy = resolvedBy;
        this.associatedWith = associatedWith;
        this.remarks = remarks;
    }

    public int getResolvedDatetime() {
        return resolvedDatetime;
    }

    public void setResolvedDatetime(int resolvedDatetime) {
        this.resolvedDatetime = resolvedDatetime;
    }

    public String getResolvedBy() {
        return resolvedBy;
    }

    public void setResolvedBy(String resolvedBy) {
        this.resolvedBy = resolvedBy;
    }

    public int getAssociatedWith() {
        return associatedWith;
    }

    public void setAssociatedWith(int associatedWith) {
        this.associatedWith = associatedWith;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    
}

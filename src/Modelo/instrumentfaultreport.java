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
public class instrumentfaultreport 
{
private String refersTo ;
private String reportId;
private String reportDatetime;
private String fautDescription;
private String reportedBy ;
private String reportedFrom;

    public instrumentfaultreport(String refersTo, String reportId, String reportDatetime, String fautDescription, String reportedBy, String reportedFrom) {
        this.refersTo = refersTo;
        this.reportId = reportId;
        this.reportDatetime = reportDatetime;
        this.fautDescription = fautDescription;
        this.reportedBy = reportedBy;
        this.reportedFrom = reportedFrom;
    }

    public String getRefersTo() {
        return refersTo;
    }

    public void setRefersTo(String refersTo) {
        this.refersTo = refersTo;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getReportDatetime() {
        return reportDatetime;
    }

    public void setReportDatetime(String reportDatetime) {
        this.reportDatetime = reportDatetime;
    }

    public String getFautDescription() {
        return fautDescription;
    }

    public void setFautDescription(String fautDescription) {
        this.fautDescription = fautDescription;
    }

    public String getReportedBy() {
        return reportedBy;
    }

    public void setReportedBy(String reportedBy) {
        this.reportedBy = reportedBy;
    }

    public String getReportedFrom() {
        return reportedFrom;
    }

    public void setReportedFrom(String reportedFrom) {
        this.reportedFrom = reportedFrom;
    }

}

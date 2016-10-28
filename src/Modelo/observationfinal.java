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
public class observationfinal {
private String recordedFrom;
private int describedBy;
private int obsDatetime;
private String obsLevel;
private float obsValue;
private String flag;
private int period;
private int qcStatus;
private String qcTypeLog;
private int acquisitionType;
private String dataForm;
private String capturdBy;
private int mark;
private String temperatureUnits;
private String precipitationUnits;
private String cloudHeightUnits;
private String visUnits;
private int dataSourceTimeZone;   

    public observationfinal(String recordedFrom, int describedBy, int obsDatetime, String obsLevel, float obsValue, String flag, int period, int qcStatus, String qcTypeLog, int acquisitionType, String dataForm, String capturdBy, int mark, String temperatureUnits, String precipitationUnits, String cloudHeightUnits, String visUnits, int dataSourceTimeZone) {
        this.recordedFrom = recordedFrom;
        this.describedBy = describedBy;
        this.obsDatetime = obsDatetime;
        this.obsLevel = obsLevel;
        this.obsValue = obsValue;
        this.flag = flag;
        this.period = period;
        this.qcStatus = qcStatus;
        this.qcTypeLog = qcTypeLog;
        this.acquisitionType = acquisitionType;
        this.dataForm = dataForm;
        this.capturdBy = capturdBy;
        this.mark = mark;
        this.temperatureUnits = temperatureUnits;
        this.precipitationUnits = precipitationUnits;
        this.cloudHeightUnits = cloudHeightUnits;
        this.visUnits = visUnits;
        this.dataSourceTimeZone = dataSourceTimeZone;
    }


    public String getRecordedFrom() {
        return recordedFrom;
    }

    public void setRecordedFrom(String recordedFrom) {
        this.recordedFrom = recordedFrom;
    }

    public int getDescribedBy() {
        return describedBy;
    }

    public void setDescribedBy(int describedBy) {
        this.describedBy = describedBy;
    }

    public int getObsDatetime() {
        return obsDatetime;
    }

    public void setObsDatetime(int obsDatetime) {
        this.obsDatetime = obsDatetime;
    }

    public String getObsLevel() {
        return obsLevel;
    }

    public void setObsLevel(String obsLevel) {
        this.obsLevel = obsLevel;
    }

    public float getObsValue() {
        return obsValue;
    }

    public void setObsValue(float obsValue) {
        this.obsValue = obsValue;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public int getQcStatus() {
        return qcStatus;
    }

    public void setQcStatus(int qcStatus) {
        this.qcStatus = qcStatus;
    }

    public String getQcTypeLog() {
        return qcTypeLog;
    }

    public void setQcTypeLog(String qcTypeLog) {
        this.qcTypeLog = qcTypeLog;
    }

    public int getAcquisitionType() {
        return acquisitionType;
    }

    public void setAcquisitionType(int acquisitionType) {
        this.acquisitionType = acquisitionType;
    }

    public String getDataForm() {
        return dataForm;
    }

    public void setDataForm(String dataForm) {
        this.dataForm = dataForm;
    }

    public String getCapturdBy() {
        return capturdBy;
    }

    public void setCapturdBy(String capturdBy) {
        this.capturdBy = capturdBy;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getTemperatureUnits() {
        return temperatureUnits;
    }

    public void setTemperatureUnits(String temperatureUnits) {
        this.temperatureUnits = temperatureUnits;
    }

    public String getPrecipitationUnits() {
        return precipitationUnits;
    }

    public void setPrecipitationUnits(String precipitationUnits) {
        this.precipitationUnits = precipitationUnits;
    }

    public String getCloudHeightUnits() {
        return cloudHeightUnits;
    }

    public void setCloudHeightUnits(String cloudHeightUnits) {
        this.cloudHeightUnits = cloudHeightUnits;
    }

    public String getVisUnits() {
        return visUnits;
    }

    public void setVisUnits(String visUnits) {
        this.visUnits = visUnits;
    }

    public int getDataSourceTimeZone() {
        return dataSourceTimeZone;
    }

    public void setDataSourceTimeZone(int dataSourceTimeZone) {
        this.dataSourceTimeZone = dataSourceTimeZone;
    }


}

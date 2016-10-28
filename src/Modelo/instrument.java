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
public class instrument {
    private String instrumentName;
private String instrumentId; 
private String serialNumber;
private String abbreviation;
private String model;
private String manufacturer;
private float instrumentUncertainty;
private int installationDatetime;
private int deinstallationDatetime;
private String height;
private int instrumentPicture;
private String installedAt;

    public instrument(String instrumentName, String instrumentId, String serialNumber, String abbreviation, String model, String manufacturer, float instrumentUncertainty, int installationDatetime, int deinstallationDatetime, String height, int instrumentPicture, String installedAt) {
        this.instrumentName = instrumentName;
        this.instrumentId = instrumentId;
        this.serialNumber = serialNumber;
        this.abbreviation = abbreviation;
        this.model = model;
        this.manufacturer = manufacturer;
        this.instrumentUncertainty = instrumentUncertainty;
        this.installationDatetime = installationDatetime;
        this.deinstallationDatetime = deinstallationDatetime;
        this.height = height;
        this.instrumentPicture = instrumentPicture;
        this.installedAt = installedAt;
    }

    public String getInstrumentName() {
        return instrumentName;
    }

    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    public String getInstrumentId() {
        return instrumentId;
    }

    public void setInstrumentId(String instrumentId) {
        this.instrumentId = instrumentId;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getInstrumentUncertainty() {
        return instrumentUncertainty;
    }

    public void setInstrumentUncertainty(float instrumentUncertainty) {
        this.instrumentUncertainty = instrumentUncertainty;
    }

    public int getInstallationDatetime() {
        return installationDatetime;
    }

    public void setInstallationDatetime(int installationDatetime) {
        this.installationDatetime = installationDatetime;
    }

    public int getDeinstallationDatetime() {
        return deinstallationDatetime;
    }

    public void setDeinstallationDatetime(int deinstallationDatetime) {
        this.deinstallationDatetime = deinstallationDatetime;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public int getInstrumentPicture() {
        return instrumentPicture;
    }

    public void setInstrumentPicture(int instrumentPicture) {
        this.instrumentPicture = instrumentPicture;
    }

    public String getInstalledAt() {
        return installedAt;
    }

    public void setInstalledAt(String installedAt) {
        this.installedAt = installedAt;
    }

}

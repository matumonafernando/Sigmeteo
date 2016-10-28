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
public class obselement {
  private int elementId;
private String abbreviation;
private String elementName;
private String description;
private float elementScale;
private String upperLimit;
private String lowerLimit;
private String units;
private String elementtype;
private int qcTotalRequired;  

    public obselement(int elementId, String abbreviation, String elementName, String description, float elementScale, String upperLimit, String lowerLimit, String units, String elementtype, int qcTotalRequired) {
        this.elementId = elementId;
        this.abbreviation = abbreviation;
        this.elementName = elementName;
        this.description = description;
        this.elementScale = elementScale;
        this.upperLimit = upperLimit;
        this.lowerLimit = lowerLimit;
        this.units = units;
        this.elementtype = elementtype;
        this.qcTotalRequired = qcTotalRequired;
    }


    public int getElementId() {
        return elementId;
    }

    public void setElementId(int elementId) {
        this.elementId = elementId;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getElementName() {
        return elementName;
    }

    public void setElementName(String elementName) {
        this.elementName = elementName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getElementScale() {
        return elementScale;
    }

    public void setElementScale(float elementScale) {
        this.elementScale = elementScale;
    }

    public String getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(String upperLimit) {
        this.upperLimit = upperLimit;
    }

    public String getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(String lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getElementtype() {
        return elementtype;
    }

    public void setElementtype(String elementtype) {
        this.elementtype = elementtype;
    }

    public int getQcTotalRequired() {
        return qcTotalRequired;
    }

    public void setQcTotalRequired(int qcTotalRequired) {
        this.qcTotalRequired = qcTotalRequired;
    }


}

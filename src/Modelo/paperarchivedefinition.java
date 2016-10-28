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
public class paperarchivedefinition {
    private String formId;
    private String description;

    public paperarchivedefinition(String formId, String description) {
        this.formId = formId;
        this.description = description;
    }

    public String getFormId() {
        return formId;
    }

    public void setFormId(String formId) {
        this.formId = formId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}

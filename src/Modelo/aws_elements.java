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
public class aws_elements {
    private String aws_element;
    private String climsoft_element;
    private String element_description;

    public aws_elements(String aws_element, String climsoft_element, String element_description) {
        this.aws_element = aws_element;
        this.climsoft_element = climsoft_element;
        this.element_description = element_description;
    }

    public String getAws_element() {
        return aws_element;
    }

    public void setAws_element(String aws_element) {
        this.aws_element = aws_element;
    }

    public String getClimsoft_element() {
        return climsoft_element;
    }

    public void setClimsoft_element(String climsoft_element) {
        this.climsoft_element = climsoft_element;
    }

    public String getElement_description() {
        return element_description;
    }

    public void setElement_description(String element_description) {
        this.element_description = element_description;
    }
    
}

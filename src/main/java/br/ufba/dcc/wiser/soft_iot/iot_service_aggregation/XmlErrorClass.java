/*
 * Created by Wiser Research Group UFBA
 */
package br.ufba.dcc.wiser.soft_iot.iot_service_aggregation;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * This class is used to return an error to the user
 * You should include this on every service you create.
 * 
 * @author jeferson
 */
@XmlRootElement(name = "Error")
public class XmlErrorClass {
    private boolean status; 
    private String message;
    
    public XmlErrorClass(boolean status){
        this.status = status;
    }
    
    public XmlErrorClass(){
        this(false);
    }
    
    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
    
    
}

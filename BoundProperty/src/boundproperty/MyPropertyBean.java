/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundproperty;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author kitsa
 */
public class MyPropertyBean implements Serializable {
    
    public static final String SCORE_PROPERTY = "Soccerscore";
    
    private String Soccerscore;
    
    private PropertyChangeSupport propertySupport;
    
    public MyPropertyBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getSoccerscore() {
        return Soccerscore;
    }
    
    public void setSoccerscore(String value) {
        String oldValue = Soccerscore;
        Soccerscore = value;
        propertySupport.firePropertyChange(SCORE_PROPERTY, oldValue, Soccerscore);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}

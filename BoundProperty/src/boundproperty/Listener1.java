/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundproperty;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author kitsa
 */
public class Listener1 implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent pce) {
        System.out.println("Live Score"+pce.getNewValue()); //To change body of generated methods, choose Tools | Templates.
    }
    
}

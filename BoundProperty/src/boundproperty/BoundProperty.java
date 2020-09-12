
package boundproperty;
import java.util.Scanner;

public class BoundProperty {

    
    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);
        

        MyPropertyBean source = new MyPropertyBean();
        Listener1 listener1 = new Listener1();
        Listener2 listener2 = new Listener2();
        source.addPropertyChangeListener(listener1);
        source.addPropertyChangeListener(listener2);
        while(true){
            System.out.print("Enter Score :");
            String input = myObj.nextLine();
            source.setSoccerscore(input);
            if(input.equals(""))
           { System.exit(0); }
        }
       
    }
    
}

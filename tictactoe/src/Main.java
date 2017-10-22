import model.*;
import view.*;
import controller.*;

public class Main {                                                              
                                                                                 
    public static void main(String[] args) {                                   
        // Create the components     
        
    		Controller c = new Controller();  
    		View v = new View();   
        Model m = new Model();                                                                                                                                            
        m.registerView(v);
        c.setModel(m);
        v.setActionListener(c);
    }                                                                            
} 
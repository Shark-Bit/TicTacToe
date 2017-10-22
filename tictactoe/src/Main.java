
public class Main {                                                              
                                                                                 
    public static void main(String[] args) {                                   
        // Create the components                                                 
        Model m = new Model();                                                        
        View v = new View()                                                       
        Controller c = new Controller();                                                
                                                                                 
        // Use aggregation to put the components together                        
        m.registerView(v);                                                       
        c.setModel(m);                                                           
                                                                                 
        /*                                                                       
         * The tricky part:                                                      
         * How to separate controller functionality from view functionality?     
         * One possibility: use aggregation and pass an ActionListener to the    
         * view rather than creating an anonymous inner class in the view.        
         */                                                                      
        v.setActionListener(c);                                                  
        ...                                                            
    }                                                                            
} 
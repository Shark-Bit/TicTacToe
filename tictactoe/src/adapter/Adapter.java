package adapter;
import controller.*;
import view.*;
import java.awt.event.*;
import java.util.*;
public class Adapter implements ActionListener {
	private Controller c;
	private View v;
    public Adapter(Controller c) {
        this.c = c;
    }

    /**
     * This class is an ActionListener, so it must implement this method. But,
     * it only transforms data and delegates the call.
     */
    public void actionPerformed(ActionEvent e) {
    		if(v.isReset(e))
    			c.setRequest();
    		else {
    			ArrayList<Integer> position = v.getPosition(e);
    			c.setRequest(position);
    		}
    }

    /**
     * Determine the name of the component from which the event came.
     * This is not an ideal solution but good enough for now.
     */
}

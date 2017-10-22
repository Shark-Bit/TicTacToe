package adapter;
import controller.*;
import view.*;
import java.awt.event.*;
import java.util.*;

public class Adapter implements ActionListener {
	private Controller c;
	private View v;
    public Adapter(Controller c, View v) {
        this.c = c;
        this.v = v;
    }

    /**
     * This class is an ActionListener, so it must implement this method.
     */
    public void actionPerformed(ActionEvent e) {
    		if(v.isReset(e))
    			c.setRequest();
    		else {
    			ArrayList<Integer> position = v.getPosition(e);
    			c.setRequest(position);
    		}
    }

}

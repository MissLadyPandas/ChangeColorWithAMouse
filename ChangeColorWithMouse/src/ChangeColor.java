
import javax.swing.*; // imported for gui components 
import java.awt.*; // imported for color and event handling
import java.awt.event.*; // imported for mouse event 

//class
public class ChangeColor { 

    public static void main(String[] args) { 
    	// create java frame object to hold gui components
        JFrame frame = new JFrame("Change Color Using A Mouse");
        
        // creates a basic panel to change background color
        JPanel panel = new JPanel();
        
        // added mouselistener for mouse cicks
        panel.addMouseListener(new MouseAdapter() { 
            @Override
            public void mousePressed(MouseEvent e) { // method for mouse click on panel
                panel.setBackground(Color.BLACK); // click of mouse changes background black
            }

            @Override
            public void mouseReleased(MouseEvent e) { // method for mouse release from mouse click on panel
                panel.setBackground(Color.WHITE); // release of mouse changes reverts color to white
            }
        });
        
        // panel added to frame
        frame.add(panel); 
        
         // size configurations of panel
        frame.setSize(120, 120); // size of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // application exits when close
        frame.setVisible(true); // frame is visible
    }
}

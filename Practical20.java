import java.awt.*;
import java.awt.event.*;

public class Practical20 extends Frame implements MouseMotionListener, MouseListener {
    private Label lblCoordinates, lblMessage;

    public Practical20() {
        setTitle("Mouse Coordinates App");
        setSize(400, 300);
        setLayout(new FlowLayout());
        addMouseListener(this);
        addMouseMotionListener(this);

        lblCoordinates = new Label("Coordinates: ");
        lblMessage = new Label("Message: ");


        add(lblCoordinates);
        add(lblMessage);


        setVisible(true);


        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void mouseMoved(MouseEvent e) {
        updateCoordinates(e);
    }

    public void mouseDragged(MouseEvent e) {
        updateCoordinates(e);
    }

    public void mouseEntered(MouseEvent e) {
        lblMessage.setText("Message: Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        lblMessage.setText("Message: Mouse Exited");
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    private void updateCoordinates(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        lblCoordinates.setText("Coordinates: (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        new Practical20();
    }
}

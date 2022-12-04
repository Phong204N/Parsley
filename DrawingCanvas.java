import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class DrawingCanvas extends JComponent{
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        Node n = new Node('r', false, 100, 100);
        n.drawNode(g2d);
    }
    
}

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class tets extends JComponent{
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        Rectangle2D.Double rec = new Rectangle2D.Double(50,50,100,100);
        g2d.setColor(new Color(20,49,237));
        g2d.setStroke(new BasicStroke(20));
        g2d.draw(rec);
    }
}
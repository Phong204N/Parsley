import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class DrawingCanvas extends JComponent {
    int width;
    int height;

    DrawingCanvas(int width, int height) {
        this.width = width;
        this.height = height;
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Node n = new Node('r', false, (width - 10) / 2, (height - 10) / 2);
        n.drawNode(g2d);
    }

}

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class DrawingCanvas extends JComponent {
    int width;
    int height;
    Node[] nodes;

    DrawingCanvas(int width, int height, Node[] n) {
        this.width = width;
        this.height = height;
        nodes = n;
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        for (Node n : nodes) {
            n.drawNode(g2d);
        }
    }

}

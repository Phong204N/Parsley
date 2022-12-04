import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Canvas {

    public static void newWin(String title, int width, int height){

        TextField t = new TextField(20);
        t.setSize(100, 20);

        JFrame f = new JFrame();
        f.setSize(width, height);
        f.setTitle(title);

        f.add(t);
        DrawingCanvas dc = new DrawingCanvas();
        f.add(dc);

        //f.add(p);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void draw(Graphics g) {
        g.fillOval(50, 50, 100, 100);
    }

    public void drawNode(String title) {

    }

    public void drawArrow() {

    } 

/*
    public static void main(String[] args) {
        
        
    }
*/

}

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Canvas {

    public static void newWin(String title, int width, int height) {

        JFrame f = new JFrame();
        JTextField t = new JTextField(20);
        DrawingCanvas dc = new DrawingCanvas(width, height);
        f.setSize(width, height);
        f.setTitle(title);
        t.setSize(100, 20);
        f.add(t);
        f.add(dc);

        t.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void keyPressed(KeyEvent e) {
                // TODO Auto-generated method stub
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    t.setText("");
                    int dcWidth = dc.width - 100;
                    int dcHeight = dc.height;
                    System.out.println(dc);
                    DrawingCanvas dc = new DrawingCanvas(dcWidth, dcHeight);
                    f.add(dc);
                    f.setVisible(true);
                    System.out.println(dc);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // TODO Auto-generated method stub

            }

        });

        // f.add(p);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void draw(Graphics g) {
        g.fillOval(50, 50, 100, 100);
    }

    /*
     * public static void main(String[] args) {
     * 
     * 
     * }
     */

}
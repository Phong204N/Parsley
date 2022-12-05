
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Canvas {

    public static int marginX = 20;
    public static int marginY = 40;

    public static void newWin(String title, int width, int height) {

        JFrame f = new JFrame();
        JTextField rulePrompt = new JTextField(20);
        JButton addButt = new JButton("Add Rule");
        JButton evalButt = new JButton("Evaluate");
        JTextArea textArea = new JTextArea(10, 20);
        JLabel label = new JLabel("");
        JPanel pmain = new JPanel(new FlowLayout());
        JPanel p = new JPanel(new FlowLayout());
        JPanel p2 = new JPanel(new FlowLayout());
        JPanel p3 = new JPanel(new FlowLayout());
        JPanel p4 = new JPanel(new FlowLayout());

        Node n0 = new Node('X', false, (width - 10) / 2, (height - 10) / 2);
        Node n1 = new Node('Y', false, (width - 50) / 2, (height - 50) / 2);
        Node[] nodes = new Node[2];
        nodes[0] = n0;
        nodes[1] = n1;

        DrawingCanvas dc = new DrawingCanvas(width, height, nodes);
        f.setResizable(false);
        f.setSize(width, height);
        f.setTitle(title);
        rulePrompt.setBounds(marginX, marginY, 200, 20);
        addButt.setBounds(5 + rulePrompt.getWidth() + marginX, marginY, addButt.getPreferredSize().width, 20);
        // textArea.setBounds(marginX, marginY, 200, 20);
        textArea.setLineWrap(true);
        textArea.setEditable(false);
        evalButt.setBounds(marginX, marginY + 40, 100, 20);

        p.add(new JLabel("Parsley"));
        p2.add(rulePrompt);
        p2.add(addButt);
        p3.add(textArea);
        p3.add(evalButt);
        p4.add(label);

        pmain.add(p);
        pmain.add(p2);
        pmain.add(p3);
        pmain.add(p4);
        f.add(pmain);

        // makeButtonInPanel(p4, 'c');
        ProductionSet pSet = new ProductionSet();

        rulePrompt.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void keyPressed(KeyEvent e) {
                // TODO Auto-generated method stub
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    ProductionRule recruit = new ProductionRule(rulePrompt.getText());
                    pSet.addRule(recruit);
                    if (recruit.pass) {
                        textArea.append(recruit.rule + "\n");
                    }
                    rulePrompt.setText("");
                    f.repaint();
                    // dc.repaint();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // TODO Auto-generated method stub

            }

        });

        addButt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ProductionRule recruit = new ProductionRule(rulePrompt.getText());
                pSet.addRule(recruit);
                if (recruit.pass) {
                    textArea.append(recruit.rule + "\n");
                }
                rulePrompt.setText("");
                f.repaint();
                // dc.repaint();
            }
        });

        // f.add(p);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }

    public static void makeButtonInPanel(JPanel p, char c) {
        JButton button = new JButton(String.valueOf(c));
        p.add(button);
    }

    public void draw(Graphics g) {
        // g.fillOval(50, 50, 100, 100);
    }

    /*
     * public static void main(String[] args) {
     * 
     * 
     * }
     */

}
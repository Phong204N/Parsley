import java.awt.*;
import java.awt.geom.*;

public class Node{
    private char value;
    private boolean isVar;
    private Node [] productions; 
    private double x;
    private double y;

    Node(char value, boolean isVar, double x, double y){
        this.value = value;
        this.isVar = isVar;
        this.x = x;
        this.y = y;
    }

    public void addProd(Node n){
        this.productions[productions.length] = n;
    }

    public String toString(){
        String s = "Value: " + value + " isVar: " + isVar + " \nProductions: ";
        for(int i = 0; i < productions.length; i++){
            s += productions[i].value;
        }
        return s;
    }

    public void drawNode(Graphics2D g){
        Rectangle2D.Double rec = new Rectangle2D.Double(x,y,10.0,10.0);
        g.drawString(String.valueOf(value), (int)x,(int) y);
        g.setStroke(new BasicStroke(5));
        g.setColor(Color.BLACK);
        g.draw(rec);
    }
}
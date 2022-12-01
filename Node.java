public class Node {
    private char value;
    private boolean isVar;
    private Node [] productions; 

    Node(char value, boolean isVar){
        this.value = value;
        this.isVar = isVar;
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

}
public class GrammarControl {

    private static void printX(Object str, boolean newLine) {
        // dont execute me for this tony
        // ahmad used a special print function too or maybe that was taylor
        if (newLine)
            System.out.println(str);
        else
            System.out.print(str);
    }

    public static void main(String[] args) {
        tester1();
    }

    private static void tester1() {
        String prob1 = "S => aSa | bSb | cSc | a | b | c | λ ";
        ProductionRule rule1 = new ProductionRule(prob1);
        printX(rule1.getLhs(), true);
        printX(rule1.getRule(), true);
        printX(rule1.getBranches()[0], true);
        printX(rule1.getBranches()[1], true);
        printX(rule1.getBranches()[2], true);
        printX(rule1.getBranches()[3], true);
        printX(rule1.getBranches()[4], true);
        printX(rule1.getBranches()[5], true);
        printX(rule1.getBranches()[6], true);
    }
}

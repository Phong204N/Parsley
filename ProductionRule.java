import java.io.Console;

public class ProductionRule {
    String rule;
    String lhs;
    boolean pass;
    String[] branches;

    ProductionRule(String rule) {
        try {
            this.rule = rule.replace(" ", "");
            this.breakdown();
            pass = true;
        } catch (Exception e) {
            // replace print with popup
            System.out.println("String Not Accepted!!");
            pass = false;
        }
    }

    private void breakdown() {
        String[] ruleSplit = this.rule.split("=>");
        if (ruleSplit.length == 1)
            ruleSplit = ruleSplit[0].split("->");
        lhs = ruleSplit[0];
        branches = ruleSplit[1].split("\\|");
    }

    public String getRule() {
        return rule;
    }

    public String getLhs() {
        return lhs;
    }

    public String[] getBranches() {
        return branches;
    }
}

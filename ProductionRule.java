import java.util.ArrayList;

public class ProductionRule {
    String rule;
    String lhs;

    //ArrayList<String> branches = new ArrayList<>();
    String [] branches;

    ProductionRule(String rule){
        this.rule = rule.replace(" ", "");
        this.breakdown();
    }

    private void breakdown(){
        String [] ruleSplit = this.rule.split("=>");
        lhs = ruleSplit[0];
        branches = ruleSplit[1].split("\\|");
    }

    public String getRule(){
        return rule;
    }
    public String getLhs(){
        return lhs;
    }
    public String[] getBranches(){
        return branches;
    }
}

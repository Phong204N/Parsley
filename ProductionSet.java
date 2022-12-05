import java.util.ArrayList;

public class ProductionSet {
    private ArrayList<ProductionRule> proSet;

    ProductionSet() {
        proSet = new ArrayList<>();
    }

    public void addRule(ProductionRule recruit) {
        proSet.add(recruit);
    }

    public ArrayList<ProductionRule> getSet() {
        return proSet;
    }
}
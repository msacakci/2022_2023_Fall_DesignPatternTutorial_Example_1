import java.util.ArrayList;

public class CalculationGroup extends CalculationComponent{
    private ArrayList<CalculationComponent> list;

    CalculationGroup() {
        list = new ArrayList();
    }

    public void addComponent(CalculationComponent calculationComponent) {
        list.add(calculationComponent);
    }

    public int compute() {
        int result = 0;

        for(int index = 0; index < list.size(); index++) {
            result = result + list.get(index).compute();
        }

        return result;
    }
}
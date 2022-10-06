import java.util.ArrayList;

public class CalculationGroup {
    private ArrayList list;

    CalculationGroup() {
        list = new ArrayList();
    }

    public void addComponent(Object object) {
        list.add(object);
    }

    public int compute() {
        int result = 0;

        for(int index = 0; index < list.size(); index++) {
            result = result + list.compute(); // Compiler will not except this line!
        }

        return result;
    }
}
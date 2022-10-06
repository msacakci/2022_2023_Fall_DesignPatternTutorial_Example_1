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
            if(list.get(index).getClass() == Summation.class) {
                result = result + ((Summation) list.get(index)).compute();
            }
            else if(list.get(index).getClass() == Subtraction.class) {
                result = result + ((Subtraction) list.get(index)).compute();
            }
        }

        return result;
    }
}
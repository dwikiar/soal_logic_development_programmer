package ArraySorting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraySorting {
    public static void main (String[] args) {
        Object[] arrayString = {12, 9, 30, "A", "M", 99, 82, "J", "N", "B"};

        List<String> alphabets = new ArrayList<> ();
        List<Integer> numbers = new ArrayList<> ();

        for (Object element : arrayString) {
            if (element instanceof String) {
                alphabets.add((String) element);
            }else if (element instanceof Integer) {
                numbers.add((Integer) element);
            }
        }

        Collections.sort(alphabets);
        Collections.sort(numbers);

        List<Object> sortedArray = new ArrayList<> ();
        sortedArray.addAll(alphabets);
        sortedArray.addAll(numbers);

        System.out.println(sortedArray);
    }
}
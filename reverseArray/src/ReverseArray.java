import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArray {




    public static List<Integer> reverseArray(List<Integer> a) {
        List<Integer> returningArray = new ArrayList<>();
        for (int i = a.size()-1; i >= 0; i--){
            returningArray.add(a.get(i));

        }
        return returningArray;
    }


    public static void main(String[] args) {
        List<Integer> testArray = Arrays.asList(1, 2, 3, 4);
        reverseArray(testArray);

    }
}

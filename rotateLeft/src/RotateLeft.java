import java.util.ArrayList;
import java.util.List;







public class RotateLeft {


    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        int theSize = arr.size();
        int difference = theSize - d;

        List<Integer> returningArray = new ArrayList<>(arr);

        for (int i = 0; i < arr.size(); i++) {
            int newIndex = 0;
            if (i - d <0) {
                newIndex = difference + i;
            }
            else {
                newIndex = i - d;
            }

            returningArray.set(newIndex, arr.get(i));
        }


        return returningArray;

    }


    public static void main(String[] args) {

    }
}

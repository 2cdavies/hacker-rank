import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class hourGlassCalculator {



    public static int hourglassSum(List<List<Integer>> arr) {
        int currentValue = 0;
        int highestValue =  -2147483648;

        for (int i = 0 ; i < arr.size()-2; i++){
            for (int j = 0; j < arr.get(i).size() - 2; j++) {
                int valOne = arr.get(i).get(j);
                int valTwo = arr.get(i).get(j+1);
                int valThree = arr.get(i).get(j+2);
                int valFour = arr.get(i+1).get(j+1);
                int valFive = arr.get(i+2).get(j);
                int valSix = arr.get(i+2).get(j+1);
                int valSeven = arr.get(i+2).get(j+2);
                currentValue = valOne + valTwo + valThree + valFour + valFive + valSix + valSeven;
                if (currentValue > highestValue) {
                    highestValue = currentValue;
                }

            }

        }
        return highestValue;

    }


    public static void main(String[] args) {

    }

}

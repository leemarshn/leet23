import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SpiralOrder {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6}, {7,8,9}};

        spiral(array);
    }

    static List<Integer> spiral(int[][] array){
        List<Integer> spiralNumbers = new ArrayList<>();

        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                spiralNumbers.add(ints[j]);
            }


        }


        return spiralNumbers;
    }
}

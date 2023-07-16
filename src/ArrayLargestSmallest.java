import java.lang.reflect.Array;

public class ArrayLargestSmallest {

    public static void main(String[] args) {
        int [] array = {888,2,3,487,5,6,7,87978,9,88};
        for (int arr: get_largest_smallest(array)) {
            System.out.println(arr);

        }
    }

   static int [] get_largest_smallest(int[] array){
       int[]  largest_smallest = new int[2];
       int largest = 0, smallest =array[0];
        for (int i=0; i<array.length; i++){
            if (array[i] > largest) {
                largest = array[i];
            } else if (array[i] < smallest) {
                smallest = array[i];
            }
        }
       largest_smallest[0] = largest;
       largest_smallest[1] = smallest;
       return largest_smallest;
    }
}

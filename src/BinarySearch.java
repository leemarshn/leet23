public class BinarySearch {
    public static void main(String[] args) {
        int [] array = {1,888,2,3,-12, 487,5,6,7,8797, 10, -11, 8,9,88,1,2,-556};
        sortedArray(array);
//        for (int arr: array) {
//            System.out.println(arr);
//
//        }
        System.out.println(binarySearch(array, 487));
    }

    static void sortedArray(int[] array){
        for (int i=0; i<array.length;i++){
            for (int j =0; j<array.length; j++){
                int temp;
                if (array[i]<array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

   static int binarySearch(int [] array, int target){
        int mid;
        int low =0;
        int high = array.length - 1;

        while (low<=high){
            mid = (low + high)/2;
            if (array[mid]==target){
                return mid;
            }else if (array[mid] < target){
                low = mid + 1;
            } else { high = mid -1;}
        }

        return -1;
    }

}

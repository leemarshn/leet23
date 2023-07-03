public class SimpleSort {
    public static void main(String[] args) {
        int[] array = {204552, 54, 87, 65, 23};
        int[] sortedArray = new int[array.length];
        int temp;

        for(int i=0; i<array.length; i++){

            for (int j=0; j<i; j++){
                temp = array[i];
                if (array[i]<=temp){
                    break  ;
                } else if (array[i]>=array[j]) {
//                    array[i] = array[j];
                    temp = array[j];
                    array[i]=temp;

                }
                System.out.println(temp);

            }

        }
    }
}

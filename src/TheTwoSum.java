/**
 * Created by Lee N on 22, Fri,Sep,2023.
 */


public class TheTwoSum {

   int[] get_two_indices(int[] num, int target){
       for (int i=0; i<num.length; i++){
           for (int k = i+1; k<num.length; k++){
               if (num[i]+num[k] == target){
                   return new int[]{i,k};
               }
           }
       }

      return new int[]{};
    }


}

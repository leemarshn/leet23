import java.util.HashSet;

public class HappyNumber {


    public static void main(String[] args) {
        int num  = 19;
//        System.out.println(splitNum(num));
        System.out.println(isHappy(num));
    }

    static int splitNum(int num){
        int sum=0, mod, sqMod;
        while (num>=1){
//            System.out.println(num);
                mod = num %10;
                sqMod = mod * mod;
                sum +=sqMod;
                num = (num /10) -((num%10)/10);
            }
            return sum;
    }

       static boolean isHappy(int num){
        if(num ==1)
            return true;

           HashSet<Integer> set = new HashSet<>();

        int newNum = num;
            while (newNum !=1){
                newNum = splitNum(newNum);
                if (newNum==1)
                    break;
                if (!set.add(newNum))
                    return false;
            }
            return true;
        }



}

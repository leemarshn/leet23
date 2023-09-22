
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;


/**
 * Created by Lee N on 22, Fri,Sep,2023.
 */
public class MyTests {


    @org.junit.jupiter.api.Test
    void get_two_indices() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0,1};

        TheTwoSum twoSum = new TheTwoSum();

        int[] results = twoSum.get_two_indices(nums,target);

        Arrays.sort(results);

        Assertions.assertArrayEquals(expected, results);


    }

    @org.junit.jupiter.api.Test
    public void testTwoSum_NoSolution() {
        int[] nums = {3, 6, 8, 12};
        int target = 5;
        int[] expected = {}; // No solution
        TheTwoSum twoSum = new TheTwoSum();

        int[] result = twoSum.get_two_indices(nums, target);
        Assertions.assertArrayEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    public void testTwoSum_DuplicateValues() {
        int[] nums = {3, 3, 2, 4};
        int target = 6;
        int[] expected = {0, 1}; // Indices of the first pair that sums to 6
        TheTwoSum twoSum = new TheTwoSum();

        int[] result = twoSum.get_two_indices(nums, target);
        Assertions.assertArrayEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    public void testTwoSum_NegativeNumbers() {
        int[] nums = {-1, -2, -3, -4, -5};
        int target = -8;
        int[] expected = {2, 4}; // Indices of elements -3 and -5
        TheTwoSum twoSum = new TheTwoSum();

        int[] result = twoSum.get_two_indices(nums, target);
        Assertions.assertArrayEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    public void testTwoSum_LargeArray() {
        int[] nums = {1000, 2000, 3000, 4000, 5000, 6000, 7000};
        int target = 9000;
        int[] expected = {3, 4}; // Indices of elements 3000 and 4000
        TheTwoSum twoSum = new TheTwoSum();

        int[] result = twoSum.get_two_indices(nums, target);

        Arrays.sort(result);

        boolean isValid = Arrays.equals(result, new int[]{1,6}) || Arrays.equals(result, new int[]{3,4});
        Assertions.assertTrue(isValid);


    }
}

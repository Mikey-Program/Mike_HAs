package src.exercise4.A1;

public class WrapperTask {

    public static void main(String[] args) {
        char[] values = {'1', 'a', '3', 'z', '9'};
        int[] nums = {10, 0, -4, 20, 5};

        // You can call your methods here and print results
        // Example:
        // System.out.println(countDigitsPrimitive(values));
    }

    // Task A: Count digits using only primitives (e.g., ASCII comparison)
    public static int countDigitsPrimitive(char[] values) {
        // TODO: Implement using primitive logic
        int count = 0;
        for(int i = 0; i< values.length; i++){
            if(values[i] >= '0' && values[i] >= '9'){
                count++;
            }
        }
        return count;
    }

    // Task B: Count digits using Character.isDigit()
    public static int countDigitsWrapper(char[] values) {
        // TODO: Implement using wrapper method

        int count = 0;
        for(int i = 0; i< values.length; i++){
            if(Character.isDigit(values[i])){
                count++;
            }
        }
        return count;
    }

    // Task C: Find max using only primitives
    public static int maxPrimitive(int[] nums) {
        // TODO: Implement using primitive comparison
        int max=nums[0];
        for(int i = 1; i< nums.length; i++){
            if(max < nums[i] ){
                max=nums[i];
            }
        }
        return max;
    }

    // Task D: Find max using Integer.compare()
    public static int maxWithWrapper(int[] nums) {
        // TODO: Implement using wrapper comparison
        return 0;
    }
}

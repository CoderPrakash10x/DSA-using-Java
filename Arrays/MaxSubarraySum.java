public class MaxSubarraySum {
     public static int subarray(int num[]){
        int maxSum = Integer.MIN_VALUE;
        for(int start = 0; start < num.length; start ++){
            for(int end = start; end < num.length ; end ++){
                int currsum = 0;
                for(int k = start ; k <= end; k++){
                  currsum +=num[k];
                  if(currsum > maxSum){
                    maxSum = currsum;
                  }
                }
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int num[] = {2,-3,4,5};
        System.out.println("Max Subarray Sum: " + subarray(num));
    }
    
}

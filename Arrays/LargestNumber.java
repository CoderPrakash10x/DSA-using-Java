public class LargestNumber {
    public static int largestnumber(int num[]){
        int MaxValue = Integer.MIN_VALUE;
        for(int i = 0; i<num.length;i++){
            if(MaxValue < num[i]){
                MaxValue = num[i] ;
            }
        }
        return MaxValue;
    }
    public static void main(String[] args) {
        int num[] = {2,222,4,5,6,7,8,9,0,1000};
        System.out.println(largestnumber(num));
    }
}

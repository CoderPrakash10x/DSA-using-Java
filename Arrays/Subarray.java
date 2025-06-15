public class Subarray {
    public static void subarray(int num[]){
        for(int start = 0; start < num.length; start ++){
            for(int end = start; end < num.length ; end ++){
                for(int k = start ; k <= end; k++){
                   System.out.print( num[k] );
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int num[] = {2,3,4,5};
        subarray(num);
    }
    
}

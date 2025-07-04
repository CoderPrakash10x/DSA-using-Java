public class BinarySearch {
    public static int binarysearch(int arr[]){
        int key =118;
        int start = 0;
        int end = arr.length -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if(arr[mid] == key){
                return mid;
            }else if(arr[mid] < key){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14,16,18};
        System.out.println("Key found on index :" + binarysearch(arr));
    }
}

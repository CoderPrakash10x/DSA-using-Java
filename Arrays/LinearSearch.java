class LinearSearch{
    public static int Linearsearch(int arr[]){
        int key = 23;
        for (int i = 0; i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,7,4,9,34,34,4,23};
        int result = Linearsearch(arr);
        System.out.println(result);
    }
}
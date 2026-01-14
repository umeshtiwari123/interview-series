public class LeftRotateByDPlaces {

    static void reverse(int[] arr, int start, int end){

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void leftRotation(int[] arr, int n, int k){

        reverse(arr, 0 , k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        int n = 7;

        int k = 2;
//         k = k%n;
        leftRotation(arr,n,k);
        // rightRotation(arr,n,n-k);
        for(int print : arr)
        {
            System.out.print(print+" ");
        }
    }
}

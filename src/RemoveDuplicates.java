public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = {1,2,2,3,3,3,4};

        int k = removeDuplicates(arr);

        for(int i = 0; i< k; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static int removeDuplicates(int[] arr){
        int n = arr.length;
        if(n<=1)
            return n;

        int index= 1;
        for(int i = 1; i< n ; i++){
            if(arr[i]!=arr[i-1]){
                arr[index++] = arr[i];
            }
        }
        return index;
    }
}

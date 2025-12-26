import java.util.Arrays;

public class BUBBLE {
    public static void main(String[] args) {
        int[] arr={-1862,-584,25,849,65,95,192229};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        int max=arr[arr.length-1];
        for (int i = 0; i <arr.length-1 ; i++) {
            int maxi=i;
            for (int j = i+1; j <arr.length ; j++) {
            if (arr[j]<arr[maxi]){
                maxi=j;
            }
            }
            int temp=arr[i];
            arr[i]=arr[maxi];
            arr[maxi]=temp;

//            if (arr[i]>arr[max]){
//                int temp=arr[i];
//                arr[i]=arr[max];
//                arr[max]=temp;
//            }
        }
    }
//    static void Bubble(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 1; j <arr.length-i; j++) {
//                if (arr[j]<arr[j-1]){
//                    int temp= arr[j];
//                    arr[j]=arr[j-1];
//                    arr[j-1]=temp;
//                }
//            }
//        }
//
//
//    }
}

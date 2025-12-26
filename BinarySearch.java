public class BinarySearch {
    public static void main(String[] args) {
    int[] arr={-20,-15,-7,-3,0,2,6,7,9,10,18,26,34,49,56,67,78,89,90,185,248,940};
    int target=0;
    int ans= binarry(arr,target);
        System.out.println(ans);
    }
    static int binarry(int[] arr,int target){
        int start=0;
        int end= arr.length-1;
        while (start<=end){
            int mid=start+(end-start) /2;
            if (target>arr[mid]){
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int[] nums={116,985,96,23,260,996,04};
        int target=in.nextInt();
        System.out.println(Linearsearch(nums,target));
    }

    static int Linearsearch(int[] arr ,int target){
        if (arr.length==0){
            return -1;

        }
        for (int index = 0; index < arr.length; index++) {
            int e=arr[index];
        if (e==target){
            return index;
        }
        }
        return -1;
    }
}

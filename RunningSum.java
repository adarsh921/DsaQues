import java.util.*;
public class RunningSum {
    static void prefixSum(int[]arr){
        int l=arr.length;
        int i,j,s=0;
        for(i=0;i<l;i++){
            for(j=0;j<=i;j++){
                s=s+arr[j];

            }
           System.out.println(s);
            s=0;
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int arr[] = new int[5],i;
        System.out.println("Enter Elements");
        for(i=0;i<5;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Prefix Sum array");
          prefixSum(arr);
    }
}

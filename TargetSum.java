import java.util.*;
public class TargetSum {
    static int PairSum(int arr[], int target){
        int n=arr.length;
        int i,j,ans=0;   // ans count the number of pairs that give sum is equal to target.
        for(i=0;i<n;i++){
            for(j=(i+1);j<n;j++){
                if(arr[i]+arr[j]==target)
                ans++;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n,target,i;
        System.out.println("Enter Size of array");
        n=in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements");
        for(i=0;i<n;i++)
        arr[i]=in.nextInt();
        System.out.println("Enter Target Sum");
        target=in.nextInt();
        System.out.println(PairSum(arr,target));

    }
    
}

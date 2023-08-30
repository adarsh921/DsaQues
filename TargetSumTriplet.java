import java.util.*;
public class TargetSumTriplet {
    static int TripletSum(int [] arr, int target){
        int n=arr.length;
        int i,j,k,ans=0;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                for(k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==target)
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n,target;
        System.out.println("Enter Size of array");
        n=in.nextInt();
        int arr[]=new int[n],i;
        System.out.println("Enter Elements");
        for(i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Enter target sum");
        target=in.nextInt();
        System.out.println(TripletSum(arr,target));


    }
    
}

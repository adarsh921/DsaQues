import java.util.Arrays;
import java.util.Scanner;
public class KthLargeKthSmall {
    static void KthLargestKthSmallest(int arr[], int k){
        int kl=0,ks=0,l=0;
        Arrays.sort(arr);
        l=arr.length;
        kl=arr[l-k];
        ks=arr[k-1];
        System.out.println(k+"nd largest element="+kl);
        System.out.println(k+"nd smallest element="+ks);

        }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int arr[] = new int[5],i,k=0;
        System.out.println("Enter Elements");
        for(i=0;i<5;i++)
        arr[i]=in.nextInt();
        System.out.println("Enter the value of k for kth largest and kth smallest");
        k=in.nextInt();
        KthLargestKthSmallest(arr,k);

    }
    
}

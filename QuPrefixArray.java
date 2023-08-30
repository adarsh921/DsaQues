import java.util.*;
public class QuPrefixArray {
    static int[] makePrefixSumArray(int []arr){
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size");
        int n=in.nextInt();
        int []arr = new int[n+1]; //array ka indexing to zero se hee shuru hoga par humlog access usko "1" se karenge isliye ek space extra liye.
        System.out.println("Enter Elements");
        for(int i=1;i<=n;i++){
            arr[i]=in.nextInt();
        }
        int []prefSum = makePrefixSumArray(arr);
        System.out.println("Enter no. of queries");
        int q=in.nextInt();
        while(q-->0){
            System.out.println("Enter range");
            int l=in.nextInt();
            int r=in.nextInt();
            int ans = prefSum[r]-prefSum[l-1];
            System.out.println("Sum="+ans);
        }

    }
    
}
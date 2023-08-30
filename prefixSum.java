// USING AN ADDITIONAL ARRAY


import java.util.*;
public class prefixSum {
  static int[] PrefixSum(int []arr){
    int n=arr.length;
    int pref[]=new int[n];
    pref[0]=arr[0];
    for(int i=1;i<n;i++){
        pref[i]=pref[i-1]+arr[i];
    }
    return pref;
  }
  static void printarray(int ar[]){
    int n=ar.length;
    for(int i=0;i<n;i++){
        System.out.print(ar[i]+ " ");
    }
}
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter length of array");
    int len=in.nextInt();
    int a[] = new int[len];
    System.out.println("Enter Elements");
    for(int i=0;i<len;i++){
        a[i]=in.nextInt();
    }
    int arr[]= PrefixSum(a);
    printarray(arr);


  }
    
}

import java.util.*;
public class evenOddtwopointers{
static void swapEven_odd(int arr[]){
    int n=arr.length;
    int l=0;
    int r=(n-1);
    while(l<r){
        if(arr[l]%2!=0 && arr[r]%2==0){
            swapUpointer.swap(arr,l,r);
            l++;
            r--;
        }
        if(arr[l]%2==0)
        l++;
        if(arr[r]%2!=0)
        r--;

    }
}
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int arr[] = new int[10],i;
        System.out.println("Enter Elements");
        for(i=0;i<10;i++)
        arr[i]=in.nextInt();
        swapEven_odd(arr);
        System.out.println("After Sorting:");
        swapUpointer.printarray(arr);

    }

}

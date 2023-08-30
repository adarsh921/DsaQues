import java.util.*;
public class CheckSortArray {
    static void check(int arr[]){
        int i,count=0;
        for(i=0;i<(arr.length-1);i++){
            if(arr[i]<arr[i+1])
            count++;
        }
        if(count==(arr.length-1))
        System.out.println("Array is sorted");
        else
        System.out.println("Array is not sorted");
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int arr[]=new int[5],i;
        System.out.println("Enter Elements");
        for(i=0;i<5;i++)
        arr[i]=in.nextInt();
        check(arr);
    }    
}

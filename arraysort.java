import java.util.Arrays;
import java.util.Scanner;
public class arraysort {
    static void sort(int arr[]){
        int i;
        Arrays.sort(arr);
        for(i=0;i<arr.length;i++)
        System.out.println(arr[i]);
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int arr[]=new int[5],i;
        System.out.println("Enter Elements");
        for(i=0;i<5;i++)
        arr[i]=in.nextInt();
        sort(arr);
    }
    
}

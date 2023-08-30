import java.util.*;
public class countx {
     static int count(int arr[], int x){
        int count=0,i;
        for(i=0;i<arr.length;i++){
            if(arr[i]==x)
            count++;
        }
        return count;
     }
     public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int i;
        System.out.println("Enter size of array");
        int n= in.nextInt();
        int []arr = new int[n];
        System.out.println("Enter"+n+"Elements");
        for(i=0;i<arr.length;i++)
        arr[i]=in.nextInt();
        System.out.println("Enter x");
        int x=in.nextInt();
        System.out.println("Count of x="+ count(arr,x));
     }

    
}

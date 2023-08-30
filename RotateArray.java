import java.util.*;
public class RotateArray {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int l,a=0,b=0,i,k;
        System.out.println("Enter Length");
        l=in.nextInt();
        int arr[] = new int[l];
        int arr2[] = new int[l];
        System.out.println("Enter Elements");
        for(i=0;i<l;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Enter number of steps");
        k=in.nextInt();
        k=k%l;
        for(i=(l-k);i<l;i++){
            arr2[b]=arr[i];
            b++;
        }
        for(i=b;i<l;i++){
            arr2[i]=arr[a];
            a++;
        }
        System.out.println("Rotated Array");
        for(i=0;i<l;i++){
            System.out.println(arr2[i]);
        }
    }
    
}

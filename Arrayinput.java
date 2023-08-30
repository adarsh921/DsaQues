import java.util.*;
class Arrayinput{
    
    static void printArray(int[] arr) // since kaafi baar print karne ka zarorat padh raha hai isliye isko ek method mai dal dete hai,aur jab array print karna hoga iss method ko call kardenge!
        {
            int i,n;
            for (i=0;i < arr.length;i++){
                System.out.println(arr[i]+" ");
            }
        }
    public static void main(String args[]){
        
        Scanner in = new Scanner(System.in);
        int arr[] = new int[5];
    int i,n;
        System.out.println("Enter size of array");
        n=in.nextInt();
        System.out.println("Enter" + n + "Elements");
        for(i=0;i<n;i++)
        arr[i]=in.nextInt();
        System.out.println("Original Array");
        printArray(arr); // yaha printArray method ka use kiye array print karne ke liye.

        int arr_2[] = arr; // trying to copy elements of arr to arr_2
        System.out.println("Copied Array");
        printArray(arr_2);
    }

}
    

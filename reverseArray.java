import java.util.*;
class reverseArray{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n,i,temp=0;
        System.out.println("Enter n");
        n=in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements");
        for(i=0;i<n;i++)
        arr[i]=in.nextInt();
        System.out.println("Original Array");
        for(i=0;i<n;i++)
        System.out.print(arr[i]);
        System.out.print("\n");
        for(i=0;i<(n/2);i++){
            temp=arr[i];
            arr[i]=arr[n-(i+1)];
            arr[n-(i+1)]=temp;
            }
        System.out.println("Reversed array\n");
        for(i=0;i<n;i++)
        System.out.print(arr[i]);

    }
}
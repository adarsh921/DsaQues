import java.util.*;
public class swapUpointer {
     static void swap(int arr[], int left ,int right)
    {
        int temp= arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
    static void swap_zeroes_and_ones(int arr[])
    {
        int n=arr.length, left=0,right=n-1;
        while(left<right)
        {
            if(arr[left]==1 && arr[right]==0)
            {
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]==0)
            left++;
            if(arr[right]==1)
            right--;
        }

        }
        

    static void printarray(int [] arr)
    {
        int n=arr.length;
        int i;
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[10],i;
        System.out.println("Enter Elements");
        for(i=0;i<10;i++)
        {
            arr[i]=in.nextInt();
        }
        swap_zeroes_and_ones(arr);
        System.out.println("After Sorting");
        printarray(arr);


    }

    
}

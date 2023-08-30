import java.util.*;
public class ArrayPalindrome {
    static int mergeOperations(int arr[]){
        int l=arr.length;
        int first=0,last=l-1,i,counter=0;
        if(arr[first]==arr[last]){
            return l-3;
        }
        for(i=0;i<l-1;i++){
            if(last==first)
            return counter+1;
            if(arr[first]==arr[last])
            return counter;
            else{
                arr[first+1]=arr[first+1]+arr[first];
                first++;
                counter++;
            }
        }
        return counter;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n=in.nextInt();
        int arr1[]=new int[n],i,result=0;
        System.out.println("Enter Elements");
        for(i=0;i<n;i++){
            arr1[i]=in.nextInt();
        }
        result=mergeOperations(arr1);
        System.out.println(result);
    }
    
}

import java.util.*;
public class sortsquares {
    static int[] sortSquares(int []arr){
        int ans[]=new int[6],n;
        n=arr.length;
        int left=0,right=(n-1),k=n-1;
        while(left<=right){
            if(Math.abs(arr[left])<Math.abs(arr[right])){
                ans[k--]=arr[right]*arr[right];
                right--;
            }
            else{
                ans[k--]=arr[left]*arr[left];
                left++;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int arr[]=new int[6],i;
        System.out.println("Enter Elements");
        for(i=0;i<6;i++){
            arr[i]=in.nextInt();
        }
        int ans[]= sortSquares(arr);
        System.out.println("After Sorting");
        swapUpointer.printarray(ans);
    }
    
}

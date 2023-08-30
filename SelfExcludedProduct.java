import java.util.*;
public class SelfExcludedProduct {
    static int[] Product(int A[]){
        int n=A.length;
        int ans[]=new int[n],i,zero=0,p=1;
        for(i=0;i<n;i++){
            if(A[i]!=0)
            p=p*A[i];
            else
            zero++;
        }
        if(zero==0)
        for(i=0;i<n;i++){
            ans[i]=p/A[i];
        }
        if(zero==1)
        for(i=0;i<n;i++){
            if(A[i]==0)
            ans[i]=p;
            else
            ans[i]=0;
        }
        if(zero>1)
        for(i=0;i<n;i++){
            ans[i]=0;
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n,i;
        System.out.println("Enter length of array");
        n=in.nextInt();
        int A1[]=new int[n];
        System.out.println("Enter Elements");
        for(i=0;i<n;i++){
            A1[i]=in.nextInt();
        }
        int answer[]=Product(A1);
        for(i=0;i<n;i++){
            System.out.println(answer[i]);
        }

    }
    
}

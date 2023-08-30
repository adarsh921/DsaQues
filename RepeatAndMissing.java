import java.util.*;
public class RepeatAndMissing {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        int ans[] = new int[2];
        int i,a=0,b=0,num=1;
        Arrays.sort(A);
        for(i=0;i<(A.length-1);i++){
            if(A[i]==A[i+1]){
            ans[0]=A[i];
            break;
            }
            
        }
        for(i=0;i<A.length;i++){
            if(num!=A[i]){
                ans[1]=num;
                break;
            }
            num++;
             }
             return ans;
        }
          
   
    public static void main(String args[]){
            Scanner in = new Scanner(System.in);
            int i,n;
            System.out.println("Enter n");
            n=in.nextInt();
            int A1[] = new int[n];
            System.out.println("Enter Elements in array");
            for(i=0;i<n;i++){
                A1[i]=in.nextInt();
            }
            RepeatAndMissing obj = new RepeatAndMissing();
            int answer[] = obj.repeatedNumber(A1);
            for(i=0;i<2;i++){
                System.out.println(answer[i]);
            }
}
}


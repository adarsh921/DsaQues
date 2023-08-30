import java.util.*;
public class PascalTriangle {
    static int[][] pascal(int n){
        int ans[][]=new int[n][];
        int i,j;
        for(i=0;i<n;i++){
            ans[i]=new int[i+1];
        ans[i][0]=ans[i][i]=1;
        for(j=1;j<i;j++){
            ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
        }
    }
        return ans;

    }
    static void printmatrix(int mat[][], int n){
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<(i+1);j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n1;
        System.out.println("Enter no of rows for pascal triangle");
        n1=in.nextInt();
        int pascal[][]=pascal(n1);
        printmatrix(pascal,n1);
    }
    
}

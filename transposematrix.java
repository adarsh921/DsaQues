import java.util.*;
public class transposematrix {
    static int[][] transposeInplace(int mat[][]){
        int i,j,temp=0;
        for(i=0;i<3;i++){
            for(j=i;j<3;j++){
                temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        return mat;
    }
    static void printmatrix(int mat[][]){
        int i,j;
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int matori[][]=new int[3][3],i,j;
        System.out.println("Enter Elements");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                matori[i][j]=in.nextInt();
            }
            System.out.println(" ");
        }
        System.out.println("Original matrix");
        printmatrix(matori);
        System.out.println("Transpose matrix");
        int Final[][] = transposeInplace(matori);
        printmatrix(Final);
    }
    
}

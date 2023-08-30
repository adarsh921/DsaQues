import java.util.*;
public class reversematrix {
    static int[][] reverse(int mat[][]){
        int i,j,temp=0;
        for(i=0;i<3;i++){
            for(j=0;j<(3/2);j++){
                temp=mat[i][j];
                mat[i][j]=mat[i][(3-1)+j];
                mat[i][(3-1)+j]=temp;

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
        int matori[][]=new int[3][3];
        int i,j;
        System.out.println("Enter Elements");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                matori[i][j]=in.nextInt();
            }
        }
        System.out.println("Original Matrix");
        printmatrix(matori);
        System.out.println("Reversed matrix");
        int revmat[][]=reverse(matori);
        printmatrix(revmat);
    }
    
}

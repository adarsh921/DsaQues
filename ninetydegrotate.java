import java.util.*;
public class ninetydegrotate {
    static void transpose(int mat[][]){
        int i,j,temp=0;
        for(i=0;i<3;i++){
            for(j=i;j<3;j++){
                temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
        
    }
    
}

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
    static void reverse(int arr[]){
        int i,temp;
        for(i=0;i<3/2;i++){
            temp=arr[i];
            arr[i]=arr[(3-1)+i];
            arr[(3-1)+i]=temp;
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
        System.out.println("Original matrix");
        printmatrix(matori);
        System.out.println("90degree Rotated matrix");
        transpose(matori);
        for(i=0;i<3;i++){
            reverse(matori[i]);
        }
        printmatrix(matori);

    }
}
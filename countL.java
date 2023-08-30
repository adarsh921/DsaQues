import java.util.*;
public class countL {
    static int countLast(int arr[],int x){
        int i,k=0;
        for(i=0;i<arr.length;i++){
            if(arr[i]==x)
            k=i;
        }
        return k;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int arr[] = new int[5],i,x,k=0;
        System.out.println("Enter array Elements");
        for(i=0;i<5;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Enter Element");
        x=in.nextInt();
        k=countLast(arr,x);
        System.out.println("Last Occurence of x:"+k );
    }

    
}

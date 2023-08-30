import java.util.*;
public class Sgreat {
    static int countg(int grr[], int x){
        int i,count=0;
        for(i=0;i<grr.length;i++){
            if(grr[i]>x)
            count++;
        }
        return count;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int grr[] = new int[5],i,x,k=0;
        System.out.println("Enter elements");
        for(i=0;i<5;i++){
            grr[i]=in.nextInt();
        }
        System.out.println("Enter Element");
        x=in.nextInt();
        k= countg(grr,x);
        System.out.println("Number of Elements greater than" +" " +x+" " + "are"+" " +k);
    }
    
}

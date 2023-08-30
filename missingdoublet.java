import java.util.*;
public class missingdoublet {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int i,a=0,b=0,num=1;
        boolean flag=false;
        Collections.sort(A);
        for(i=0;i<(A.size()-1);i++){
            if(A.get(i)==A.get(i+1)){
            flag=true;
            a=i;
            break;
            }
            
        }
        if(flag==true)
        ans.add(A.get(a));
        flag=false;
        for(i=0;i<A.size();i++){
            if(num!=A.get(i)){
                flag=true;
                b=i;
                break;
            }
            num++;
        }
        if(flag==true)
        ans.add(A.get(b));
        return ans;   
    }
    public static void main(String args[]){
            Scanner in = new Scanner(System.in);
            ArrayList<Integer> A1 = new ArrayList<Integer>();
            int i,n;
            System.out.println("Enter no of elements you want to enter");
            n=in.nextInt();
            System.out.println("Enter Elements");
            for(i=0;i<n;i++){
                A1.add(in.nextInt());
            }
            missingdoublet obj = new missingdoublet();
            ArrayList<Integer> answer = obj.repeatedNumber(A1);
            for(i=0;i<2;i++){
                System.out.println(answer.get(i));
            }
}
}


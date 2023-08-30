import java.util.*;
public class EquiSum {
    static int ArraySum(int []arr){
        int totalSum=0;
        int n =arr.length;
        for(int i=0;i<n;i++){
            totalSum=totalSum+arr[i];
        }
        return totalSum;
    }
    static boolean equalSumPartition(int []arr){
        int totalSum=ArraySum(arr);
        int prefSum=0;
        for(int i=0;i<arr.length;i++){
            prefSum=prefSum+arr[i];
            int suffixSum=totalSum-prefSum;
            if(suffixSum==prefSum)
            return true;
        }
        return false;
    }
    
}

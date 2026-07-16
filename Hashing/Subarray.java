import java.util.*;

public class Subarray {

    public static int subarraySumEqualsK(int[] arr,int k){

        HashMap<Integer,Integer> map=new HashMap<>();

        map.put(0,1);

        int sum=0;
        int ans=0;

        for(int num:arr){

            sum+=num;

            ans+=map.getOrDefault(sum-k,0);

            map.put(sum,map.getOrDefault(sum,0)+1);
        }

        return ans;
    }

    public static void main(String[] args){

        int[] arr={1,1,1};

        System.out.println(subarraySumEqualsK(arr,2));
    }
}
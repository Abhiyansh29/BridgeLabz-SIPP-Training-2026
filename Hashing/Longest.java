import java.util.*;

public class Longest {

    public static int longestConsecutiveRun(int[] nums){

        HashSet<Integer> set=new HashSet<>();

        for(int num:nums)
            set.add(num);

        int longest=0;

        for(int num:set){

            if(!set.contains(num-1)){

                int current=num;
                int len=1;

                while(set.contains(current+1)){
                    current++;
                    len++;
                }

                longest=Math.max(longest,len);
            }
        }

        return longest;
    }

    public static void main(String[] args){

        int[] arr={100,4,200,1,3,2};

        System.out.println(longestConsecutiveRun(arr));
    }
}
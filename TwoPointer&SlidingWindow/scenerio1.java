public class scenerio1 {
    public static void main(String[] args) {
        int arr[]={1,2,7,11};
        int target=9;
        int [] a=pairSum(arr,target);
        System.out.println(a[0]);
        System.out.println(a[1]);

    }
    public static int[] pairSum(int arr[], int target){

    int left=0;
    int right=arr.length-1;

    while(left<right){

        int sum=arr[left]+arr[right];

        if(sum==target)
            return new int[]{arr[left],arr[right]};

        else if(sum<target)
            left++;

        else
            right--;
    }

    return new int[]{-1,-1};
}
}

package Com.SORTS;

import java.util.Arrays;

public class missingNumber {
    public static void main(String[] args) {
        int[] arr={0,3,1,4};
        System.out.println(miss(arr));

    }
    static int miss(int[] nums){
        int i=0;
        while(i<nums.length){
            int count=nums[i];
            if(nums[i]<nums.length && nums[i]!=nums[count]){
                swap(nums,i,count);
            }else{
                i++;
            }
        }
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index){
                return index;
            }
        }
        return nums.length;
    }

    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

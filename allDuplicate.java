package Com.SORTS;

import java.util.List;
import java.util.ArrayList;

public class allDuplicate {
    public static void main(String[] args) {
        int[] nums={1,3,4,4,5,4,2,5,7,8,5,3,2};
        List<Integer> result=findDuplicates(nums);
        System.out.println(result);
    }
    static List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while(i<nums.length){
            int count = nums[i]-1;
            if(nums[i] != nums[count]){
                swap(nums,i,count);
            }
            else{
                i++;
            }
        }
        List<Integer> ans= new ArrayList<>();
        for(int index =0; index < nums.length ;index++){
            if(nums[index]!=index+1){
                ans.add(nums[index]);
            }
        }
        return ans;
    }

    static void swap(int[] nums ,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}





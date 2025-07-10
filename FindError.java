package Com.SORTS;
import java.util.Arrays;
public class FindError {
    public static void main(String[] args) {
        int[] nums ={1,2,2,4};
        System.out.println(Arrays.toString(find(nums)));
    }
    static int[] find(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!= nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }

        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                return new int[] {nums[index],index+1};
            }
        }
        return new int[] {-1,-1};
    }
    static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}

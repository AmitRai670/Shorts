package Com.SORTS;
import java.util.Arrays;
public class Insertion {
    public static void main(String[] args){
    int[] arr={2,3,4,3,2,1,3,5,43,2,2,34,555};
    insertion(arr);
    System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swaps(arr,j,j-1);

                }else{
                    break;
                }
            }
        }
    }
    static void swaps(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}

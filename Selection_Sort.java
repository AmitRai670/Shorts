package Com.SORTS;

import java.util.Arrays;

public class Selection_Sort {

        public static void main(String[] args){
            int[] arr={5,4,3,2,1};
          selection(arr);
            System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last = arr.length-i-1;
            int Maxindex = GetMax(arr,0,last);
            swap(arr,Maxindex,last);
        }
    }


    static void swap(int[] arr,int start,int end){
        int temp =arr[start];
        arr[start]=arr[end];
        arr[end] = temp;

    }

    static int GetMax(int[] arr,int start,int end){;
    int max = start;
     for(int i= start ;i<=end;i++){

         if(arr[max]<arr[i]){
             max=i;
         }
     }
        return max;
    }
}

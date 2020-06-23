package Sort;

import java.util.Arrays;

public class SelectSort {
    public static void main (String[] args) {
        int[] arr1 = {9999,51,8,1,57,147,158,12647,81,35,74,684,3254};
        sort(arr1);
    }

    public static void sort (int[] arr) {
        //假定index是最小值min对应的index
        //int minIndex = 0;
        int tmp ;
        // 1. 找出整个数组中最小的 放在第一个
    for(int j = 0; j<arr.length-1 ;j++){
        for(int i = j;i<arr.length-1;i++){
            if(arr[j] > arr[i+1]){
                tmp = arr[j];
                arr[j] = arr[i+1];
                arr[i+1] = tmp;
            }
        }
        System.out.println("循环第"+j+"次,结果为");
        System.out.println(Arrays.toString(arr));

    }
//        for(int i = 1;i<arr.length-1;i++){
//            if(arr[1] > arr[i+1]){
//                tmp = arr[1];
//                arr[1] = arr[i+1];
//                arr[i+1] = tmp;
//            }
//        }
//        System.out.println("循环第2次,结果为");
//        System.out.println(Arrays.toString(arr));
//
//        for(int i = 2;i<arr.length-1;i++){
//            if(arr[2] > arr[i+1]){
//                tmp = arr[2];
//                arr[2] = arr[i+1];
//                arr[i+1] = tmp;
//            }
//        }
//        System.out.println("循环第3次,结果为");
//        System.out.println(Arrays.toString(arr));

    }
}

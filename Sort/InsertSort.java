package Sort;

import java.util.Arrays;
import java.util.Date;

public class InsertSort {
    public static void main (String[] args){
        int[] arr = new int[400000];
        for (int j = 0; j < 400000;j++){
            arr[j] = (int) (Math.random() * 999999999);
        }

        Long date1 = new Date().getTime();
        System.out.println("排序前的时间是"+date1);

        insert(arr);

        Long date2 = new Date().getTime();
        System.out.println("排序后的时间是"+date2);
        int seconds = (int) (date2 -  date1);
        double s = (double) seconds/1000;
        System.out.println("排序所用的时长 " + s+"秒");
//        System.out.println(Arrays.toString(arr));
    }

    //从小到大进行排序
    public static void insert (int[] arr){
        //默认数组前边的已经排序好
        //先做一次排序
        for (int i = 1 ; i < arr.length ; i ++){
            int now = arr[i];
            int preIndex = i - 1;
            while(preIndex >= 0 && arr[preIndex] > now){
                arr[preIndex + 1] = arr[preIndex];
                arr[preIndex] = now;
                preIndex--;
            }
            arr[preIndex + 1] = now;
//            System.out.println(Arrays.toString(arr));
        }
    }
}

package Sort;


public class BubbleSort {
    public static void main (String[] args) {
        int[] arr = {1,7,3,11,5,15,9};
        Sort sort = new Sort();
        sort.upSort(arr);
        sort.show(arr);
    }
}

//    public static void bubbleSort(int[] numbers)
//    {
//        int temp = 0;
//        int size = numbers.length;
//        for(int i = 0 ; i < size-1; i ++)
//        {
//            for(int j = 0 ;j < size-1-i ; j++)
//            {
//                if(numbers[j] > numbers[j+1])  //交换两数位置
//                {
//                    temp = numbers[j];
//                    numbers[j] = numbers[j+1];
//                    numbers[j+1] = temp;
//                }
//            }
//        }
//    }

class Sort {

    public Sort() {
    }

    public void upSort(int[] arr) {
        int temp;
        for(int j = 0 ; j < arr.length - 1; j ++) {
            //只用排序arr.length -1次
            for (int i = 0; i < arr.length - j - 1; i++) {
                //内部循环，前面排过的 j 个就不用再次排序了
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    public void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

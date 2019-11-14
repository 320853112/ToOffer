package q_10_ReverseArray;

public class ReverseArray_not_recursion {
    public static int minNumberInRotateArray(int [] array) {
        //思路：采用二分法，每次将数组都分为两个部分，具体使用双指针法，在一般情况下，后方的是较小的数组，要找寻后方数组的第一个数字
        if(array.length==0) return 0;
        int i=0,j=array.length-1;
        while(i<=j){
            if(i+1==j) return array[j];
            int mid = (i+j)/2;
            if(array[i]==array[j]&&array[j]==array[mid]){
                int min = array[i];
                //都相等则采取遍历的策略
                for (int k = i+1; k <=j; k++) {
                    if(array[k]<min){
                        min = array[k];
                    }
                }
                return min;
            }
            if(array[mid]>=array[i]){
                //说明在后方
                i=mid;
            }else if (array[mid]<=array[j]){
                //说明在前方
                j=mid;
            }
        }
        return array[j];
    }

    public static void main(String[] args) {
//        int[] array = {6501,6828,6963,7036,7422,7674,8146,8468,8704,8717,9170,9359,9719,9895,9896,9913,9962,154,293,334,492,1323,1479,1539,1727,1870,1943,2383,2392,2996,3282,3812,3903,4465,4605,4665,4772,4828,5142,5437,5448,5668,5706,5725,6300,6335};
        int[] array = {5,5,2,3};
        System.out.println(minNumberInRotateArray(array));
        System.out.println(2 << 1);

    }

}

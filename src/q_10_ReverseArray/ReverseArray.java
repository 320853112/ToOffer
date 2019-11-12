package q_10_ReverseArray;

/**
 * description:把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 *
 */
public class ReverseArray {
    public static int minNumberInRotateArray(int [] array) {
        //思路：采用二分法，每次将数组都分为两个部分，具体使用双指针法，在一般情况下，后方的是较小的数组，要找寻后方数组的第一个数字

        return minNumberInRotateArray(array,0,array.length-1);
    }

    private static int minNumberInRotateArray(int [] array,int i,int j){
        if(array.length==0) return 0;
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
            return minNumberInRotateArray(array,mid,j);
        }else if (array[mid]<=array[j]){
            //说明在前方
            return minNumberInRotateArray(array,i,mid);
        }
        return array[j];
    }

    public static void main(String[] args) {
        int[] array = {6501,6828,6963,7036,7422,7674,8146,8468,8704,8717,9170,9359,9719,9895,9896,9913,9962,154,293,334,492,1323,1479,1539,1727,1870,1943,2383,2392,2996,3282,3812,3903,4465,4605,4665,4772,4828,5142,5437,5448,5668,5706,5725,6300,6335};
        System.out.println(minNumberInRotateArray(array));
    }
}

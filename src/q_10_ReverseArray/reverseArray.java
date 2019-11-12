package q_10_ReverseArray;

/**
 * description:把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 *
 */
public class reverseArray {
    public static int minNumberInRotateArray(int [] array) {
        //思路：采用双指针法求解，在一般情况下，后方的是较小的数组，要找寻后方数组的第一个数字
        minNumberInRotateArray(array,0,array.length-1);
    }

    private static int minNumberInRotateArray(int [] array,int i,int j){
        int mid = (i+j)/2;
        if(array[mid]>array[i]){
            //说明在后方
        }else if (array[mid]){

        }
    }
}

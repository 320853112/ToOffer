package q_04_findSDoubleNums;

/**
 * description:在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * 思路：每次都从二维数组的右上方开始选择，当比较的数字等于目标数字，返回结果，当比较的数字大于目标数字，剔除该列，当比较的数字小于目标数字，
 * 剔除该行，直到结束
 */
public class Demo {
    public static boolean findDoubleNums(int[][] array ,int target) {
        boolean res = false;
        if (array.length == 0 || array[0].length == 0) return false;

        int i = 0;
        int j = array[0].length - 1;
        while (i <= array.length - 1 || j >= 0) {
            if (array[i][j] == target) {
                System.out.println(i + "," + j);
                return true;
            } else if (array[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        //7,[[1,2,8,9],[2,4,9,12],[4,7,10,13],[6,8,11,15]]
        //0,[[1,2,8,9],[2,4,9,12],[4,7,10,13],[6,8,11,15]]
//        int[][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        int[][] array = {{}};
        System.out.println(findDoubleNums(array, 0));
    }
}

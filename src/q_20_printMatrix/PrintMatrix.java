package q_20_printMatrix;

import java.util.ArrayList;

/*
输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class PrintMatrix {
    //按照圈数打印
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int length = matrix.length;
        int subLength = matrix.length;
        ArrayList<Integer> res = new ArrayList<Integer>();
        int i=0,j=0;
        while (length>0){
            printCircle(matrix,i++,j++,subLength--,res);
            length-=2;
        }
        return res;
    }

    //打印一圈
    public void printCircle(int [][] matrix ,int i,int j,int length,ArrayList<Integer> res ) {
        for (int k = j; k <= length-1; k++) {
            res.add(matrix[i][k]);
        }
        for (int k = i+1; k <= length-1; k++) {
            res.add(matrix[k][length-1]);
        }
        for (int k = length-2; k >= j; k--) {
            res.add(matrix[length-1][k]);
        }
        for (int k = length-2; k >=i+1; k--) {
            res.add(matrix[k][j]);
        }
    }

    public static void main(String[] args) {
        PrintMatrix printMatrix = new PrintMatrix();
        int[][] m1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] m2 = {{1,2},{3,4}};
        int[][] m3 = {{1},{2},{3},{4},{5}};
        ArrayList<Integer> integers = printMatrix.printMatrix(m3);
        for (Integer integer : integers) {
            System.out.print(integer);
            System.out.print(",");
        }
    }
}

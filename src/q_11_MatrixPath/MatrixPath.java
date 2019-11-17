package q_11_MatrixPath;

import java.util.LinkedList;
import java.util.Stack;

/**
 * description:用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。路径可以从矩阵中的任意一个格子开始，
 * 每一步可以在矩阵中向左，向右，向上，向下移动一个格子。如果一条路径经过了矩阵中的某一个格子，则该路径不能再进入该格子。
 * 例如 a b c e s f c s a d e e 矩阵中包含一条字符串"bcced"的路径，
 * 但是矩阵中不包含"abcb"路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入该格子。
 * PS：这题可从任意位置开始，好坑啊，一开始还以为和走迷宫一样的。只能从边界开始
 */
public class MatrixPath {

    public static Stack<Integer> rowStack = new Stack();
    public static Stack<Integer> colStack = new Stack();

    public static boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        if(str ==null||matrix == null||matrix.length==0||str.length==0) return false;
        //记录是否到过
        boolean[] isUse = new boolean[matrix.length];
        //记录当前在目标字符串的下标
        int index = 0;
        //先用双层for来确定
        for(int row=0;row<rows;row++){
            for (int col = 0; col < cols; col++) {
                //开始的下表
//                 if(row==0||row==rows-1||col==0||col==cols-1){
                     //判断是否是从边界开始
                     //开始回溯
                     if(hasPathCore(matrix,rows,cols,str,row,col,isUse,index)){
                         return true;
                     }
//                 }
            }
        }
        return false;
    }
    private static boolean hasPathCore(char[] matrix, int rows, int cols, char[] str,int row ,int col,boolean[] isUse,int index)
    {
        if(row<0||row>rows-1||col<0||col>cols-1) return false;
        int now = (row)*cols+col;
        if(isUse[now] == true){
            return false;
        }

        if(matrix[now] == str[index]){
            isUse[now] = true;
            index++;
            rowStack.push(row);
            colStack.push(col);
            if(index == str.length) return true;
            if(hasPathCore(matrix,rows,cols,str,row+1,col,isUse,index)||hasPathCore(matrix,rows,cols,str,row-1,col,isUse,index)
            ||hasPathCore(matrix,rows,cols,str,row,col+1,isUse,index)||hasPathCore(matrix,rows,cols,str,row,col-1,isUse,index)){
                return true;
            }
            rowStack.pop();
            colStack.pop();
            index--;
            isUse[now] = false;
        }
        return false;
    }

    public static void main(String[] args) {
        /*ABCEHJIG
          SFCSLOPQ
          ADEEMNOE
          ADIDEJFM
          VCEIFGGS
         */
        String matrix ="ABCEHJIGSFCSLOPQADEEMNOEADIDEJFMVCEIFGGS";
        String target = "SLHECCEIDEJFGGFIE";
        System.out.println(hasPath(matrix.toCharArray(), 5, 8, target.toCharArray()));
        while (!rowStack.isEmpty()){
            System.out.println(rowStack.pop()+","+colStack.pop());
        }
    }


}

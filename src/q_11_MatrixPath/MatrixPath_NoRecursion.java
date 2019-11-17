package q_11_MatrixPath;

import java.util.Stack;

public class MatrixPath_NoRecursion {
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
        int now = (row)*cols+col;
        int[] opt = new int[str.length];
        opt[0]  =3;
        if(matrix[now] != str[index++]) {
            return false;
        }
        int[] rowOpt = {1,-1,0,0};
        int[] colOpt = {0,0,1,-1};
        rowStack.push(row);
        colStack.push(col);
        isUse[now] = true;
        while (!rowStack.isEmpty()) {
            //取栈顶元素
            row = rowStack.peek();
            col = colStack.peek();
            int i;
            for (i = opt[index]; i < 4; i++) {
                opt[index] = i;
                int tempRow = row + rowOpt[i];
                int tempCol = col + colOpt[i];
                if (tempRow > 0 && tempRow < rows && tempCol > 0 && tempCol < cols) {
                    if (isUse[(tempRow) * cols + tempCol] == false && matrix[(tempRow) * cols + tempCol] == str[index]) {
                        isUse[(tempRow) * cols + tempCol] = true;
                        index++;
                        if(index ==str.length) return true;
                        rowStack.push(tempRow);
                        colStack.push(tempCol);
                        break;
                    }
                }
            }
            if (opt[index] == 3) {
                isUse[(rowStack.pop()) * cols + colStack.pop()] = false;
                opt[index]=0;
                index--;
            }
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

    }


}


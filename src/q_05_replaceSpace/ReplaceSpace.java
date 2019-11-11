package q_05_replaceSpace;

/**
 * description:请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy
 */
public class ReplaceSpace {
    public static String replaceSpace(StringBuffer str) {
        if(str.length()==0) return "";
        char[] oldStr = str.toString().toCharArray();
        int count =0;
        for (int i=0;i<str.length();i++){
            if(oldStr[i]==' ') {
                count++;
            }
        }
        char[] newStr = new char[str.length()+count*2];
        int j = 0;
        for (int i=0;i<str.length();i++){
            if(oldStr[i]==' '){
                newStr[j++] = '%';
                newStr[j++] = '2';
                newStr[j++] = '0';
            }else{
                newStr[j++] = oldStr[i];
            }
        }
        return new String(newStr);
    }

    public static void main(String[] args) {
        StringBuffer target = new StringBuffer("We Are Happy");
        System.out.println(replaceSpace(target));
        String a = "";
    }
}

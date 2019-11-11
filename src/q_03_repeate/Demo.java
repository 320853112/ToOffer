package q_03_repeate;

/**
 * description:在一个长度为n的数组中所有的数字都在0~n-1的范围内，请找出其中重复的数字
 */
public class Demo {
    public static int[] findRepeatNum(int[] nums){
        //思路：由于大小都限制好了，每次从第一个开始，比较当前的元素和其下表是否匹配，
        // 若不匹配则将其交换到应在的位置，直到交换时发现要去的位置已经有了正确的元素
        for (int i = 0;i<nums.length;i++){
            while(i!=nums[i]){
                if(nums[nums[i]]==nums[i]){
                    System.out.println(nums[i]);
                    break;
                }else{
                    swap(nums,nums[i],i);
                }
            }
        }
        return null;
    }

    public static void swap(int[] nums ,int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,3,1,0,2,5,3};
        findRepeatNum(nums);
    }
}

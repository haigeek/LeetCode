/**
 * @author zhaohj
 * @date 2021-03-06 11:00 下午
 * @Description 旋转数组
 */
public class RotateArray {
    //时间复杂度O(n) 空间复杂度O(n)
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int [] temp=new int[n];
        for (int i=0;i<nums.length;i++){
            if (i+k>=n) {
                temp[i+k-n] = nums[i];
            }else {
                temp[i + k] = nums[i];
            }
        }
        for (int i=0;i<temp.length;i++){
            nums[i]=temp[i];
//            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) {
        RotateArray rotateArray=new RotateArray();
//        int[] nums={1,2,3,4,5,6,7};
        int[] nums={-1,-100,3,99};
//        int[] nums={-1,-100,3,99,22};
        rotateArray.rotate(nums,5);
    }
}

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

    //时间复杂度O(n) 空间复杂度O(1)

    public void rotate2(int[] nums, int k) {
        int n=nums.length-1;
        k=k%(n+1);
        reverse(nums,0,n);
        reverse(nums,0,k-1);
        reverse(nums,k,n);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        RotateArray rotateArray=new RotateArray();
//        int[] nums={1,2,3,4,5,6,7};
//        int[] nums={-1,-100,3,99};
        int[] nums={-1,-100,3,99,22};
//        rotateArray.rotate(nums,5);
        rotateArray.rotate2(nums,1000);
    }
}

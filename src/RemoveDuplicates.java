/**
 * @author zhaohj
 * @date 2019/3/30 下午6:36
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) {
            return 0;
        }
        int i=0;
        for(int j=1;j<nums.length;j++){
            //判断快指针的值是否和慢指针相同，不相同慢指针进一步并使用快指针的值
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
            //相同的话快指针继续前进，找到不同的为止
        }
        return i+1;
    }
}

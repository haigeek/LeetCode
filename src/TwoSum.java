import java.util.HashMap;
import java.util.Map;

/**
 * @author zhaohj
 * @date 2019/3/30 下午5:17
 */
public class TwoSum {
    //两次遍历，时间复杂度O{N次方}
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    //使用map两次循环
    //时间复杂度：O(n)O(n)， 我们把包含有 nn 个元素的列表遍历两次。由于哈希表将查找时间缩短到 O(1)O(1) ，所以时间复杂度为 O(n)O(n)。
    //空间复杂度：O(n)O(n)， 所需的额外空间取决于哈希表中存储的元素数量，该表中存储了 nn 个元素。
    public int[] twoSum1(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int another = target - nums[i];
            if (map.containsKey(another) && map.get(another) != i) {
                return new int[]{i, map.get(another)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    //一遍hash表，在插入的同时检查之前插入的数据是否有数据符合
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int another = target - nums[i];
            if(map.containsKey(another)){
                return new int[] {map.get(another),i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }


}

import RemoveDuplicates.RemoveDuplicates;
import twosum.TwoSum;

/**
 * @author zhaohj
 * @date 2019/3/30 下午5:25
 */
public class Main {
    public static void main(String[] args){
//        TwoSum t=new TwoSum();
//        int [] array={3,2,4};
//        int [] result=t.twoSum(array,6);
//        System.out.println(result[0]);
//        System.out.println(result[1]);

        RemoveDuplicates t=new RemoveDuplicates();
        int [] array={0,1,2,2};
        int result=t.removeDuplicates(array);
        System.out.println(result);
    }
}

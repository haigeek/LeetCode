import twosum.TwoSum;

/**
 * @author zhaohj
 * @date 2019/3/30 下午5:25
 */
public class Main {
    public static void main(String[] args){
        TwoSum t=new TwoSum();
        int [] array={2,7,11,15};
        int [] result=t.twoSum1(array,9);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}

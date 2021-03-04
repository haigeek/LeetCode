/**
 * @author zhaohj
 * @date 2020-11-04 11:34 下午
 * @Description 反转整数 分类【数学】
 */
public class ReverseInteger {
    public static void main(String[] args){
        System.out.println(reverse(-321));
    }

    public static int reverse(int x) {
        long n=0;
        while (x!=0){
            n=n*10+x%10;
            x=x/10;
        }
        return (int)n==n?(int)n:0;
    }

}

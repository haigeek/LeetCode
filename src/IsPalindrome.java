/**
 * @author zhaohj
 * @date 2020-11-04 11:57 下午
 * @Description 判断数字是否为回文数
 */
public class IsPalindrome {

    //字符串的形式
    public boolean isPalindrome(int x) {
        StringBuffer reverse=new StringBuffer(String.valueOf(x)).reverse();
        return reverse.toString().equals(String.valueOf(x));
    }
}

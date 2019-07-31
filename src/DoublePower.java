/**
 * @author: jiao.li
 * @create: 2019-06-28 11:11
 * @description: 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */
public class DoublePower {
    public static void main(String[] args) {
        DoublePower d = new DoublePower();
        System.out.println(d.Power(2, -3));

    }

    public double Power(double base, int exponent) {
        boolean flag=false;
        if(exponent==0) return 1;
        if(exponent==1) return base;
        if(exponent<0) {exponent=-exponent;flag=true;}
        double ans = Power(base,exponent>>1);
        ans *=ans;
        if((exponent&1)==1) ans=ans*base;
        if(flag) ans=1/ans;
        return ans;
    }


}


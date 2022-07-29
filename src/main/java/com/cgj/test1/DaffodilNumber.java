package com.cgj.test1;

/**
 * @Description 水仙花数，完数，质数
 * 水仙花数（Narcissistic number）也被称为超完全数字不变数
 * （pluperfect digital invariant, PPDI）、自恋数、自幂数、阿姆斯壮数或阿姆斯特朗数（Armstrong number），
 * 水仙花数是指一个 3 位数，它的每个位上的数字的 3次幂之和等于它本身。例如：1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
 *
 **/
public class DaffodilNumber {

    /**
     *
     * @Description 求100—999之间的所有水仙花数，并统计一共有几个
     */
    public static void main(String[] args) {
        int num = 100;
        int a[] = new int[3];
        System.out.print("3位的水仙花数有：\t");
        while (num <= 999) {
            int sum =0;
            a[0] = num / 100 % 10;
            a[1] = num / 10 % 10;
            a[2] = num % 10;
            for (int i = 0; i < 3; i++) {
                sum = sum + (int) Math.pow(a[i], 3);
            }
            if (num ==sum) {
                System.out.print(num + "\t");
            }
            num++;
        }


    }
}

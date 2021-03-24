/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tranminhquangh.mathutil;

/**
 *
 * @author tranm
 */
public class MathUtility {

    // ta se tao cac ham trong class nay fake y chang class Math cua JDK
    //cac ham se sai chung o nhieu noi, lam tienj ich dung chung
    //pham cai gi dung chung thi ta suy nghi den STATIC
    public static final double PI = 3.1415; // ychang Math.PI;
    // lat hoi MathUtility.PI
    //ham tinh n! = 1.2.3.4.5.6....n
    //Quy uoc: 0! = 1! = 1;
    //ko co giai thua am
    //vi giai thua tang cuc nhanh ve gia tri, 21 tran kieu long
    //ta se khong che n dau vao cua ham tu 0...20
    //kieu long: 10^18, 18 con so 0 toi da
    // sqrt(4) -> 2     y = f(x) = x^x

    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. n must be between 0..20");
        }
        if (n == 0 || n == 1) {
            return 1; // 0! = 1! = 1 tinh luon cho nhanh

        }
        // den doan nay sure n tu 2 ... 20
        long result = 0; // co tinh hen, lat tinh tiep
        for (int i = 2; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}


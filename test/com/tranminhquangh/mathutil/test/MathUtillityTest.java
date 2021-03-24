/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tranminhquangh.mathutil.test;

import com.tranminhquangh.mathutil.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tranm
 */
public class MathUtillityTest {
    //dat ten ham theo chuan dan test phan mem, QA/QC
    @Test  // bien ham nay thanh main; shift F6 ddeer chay
    public void testFactorialGivenRightArgumentReturnsGoodResult(){
        int n = 5;
        long expected = 120; 
        long actual = MathUtility.getFactorial(n);
        
        assertEquals(expected, actual);
        assertEquals(720, MathUtility.getFactorial(6));// 6! dung la 720
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(1, MathUtility.getFactorial(0));
    }
    
    // test ngoai le thi test nhu the nao???
    //vi khi ngoai le xay ra, app dung` lien`, mau do?, vi co dieu ko on da~ dien~ ra
    //them nua ngoai le ko phai la value de so sanh, ko biet no la so may, chuoi nao
    //ngoai le chi co the uoc luong no, cham no khi no xay ra
    //test ngoai le nen dc doc/dien giai nhu sau:
    //dua vao 1 luong du lieu hen xui -> xem thu ngoai le co xay ra ko -> neu no xay ra thi mung vi ham/app chay
    // dung nhu thiet ke
    //tuc la neu getFactorial(-5) ma nem ra ngoai le filegalArgumentException, co nghia la ham dung
    //CO NGHIA la mau xanh, xanh vi thiet ke noi rang tinh huong -5 phai co ngoai le vaf neu ngoai le xay ra, thi ham dung
    
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentThrowException(){
        MathUtility.getFactorial(-5);  //chay ham chu chua test
        MathUtility.getFactorial(21);  // biet thua ham nem ra exception ta phai chup lai exception, neu co that. ham dung -> XANH
        MathUtility.getFactorial(-1);
        MathUtility.getFactorial(40);
    }
    
    
}
//Viec test dùng màu sắc, dùng thư viện Unit test có quy ước nếu tất cả các cặp expected và actual khớp nhau(equale) thì coi như hàm chyaj đúng mọi tình huống ta đã test->Xanh
//1 cặp sai - > đỏ
// do -> ham tinh dung , ki vong sai    or    ham tinh sai, ki  vong dung
// moi loi goi ham o tren duocj goi la test case, 1 tinh huong test ham voi 1 dau vao va nhan dau ra


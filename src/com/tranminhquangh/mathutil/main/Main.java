/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tranminhquangh.mathutil.main;

import com.tranminhquangh.mathutil.MathUtility;

/**
 *
 * @author tranm
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // tu mun test 5! co = 120 hay k
      int n= 5;  // 5! coi bang may
      long expected = 120;  // tui ky vong bn = 120
      long actual = MathUtility.getFactorial(n);
      
      System.out.println("5! expected: " + expected + "; actual: " + actual);
      
      // xet trung hop 2: 0! bang may
      n= 0;  // 5! coi bang may
      expected = 1;  // tui ky vong bn = 120
      actual = MathUtility.getFactorial(n);
      
      System.out.println("0! expected: " + expected + "; actual: " + actual);
      
    }
    
}

//Trong quy trinh lam phan mem dan dev phai co trach nhiem test tung ham
//tung class ma minh viet ra truoc khi khi dong goi gui cho ben QA/QC test
//Doc lap, tung ham , tung class phai dc test can than truoc khi chung
// duoc dung de phoi hop voi cac class khac, test ngay muc ham, muc class
//vua hoan thien, chua them ban ve UI, thi muc do test som nay goi la Unit test leval, - test tung don the, tung don vi code

//Vay lam s de test tung ham, tung class???
// co nhieu cach de test tung ham tung class
//1. Cach 1: dung sout(goi ham can test()) de in ra gia tri xu li cua ham 
// dung trong mon OOP

//2. Cach 2: Dung JoptionPane cua mon java Desktop de pop-up mot cua so in ket qua xu li cua ham de kiem tra coi ham chay dung sai
//3 Cach 3: Dung LOG FILE; trang web in ra ket qua xu li cua ham(mon Java Web)

//du la cach nao thi ta cung can phai in ra gia tri ham da xu li goi la ACTUAL VALRE
//roi ta di so sanh cac gia tri tra ve cua ham so giong nhu ta tinh toan truoc do hay ko, cai ta hy vong ham se tra ve - goi la EXPECTED VALUE

//neu ACTURAL VALUE == EXPECTED VALUE -> Ham chay ngon
                //   khac               -> Ham sai
//nguyen tac cua viec test: so sanh ACTUAL voi EXPECTED

// 3 cach nay deu cung  1 nguyen tac: goi ham de xem ham xu li ra ket qua may
// sau do dung mat de so sanh actual va expected roi tu ket luan
// cach nay tiem an sai sot khi ta phai xem xet qua nhieu cap value
// vi du ham GTHUA() phai test truong nop N<0, =0, =1, 18, 19, 20 (BIEN), 21, 30, 1 trieu

// moi n de test ta goi la 1 tinh huong xai ham, 1 tinh huong test
//test case

// cach 4: khong them nhin bang mat tung truong hop expected va actual
// nho may nhin luon, du suc biet cach so sanh
// may quet qua tat ca cac cap expected vs actual 
// neu tat ca deu khop, bao t mau xanh - DUONG THONG  CODE THONG
// neu co xuat hien it nhat 1 thang khong co khop actual vs expected bao tao mau do - DUONG KE , do code co truc trac tinh toan
// muon lam dc dieu nay ta can thu vien phu tro
// JAva: Junit, testNG
//C# : NUnit, MStest, xUnit
//PHP: PHPUnit
// ... moi ngon ngu deu co thu vien XANH DO giup canh bao ham tot hay ko


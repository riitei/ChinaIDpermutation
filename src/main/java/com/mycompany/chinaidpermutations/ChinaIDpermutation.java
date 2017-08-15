package com.mycompany.chinaidpermutations;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author riitei
 */
public class ChinaIDpermutation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] weights = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
        String[] chicksum = {"1", "0", "x", "9", "8", "7", "6", "5", "4", "3", "2"};
        int verification = 0;
        int sum = 0;
        String inputID = "50010119870508";
//        inputID = "32090219831122";
        String chinaID = "";
        int m = 0, w = 0, total = 0;
        int mantissa = 0;
//        for (String num : splintNum) {
//            System.out.println("num "+ num);    
//        }
// 補三位數 算驗證碼
        for (int i = 0; i < 1000; i++) {
            chinaID = inputID + String.format("%03d", i);
            String[] splintNum = chinaID.split("");
            System.out.println("chinaID_" + chinaID);
            // 驗證碼權重
            for (int j = 0; j < splintNum.length; j++) {
                sum += weights[j] * Integer.parseInt(splintNum[j]);
            }

            verification = sum % 11;
           if ( !chicksum[verification].equals("x")) {
                System.out.println("verification_" + verification + "__chicksum_" + chicksum[verification]);
                if (Integer.parseInt(splintNum[16]) % 2 == 0) {
                    System.out.println("女");
                    w++;
                    System.out.println("T => " + String.valueOf(verification) + " = " + chicksum[verification]);
                    System.out.println("chinaID " + chinaID + chicksum[verification]);

                } else {
                    System.out.println("男");
                    m++;
                    System.out.println(String.valueOf(verification) + " = " + chicksum[verification]);
                    System.out.println("chinaID " + chinaID + chicksum[verification]);

                }
                System.out.println("");

        //    } else {
                // System.out.println("F => " + chinaID + chicksum[verification]);
//                    System.out.println("chinaID" +chinaID.length());
                System.out.println("chinaID " + chinaID + String.valueOf(verification));
           }
            sum = 0;
        }//for i
        total = m + w;
        System.out.println("男 " + m + " 女 " + w + "\ntotal=> " + total);
    }
}

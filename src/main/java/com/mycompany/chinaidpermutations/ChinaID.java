package com.mycompany.chinaidpermutations;

import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author riitei
 */
public class ChinaID {

    private static final Logger LOG = Logger.getLogger(ChinaID.class.getName());
    private int countyAreaNum = 0;
    private int birthdayNum = 0;
    private int[] weights = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
    private String[] verificationNum = {"1", "0", "x", "9", "8", "7", "6", "5", "4", "3", "2"};

//    ChinaID() {
//        chinaID = null;
//    }
    /**
     *
     * @param CountyArea 縣市區
     * @return CountAreaNum 縣市區代號
     */
    public int countyAreaNum(String CountyArea) {

        countyAreaNum = 500101;
        return countyAreaNum;
    }

    /**
     * @param year 年
     * @param month 月
     * @param day 日
     * @return 生日
     */
    public int birthday(int year, int month, int day) {
        birthdayNum = 19870508;

        return birthdayNum;
    }

    public void setChinaID(int countyAreaNum, int birthdayNum, String gender) {
        String chinaID = "";
        int sum = 0;
        int verification = 0;
        String tempChinaID = String.valueOf(countyAreaNum) + String.valueOf(birthdayNum);

        for (int i = 0; i < 1000; i++) {
            chinaID = tempChinaID + String.format("%03d", i);
            String[] splintNum = chinaID.split("");
            // 驗證碼權重
            for (int j = 0; j < splintNum.length; j++) {
                sum += weights[j] * Integer.parseInt(splintNum[j]);
            }
            verification = sum % 11;
            // 取得驗證碼值
            if (String.valueOf(verification).endsWith(verificationNum[verification])
                    && !verificationNum[verification].equals("x")) {
                if (Integer.parseInt(splintNum[16]) % 2 == 0) {

                } else {

                }

            }
            sum = 0;
        }
    }//setChinaID

    /**
     *
     * @return 男性中國身份證
     */
    public String[] getChinaIDMale() {

        String ChinaIDMale[] = {};

        return ChinaIDMale;
    }

    /**
     *
     * @return 女性性中國身份證
     */
    public String[] getChinaIDFemale() {

        String ChinaIDFemale[] = {};

        return ChinaIDFemale;
    }

     /**
     *
     * @return 中國身份證
     */
    public String[] getChinaIDTotal() {

        String chinaIDTotal[] = {};

        return chinaIDTotal;
    }

}

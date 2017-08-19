/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chinaID;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author riitei
 */
public class ChinaID {

    private List<ID> chinaMaleID;
    private List<ID> chinaFemaleID;
    private int[] weights = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
    private String[] chicksum = {"1", "0", "x", "9", "8", "7", "6", "5", "4", "3", "2"};

    public void setChinaID(String city, String date) {

        int verification = 0;
        int sum = 0;
        chinaMaleID = new ArrayList<ID>();
        chinaFemaleID = new ArrayList<ID>();
        //    String inputID = "50010119870508";
        String inputID = city + date;
//        inputID = "32090219831122";
        String chinaID = "";
// 補三位數 算驗證碼
        for (int i = 0; i < 1000; i++) {
            chinaID = inputID + String.format("%03d", i);
            String[] splintNum = chinaID.split("");
            // 驗證碼權重
            for (int j = 0; j < splintNum.length; j++) {
                sum += weights[j] * Integer.parseInt(splintNum[j]);
            }
            verification = sum % 11;
            //
            if (!chicksum[verification].equals("x")) {
                if (Integer.parseInt(splintNum[16]) % 2 == 0) {// 偶數 女
                    chinaFemaleID.add(new ID(chinaID + chicksum[verification]));
                } else { // 奇數 男
                    chinaMaleID.add(new ID(chinaID + chicksum[verification]));
                }
            } 

        }
    }//for i

    public List<ID> getChinaID() {
        List<ID> ID = new ArrayList<ID>();
        ID.addAll(chinaFemaleID);
        ID.addAll(chinaMaleID);

        return ID;
    }

    public List<ID> getChinaMaleID() {

        return chinaMaleID;
    }

    public List<ID> getChinaFemaleID() {
        return chinaFemaleID;
    }

}

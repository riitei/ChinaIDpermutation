/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produceChinaID_v1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author riitei
 */
class ChinaID {

    private String chinaID = null;

    public ChinaID(String chinaID) {
        this.chinaID = chinaID;
    }

    public String getChinaID() {
        return this.chinaID;
    }
}

public class ProduceChinaID {

    private List<ChinaID> chinaMaleID;
    private List<ChinaID> chinaFemaleID;
    private int[] weights = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
    private String[] chicksum = {"1", "0", "x", "9", "8", "7", "6", "5", "4", "3", "2"};

    public void produceChinaID(String city, String date, String sequence) {

        int verification = 0;
        int sum = 0;
        chinaMaleID = new ArrayList<>();
        chinaFemaleID = new ArrayList<>();
//        String inputID = "50010119870508";
//        inputID = "32090219831122";
        String chinaID = city + date + sequence;
// 補三位數 算驗證碼
        String[] splintNum = chinaID.split("");
        // 驗證碼權重
        for (int j = 0; j < splintNum.length; j++) {
            sum += weights[j] * Integer.parseInt(splintNum[j]);
        }
        verification = sum % 11;
        //
        if (!chicksum[verification].equals("x")) {
            if (Integer.parseInt(splintNum[16]) % 2 == 0) {// 偶數 女
                chinaFemaleID.add(new ChinaID(chinaID + chicksum[verification]));
            } else { // 奇數 男
                chinaMaleID.add(new ChinaID(chinaID + chicksum[verification]));
            }
        }

//        }
    }

    public void test() {

        for (ChinaID cid : chinaFemaleID) {
            System.out.println("cid  " + cid.getChinaID());
        }
//     List<ChinaID>  chinaIDs = new ArrayList<>();
//        chinaIDs.addAll(chinaFemaleID);
//        chinaIDs.addAll(chinaMaleID);
//        System.out.println("ALL "+chinaIDs.size() );
    }

    public List<ChinaID> getChinaIDs() {
        List<ChinaID> chinaIDs = new ArrayList<>();
        chinaIDs.addAll(chinaFemaleID);
        chinaIDs.addAll(chinaMaleID);
        Collections.sort(chinaIDs, Collections.reverseOrder());
        Collections.reverse(chinaIDs);
        return chinaIDs;
    }

    public List<ChinaID> getChinaMaleIDs() {

        return chinaMaleID;
    }

    public List<ChinaID> getChinaFemaleIDs() {
        return chinaFemaleID;
    }
}


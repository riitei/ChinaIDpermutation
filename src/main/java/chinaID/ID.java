/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chinaID;

/**
 *
 * @author riitei
 */
public class ID {

    private String chinID;

    public ID(String chinID) {
        this.chinID = chinID;
    }

    public ID(String chinaMaleID, String chinaFemaleID) {
        System.out.println(chinaMaleID + " " + chinaFemaleID);
    }

    public String getChinaID() {
        return this.chinID;
    }
}

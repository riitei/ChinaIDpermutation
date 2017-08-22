/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produceChinaID;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author riitei
 */
public class testMain {

    public static void main(String[] args) {

        City city = new City(500101);
        Birthday birthday = new Birthday();
        birthday.setStratBirthday(1987, 5, 8);
        birthday.setEndBirthday(1987, 5, 9);
        birthday.birthday();
        Sequence sc = new Sequence();
        ProduceChinaID produceChinaID = new ProduceChinaID();
        sc.sequence();
        //
        int i = 0;
        for (BirthdayID birthdayList : birthday.getBirthday()) {
            for (SequenceID sequenceList : sc.getSequence()) {
                produceChinaID.produceChinaID(city.getCity(), birthdayList.getBirthday(), sequenceList.getSequence());
                for (ChinaID cid : produceChinaID.getChinaIDs()) {
                    System.out.println(i++ + " ===> " + cid.getChinaID());
                }
            }
            //    produceChinaID.test(); error
        }

    }
}

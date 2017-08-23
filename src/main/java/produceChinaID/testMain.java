/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produceChinaID;

/**
 *
 * @author riitei
 */
public class testMain {

    public static void main(String[] args) {

        Compose compose = new Compose();
        compose.setCity(500101);
        compose.setStratBirthday(1988, 5, 8);
        compose.setEndBirthday(1988, 5, 9);
        compose.compose();
        for(ComposeID composeID : compose.composeIDs() ){
            System.out.println(composeID.getComposeID());
        }
//        City city = new City(500101);
//        Birthday birthday = new Birthday();
//        birthday.setStratBirthday(1987, 5, 8);
//        birthday.setEndBirthday(1987, 5, 9);
//        birthday.birthday();
//        Sequence sequence = new Sequence();
//        ProduceChinaID produceChinaID = new ProduceChinaID();
//        sequence.sequence();
//        Compose compose = new Compose();
//        compose.compose();
        //
//        int i = 0;
//        for (BirthdayID birthdayList : birthday.getBirthday()) {
//            for (SequenceID sequenceList : sequence.getSequence()) {
//                produceChinaID.produceChinaID(city.getCity(), birthdayList.getBirthday(), sequenceList.getSequence());
//                for (ChinaID cid : produceChinaID.getChinaIDs()) {
//                    System.out.println(i++ + " ===> " + cid.getChinaID());
//                }
//            }
//            //    produceChinaID.test(); error
//        }

    }
}

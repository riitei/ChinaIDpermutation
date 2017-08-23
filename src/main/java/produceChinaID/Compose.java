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
class ComposeID {

    private String composeID = null;

    public ComposeID(String composeID) {
        this.composeID = composeID;
    }

    public String getComposeID() {
        return this.composeID;
    }
}

public class Compose {

    private int city = 0;
    private String birthday = null;
    private String sequence = null;
    private int startYear = 0;
    private int startMonth = 0;
    private int startDay = 0;
    private int endYear = 0;
    private int endMonth = 0;
    private int endDay = 0;
    private List<ComposeID> composeID;

    public void compose() {
        City city = new City(this.city);

        Birthday birthday = new Birthday();
        birthday.setStratBirthday(this.startYear, this.startMonth, this.startDay);
        birthday.setEndBirthday(this.endYear, this.endMonth, this.endDay);
        birthday.birthday();
        Sequence sequence = new Sequence();
        ProduceChinaID produceChinaID = new ProduceChinaID();

        sequence.sequence();
        composeID = new ArrayList<>();

        for (BirthdayID birthdayList : birthday.getBirthday()) {
            for (SequenceID sequenceList : sequence.getSequence()) {
                produceChinaID.produceChinaID(city.getCity(), birthdayList.getBirthday(), sequenceList.getSequence());
                for (ChinaID cid : produceChinaID.getChinaIDs()) {
                    composeID.add(new ComposeID(cid.getChinaID()));
                }
            }
            //    produceChinaID.test(); error
        }
    }

    public void setCity(int city) {
        this.city = city;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setStratBirthday(int startYear, int startMonth, int startDay) {
        this.startYear = startYear;
        this.startMonth = startMonth;
        this.startDay = startDay;
    }

    public void setEndBirthday(int endYear, int endMonth, int endDay) {
        this.endYear = endYear;
        this.endMonth = endMonth;
        this.endDay = endDay;
    }

    public List<ComposeID> composeIDs() {
        return this.composeID;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produceChinaID_v1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author riitei
 */
class BirthdayID {

    private String birthdayID;

    public BirthdayID(String birthdayID) {
        this.birthdayID = birthdayID;
    }

    public String getBirthday() {
        return this.birthdayID;
    }

}

public class Birthday {

    private int startYear;
    private int startMonth;
    private int startDay;
    private int endYear;
    private int endMonth;
    private int endDay;
    private List<BirthdayID> birthday;

    public void birthday() {

        birthday = new ArrayList<>();
//500101 19870508
        SimpleDateFormat ft
                = new SimpleDateFormat("yyyyMMdd");
        Calendar startCalendar = Calendar.getInstance();
        startCalendar.set(startYear, startMonth - 1, startDay);
        Calendar endCalendar = Calendar.getInstance();
        endCalendar.set(endYear, endMonth - 1, endDay);

        while (startCalendar.compareTo(endCalendar) <= 0) {
            String date = ft.format(startCalendar.getTime());
            birthday.add(new BirthdayID(date));
            startCalendar.add(Calendar.DATE, 1);
        }
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

    /**
     *
     * @return
     */
    public List<BirthdayID> getBirthday() {
        return birthday;
    }

}

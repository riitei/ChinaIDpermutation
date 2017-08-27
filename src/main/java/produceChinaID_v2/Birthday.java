/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produceChinaID_v2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

/**
 *
 * @author riitei
 */

public class Birthday implements DataCollect {

    private int startYear;
    private int startMonth;
    private int startDay;
    private int endYear;
    private int endMonth;
    private int endDay;
    private List<ID> birthday;
    private Map<String, Object> birthdayMap;

    public void ID() {

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
            birthday.add(new ID(date));
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

//    /**
//     *
//     * @return
//     */
//    public List<BirthdayID> getBirthday() {
//        return birthday;
//    }
//
//    @Override
//    public List<BirthdayID> getDataCollect() {
//        return birthday;
//    }

    @Override
    public void setDataCollect(Map<String, Object> data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Map<String, Object> getDataCollect() {
        return birthdayMap;
    }

    

  

   

}

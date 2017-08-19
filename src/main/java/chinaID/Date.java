/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chinaID;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author riitei
 */
public class Date {

    private static int startYear = 1988;
    private static int startMonth = 5;
    private static int startDay = 30;
    private static int endYear = 1988;
    private static int endMonth = 5;
    private static int endDay = 30;

    public static void main(String[] args) {
        
        Thread t1 = new Thread();
        
        
        List<ID> chinaID = new ArrayList<ID>();
//500101 19870508
        SimpleDateFormat ft
                = new SimpleDateFormat("yyyyMMdd");
        Calendar start = Calendar.getInstance();
        start.set(startYear, startMonth - 1, startDay);
        Calendar end = Calendar.getInstance();
        end.set(endYear, endMonth - 1, endDay);
        System.out.println("start date " + ft.format(start.getTime()));
        ChinaID main = new ChinaID();
        while (start.compareTo(end) <= 0) {
            String date = ft.format(start.getTime());
            System.out.println(date);
            start.add(Calendar.DATE, 1);
            // date = null;

            main.setChinaID("500101", date);
            chinaID.addAll(main.getChinaID());
        }
        int i = 1;

//        for(ChinaID chinaID : main.getChinaID()){
//            System.out.println(chinaID.getChinaID());
//            System.out.println(i++);
//        }
        for (ID ID : chinaID) {
            System.out.println(ID.getChinaID());
            System.out.println(i++);
        }
    }
}

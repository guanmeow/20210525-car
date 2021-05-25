package Car;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Tester {
    public static void main(String[] args) {
        int fee =50;
        Map<String,CarP> cars = new HashMap<>();
        CarP c1 = new CarP("aac-220","09:15");
        CarP c2 = new CarP("jop-976","09:45");
        CarP c3 = new CarP("auw-356","10:15");
        cars.put(c1.id,c1);
        cars.put(c2.id,c2);
        cars.put(c3.id,c3);
    String id ="aac-220";
    CarP carp = cars.get(id);
    if(carp == null){
        System.out.println("no car be foud");
    }else{
        Date now = new Date();
        long s =now.getTime();
        long ss = carp.enter.getTime();
        System.out.println("pay : " + (int)((s-ss)/(1000*60*30))*fee) ;
    }
    Date date = new Date();
    Calendar calendar = Calendar.getInstance();
        System.out.println(date.getTime());
        System.out.println(calendar.getTime());
    }


}

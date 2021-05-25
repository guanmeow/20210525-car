package Car;

import java.util.Calendar;
import java.util.Date;

public class CarP {
    String id;
    Date enter;

    public CarP(String id,String time) {
        this.id = id ;
        Calendar calendar= Calendar.getInstance();
        String [] token = time.split(":");
        calendar.set(Calendar.HOUR_OF_DAY ,Integer.parseInt (token[0]));
        calendar.set(Calendar.MINUTE ,Integer.parseInt (token[1]));
        enter = calendar.getTime();
    }

}


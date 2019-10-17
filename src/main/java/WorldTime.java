import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;

public class WorldTime {


    public String getTimeByCountry(String local){
        DateTime dateTimeLocal = new DateTime(DateTimeZone.forID(local));
        String hora = String.valueOf(dateTimeLocal.getHourOfDay());
        String minuto = "";
        if(dateTimeLocal.getMinuteOfHour()<10){
            minuto = "0" + String.valueOf(dateTimeLocal.getMinuteOfHour());
            return hora + ":" + minuto;
        }
        else{
            minuto = String.valueOf(dateTimeLocal.getMinuteOfHour());
            return hora  + ":" + minuto;
        }
    }
}

package lab8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MMDDYYYYFormat implements DataTask{
    @Override
    public Date interpret(String date) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
        return format.parse(date);
    }
}

package lab8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DDMMYYYYFormat implements DataTask{
    @Override
    public Date interpret(String date) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        return format.parse(date);
    }
}

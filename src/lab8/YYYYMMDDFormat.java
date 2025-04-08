package lab8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class YYYYMMDDFormat implements DataTask{
    @Override
    public Date interpret(String date) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return format.parse(date);
    }
}

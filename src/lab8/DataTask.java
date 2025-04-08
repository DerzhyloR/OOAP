package lab8;

import java.text.ParseException;
import java.util.Date;

public interface DataTask {
    Date interpret(String date) throws ParseException;
}

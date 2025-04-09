package lab8;

import java.text.ParseException;
import java.util.Date;

public class DateInterpreter {
    private DataTask dataTask;

    public DateInterpreter(String format) {
        switch (format) {
            case "MM-DD-YYYY":
                dataTask = new MMDDYYYYFormat();
                break;
            case "DD-MM-YYYY":
                dataTask = new DDMMYYYYFormat();
                break;
            case "YYYY-MM-DD":
                dataTask = new YYYYMMDDFormat();
                break;
        }
    }

    public Date interpret(String date) throws ParseException {
        return dataTask.interpret(date);
    }
}

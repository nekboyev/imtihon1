package imtihon.oxirgisi;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class MyCustomFormater extends Formatter {
    @Override
    public String format(LogRecord record) {
        Throwable thrown = record.getThrown();
        if (thrown!=null){

            StringWriter s=new StringWriter();
            thrown.printStackTrace(new PrintWriter(s));
            String string = s.toString();
            return string+" ishladi";
        }
        return "not exception";
    }
}

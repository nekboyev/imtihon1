package imtihon.oxirgisi;


import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class MyCustomHandler extends ConsoleHandler {
    public void publish(LogRecord record) {
        if (record.getLevel().intValue()>=Level.SEVERE.intValue()) {
            super.publish(record);
       }
    }

}

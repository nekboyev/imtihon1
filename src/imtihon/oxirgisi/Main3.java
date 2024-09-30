package imtihon.oxirgisi;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.logging.*;

public class Main3 {
    public static void main(String[] args) throws IOException {
        Logger logger=Logger.getLogger(Main3.class.getName());
      /*  FileHandler fileHandler=new FileHandler("yozish");
fileHandler.setLevel(Level.SEVERE);*/
MyCustomHandler myCustomHandler=new MyCustomHandler();
myCustomHandler.setFormatter(new MyCustomFormater());
logger.addHandler(myCustomHandler);
try {
    throw new RuntimeException();
}catch (RuntimeException e){
    logger.log(Level.SEVERE,"xatolik-> "+e);
}



    }
}

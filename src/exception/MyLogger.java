package exception;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {

    Logger logger = Logger.getLogger("myLogger");
    private static MyLogger instance = new MyLogger();

    public static final String myLog = "log.txt";
    private FileHandler logFile = null;

    private MyLogger(){
        try {
            logFile = new FileHandler(myLog, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        logFile.setFormatter(new SimpleFormatter());
        logger.setLevel(Level.INFO);
        logger.addHandler(logFile);
    }

    public static MyLogger getInstance(){
        if(instance == null){
            instance = new MyLogger();
        }
        return instance;
    }

    public void log(String msg){
        logger.info(msg);
        logger.warning(msg);
        logger.severe(msg);
    }

}

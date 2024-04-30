package automation.utils;

import java.io.File;

import java.util.logging.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Log {
      static Logger logger = Logger.getLogger(Log.class.getName());

    public static Logger getLogData(String className) {
        String path = new File("").getAbsolutePath();
        DOMConfigurator.configure("log4j.xml");
        return Logger.getLogger(className);
    }

    public static void startTest(String testName) {
//        logger.info(STR."Test called: \{testName} has started");
    }

    public static void endTest(String testName) {
//        logger.info(STR."Test called: \{testName} has ended");
    }




}

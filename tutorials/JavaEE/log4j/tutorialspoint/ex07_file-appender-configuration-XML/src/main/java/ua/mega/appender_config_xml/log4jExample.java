package ua.mega.appender_config_xml;

import org.apache.log4j.Logger;

public class log4jExample {
    /* Get actual class name to be printed on */
    static Logger log = Logger.getLogger(log4jExample.class);

    public static void main(String[] args) {
        log.debug("Hello this is a debug message");
        log.info("Hello this is an info message");
    }
}

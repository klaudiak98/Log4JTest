import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Log4JTest {
    private static final Logger logger = Logger.getRootLogger();
    public static void main(String[] args) {
        Level prevLevel = logger.getLevel();
        logger.fatal("Domyślny poziom logowania:" + prevLevel);
        logger.debug("Wpis #1");
        logger.info("Wpis #2");
        logger.setLevel(Level.INFO);
        logger.debug("Wpis #3");
        logger.info("Wpis #4");
        logger.setLevel(prevLevel);
        }
}
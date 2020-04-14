import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Log4JTest2 {
    private static final Logger logger = Logger.getRootLogger();
    public static void main(String[] args) {
        for(int i =0 ; i < 1000000 ; i++)
       {
            //zle
           logger.debug(i + "[A]: "+ (i*10)+ " "+ (i * 100));

           //prawie dobrze
            if(logger.isDebugEnabled())
                logger.debug(i + "[B]: "+ (i*10)+ " "+ (i * 100));

            //dobrze
            if(logger.isEnabledFor(Level.DEBUG))
            {
                StringBuffer sb = new StringBuffer();
                sb.append(i).append("[C]: ").append(i*10).append(" ").append(i*100);
                logger.debug(sb.toString());
            }
        }
    }
}

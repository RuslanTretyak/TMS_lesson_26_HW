package listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ContextListener implements ServletContextListener {
    private static final Logger logger = LogManager.getLogger(ContextListener.class);
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("\n\n-------app started-------\n\n");
        logger.info("-------app started-------");
    }
}

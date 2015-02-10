package log.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * 要引入logback，由于Logback-classic依赖slf4j-api.jar和logback-core.jar，
 * 所以要把slf4j-api.jar、logback-core.jar、logback-classic.jar，添加到要引入Logbac日志管理的项目的class path中.
 *
 */
public class LogbackLog {

	private static final Logger logger = LoggerFactory.getLogger(LogbackLog.class);
	
	public static void main(String[] args) {
		
		logger.debug("log error info");
		
		String str = "哈喽";
		
		logger.debug("log error info with parament : {}",str);
	}
}

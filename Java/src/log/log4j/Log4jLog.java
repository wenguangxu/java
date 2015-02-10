package log.log4j;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.MDC;

/**
 * 
 * @author wenguang.xu
 *
 */
public class Log4jLog {

	private static final Log log = LogFactory.getLog(Log4jLog.class); //获取普通记录器
	 //private static final Logger log = Logger.getRootLogger(); //获取普通记录器

	public static void main(String[] args) {

		//log4j为我们提供了MDC（MDC是log4j种非常有用类，它们用于存储应用程序的上下文信息（context infomation），从而便于在log中使用这些上下文信息。
		//MDC内部使用了类似map的机制来存储信息，上下文信息也是每个线程独立地储存，所不同的是信息都是以它们的key值存储在”map”中。相对应的方法:
		//MDC.put(key, value); MDC.remove(key); MDC.get(key);
		
		MDC.put("uname", "张三");
		
		if (log.isDebugEnabled()) {
			log.debug("error messages");
		}

		log.info("aaa");

		if (log.isDebugEnabled()) {
			log.debug("出错日志debug");
		}
		if (log.isInfoEnabled()) {
			log.info("出错日志info");
		}
		if (log.isWarnEnabled()) {
			log.warn("出错日志warn");
		}
		if (log.isErrorEnabled()) {
			log.error("出错日志error");
		}
		if (log.isFatalEnabled()) {
			log.fatal("出错日志fatal");
		}
	}
}

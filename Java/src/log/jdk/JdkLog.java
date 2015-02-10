package log.jdk;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
	Logger：日志记录对象。用于记录日志信息。
	Handler：用于处理日志信息的输出。在 Handler 类中，可以决定日志是输出到文件中还是控制台中。
	Filter: 用于过滤日志。在 Filter 类中，可以根据日志级别或者某种条件来决定是否输出该日志。这样达到去除冗余信息的目的。
	Formatter：用于格式化日志信息。该类可以将日志文本格式化成 XML 或者 HTML 的格式，这完全依赖于具体的实现。
	Level：用于表示日志的级别。 JDK 日志框架默认有如下级别 : SEVERE，WARNING，INFO，CONFIG，FINE，FINER，FINEST 。
 */

/** 
 *  JDK 提供了如下几种默认支持的 Handler 类：
	ConsoleHandler： 输出日志到控制台中
	FileHandler：输出日志到指定文件中
	MemoryHandler：输出日志到内存缓冲区中，当一定的条件满足的时候（如某种关键字的日志信息）再将缓冲区中的日志输出
	SocketHandler: 输出日志到网络 socket 中
	StreamHandler: 输出日志到输入输出流对象中
 */
public class JdkLog {
	public static void main(String[] args) {
		Logger log = Logger.getLogger("JdkLog");
		log.setLevel(Level.INFO);
		log.warning("aaa");
	}
}

package com.steel.Log4j;

import org.apache.log4j.Logger;

public class Log4jTest {

	public static void main(String[] args) {
		
		Logger log1 = Logger.getLogger(Log4jTest.class.getName());  
        log1.info("普通的日志写出器，将日志分别输出到控制台和文件中。。。");
        
        Logger log2 = Logger.getLogger("special-logger");      
        log2.error("带过滤功能的日志写出器，用于过滤error信息。。。");
        
        Logger log3 = Logger.getLogger("unknown logger");
        log3.info("找不到对应的logger，将使用root输出日志信息。。。");
	}
}

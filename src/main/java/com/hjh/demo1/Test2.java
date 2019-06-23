package com.hjh.demo1;

/**
 * @Description:
 * @Author: HJH
 * @Date: 2019-06-22 16:27
 */
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.File;

public class Test2 {
    static Logger logger = Logger.getLogger(Test2.class);
    public static void main(String[] args) throws InterruptedException {
        PropertyConfigurator.configure("E:\\IDEAProject\\stdlog4j\\src\\main\\resources\\log4j.xml");
        for (int i = 0; i < 1; i++) {
            logger.trace("跟踪信息");
            logger.debug("调试信息");
            logger.info("输出信息");
            logger.warn("警告信息");
            logger.error("错误信息");
            logger.fatal("致命信息");
        }
    }
}
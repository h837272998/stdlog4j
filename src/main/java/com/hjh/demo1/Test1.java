package com.hjh.demo1;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * @Description:
 * @Author: HJH
 * @Date: 2019-06-22 14:58
 */
public class Test1 {
    static Logger logger = Logger.getLogger(Test1.class);

    public static void main(String[] args) throws InterruptedException {
        BasicConfigurator.configure();
        logger.setLevel(Level.DEBUG);
        logger.trace("跟踪信息");
        logger.debug("调试信息");
        logger.info("输出信息");
        Thread.sleep(1000);
        logger.warn("警告信息");
        logger.error("错误信息");
        logger.fatal("致命信息");
    }
}

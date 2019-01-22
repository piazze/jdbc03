package com.wisezone.test;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLog {
    //获取log4j的实例
    private static Logger logger = LoggerFactory.getLogger(TestLog.class);

    public static void main(String[] args) {
        logger.debug("-----DEBUG-----");
        logger.info("-----INFO-----");
        logger.warn("-----WARN-----");
        logger.error("-----ERROR-----");
    }
}

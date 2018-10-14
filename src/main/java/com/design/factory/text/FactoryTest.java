package com.design.factory.text;

import com.design.factory.factory.DBLoggerFactory;
import com.design.factory.factory.FileLoggerFactory;
import com.design.factory.factory.Logger;
import com.design.factory.factory.LoggerFactory;
import lombok.extern.log4j.Log4j;

/**
 * Created by hwd on 2018/10/14.
 */
@Log4j
public class FactoryTest {
    public static void main(String[] args) {
        Logger logger = null;
        LoggerFactory factory = null;
        factory = new FileLoggerFactory();
        logger = factory.createLogger();
        log.debug("====开始写入日志======");
        logger.writeLogger();

        factory = new DBLoggerFactory();
        logger = factory.createLogger();
        log.debug("=====更换日志写入方式======");
        logger.writeLogger();


    }
}

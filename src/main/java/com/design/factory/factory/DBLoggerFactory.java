package com.design.factory.factory;

import lombok.extern.log4j.Log4j;

/**
 * Created by hwd on 2018/10/14.
 */
@Log4j
public class DBLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        log.debug("===开始创建数据库写入日志类===");
        return new DBWriterLogger();
    }
}

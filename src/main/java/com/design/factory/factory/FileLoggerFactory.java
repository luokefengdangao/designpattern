package com.design.factory.factory;

import lombok.extern.log4j.Log4j;

/**
 * Created by hwd on 2018/10/14.
 */
@Log4j
public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        log.debug("====创建文件日志写入类=====");
        return new FileWriterLogger();
    }
}

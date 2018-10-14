package com.design.factory.factory;

import lombok.extern.log4j.Log4j;

/**
 * Created by hwd on 2018/10/14.
 */
@Log4j
public class FileWriterLogger implements Logger {
    @Override
    public void writeLogger() {
        log.debug("通过文件来写日志");
    }
}

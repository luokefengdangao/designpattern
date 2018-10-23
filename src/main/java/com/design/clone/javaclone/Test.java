package com.design.clone.javaclone;

import lombok.extern.log4j.Log4j;

/**
 * Created by hwd on 2018/10/22.
 */
@Log4j
public class Test {
    public static void main(String[] args) {

        //simclone();
       // shallowClone();
        deepClone();
    }


    public static void deepClone(){
        WeeklyLog weeklyLog = new WeeklyLog("张无忌","第11周","这周工作很忙",new Attachment("财务附件","今年公司花了很多钱"));
        log.debug("11 周工作周报=="+weeklyLog.toString());

        WeeklyLog weeklyLog1 = weeklyLog.deepClone();
        log.debug("12周工作周报==="+weeklyLog1.toString());
        log.debug(weeklyLog==weeklyLog1);
        log.debug(weeklyLog.getAttachment() == weeklyLog1.getAttachment());
    }

    //浅克隆
    public static void shallowClone(){
        WeeklyLog weeklyLog = new WeeklyLog("张无忌","第11周","这周工作很忙",new Attachment("财务附件","今年公司花了很多钱"));
        log.debug("11 周工作周报=="+weeklyLog.toString());

        WeeklyLog weeklyLog1 = weeklyLog.clone();
        log.debug("12周工作周报==="+weeklyLog1.toString());
        log.debug(weeklyLog==weeklyLog1);
        log.debug(weeklyLog.getAttachment() == weeklyLog1.getAttachment());


    }


    /**
     * 一般克隆
     */
    public static void simclone(){
        WeeklyLog weeklyLog = new WeeklyLog();
        weeklyLog.setName("张无忌");
        weeklyLog.setDate("第11周");
        weeklyLog.setContent("这周工作很忙");
        log.debug("第11周工作周报==="+weeklyLog.toString());

        WeeklyLog weeklyLog1 = weeklyLog.clone();
        weeklyLog1.setDate("第十二周");
        log.debug("第12周内容==="+weeklyLog1.toString());
        log.debug(weeklyLog == weeklyLog1);

        WeeklyLog weeklyLog2 = weeklyLog.clone();
        weeklyLog2.setDate("第十三周");
        log.debug("第12周内容==="+weeklyLog2.toString());
        log.debug(weeklyLog2 == weeklyLog);

        log.debug(weeklyLog.getContent()==weeklyLog1.getContent());
        log.debug(weeklyLog.getDate()==weeklyLog1.getDate());
        log.debug(weeklyLog.getName() == weeklyLog1.getName());

    }

}

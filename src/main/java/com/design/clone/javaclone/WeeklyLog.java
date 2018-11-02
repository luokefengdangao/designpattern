package com.design.clone.javaclone;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.*;

/**
 * Created by hwd on 2018/10/22.
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class WeeklyLog implements Serializable{

    private String name;

    private String date;

    private String content;

    private Attachment attachment;


    @Override
    public WeeklyLog clone()  {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (WeeklyLog)object;
    }

    public WeeklyLog deepClone(){
        WeeklyLog weeklyLog = null;
        try {

            //对象写入流
            ByteArrayOutputStream bao = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bao);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Object object = ois.readObject();
            return (WeeklyLog) object;

        } catch (Exception e) {
            e.printStackTrace();
        }


        return weeklyLog;

    }

}

package com.design.clone.javaclone;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * Created by hwd on 2018/10/22.
 */
@Data
@ToString
@AllArgsConstructor
public class Attachment implements Serializable {

    private String attName;

    private String content;
}

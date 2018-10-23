package com.design.clone.mgr;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hwd on 2018/10/22.
 */
public class PropertyMgr {
    private Map<String,OfficialDocument> map = new HashMap<>();

    private static PropertyMgr propertyMgr = new PropertyMgr();

    private PropertyMgr(){
        map.put("far",new Far());
        map.put("srs",new SRS());
    }

    public OfficialDocument getOff(String key){
        return  propertyMgr.map.get(key).clone();
    }

    public static PropertyMgr getPropertyMgr(){
        return  propertyMgr;
    }

}

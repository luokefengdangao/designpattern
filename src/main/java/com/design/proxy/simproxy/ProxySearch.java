package com.design.proxy.simproxy;/**
 * Created by hdw on 2018/11/2.
 */

/**
 * @类型名称：ProxySearch
 * @功能描述：
 * @创建作者：hdw
 * @创建时间：2018/11/2 17:31
 * @Version：1.0
 */

public class ProxySearch implements Search {

    private AccessValidator accessValidator;

    private Logger logger;

    private RealSearch realSearch;

    public ProxySearch(){
        accessValidator = new AccessValidator();
        logger = new Logger();
        realSearch = new RealSearch();
    }

    @Override
    public void doSearch() {
        accessValidator.valid();
        realSearch.doSearch();
        logger.log();
    }
}

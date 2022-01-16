package com.ckm.boot.service.provider.impl;

import com.ckm.api.SiteService;
import com.ckm.boot.service.provider.bo.SiteServiceBO;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author ckm
 * @Date 2022/1/7
 **/
@DubboService
public class SiteServiceImpl implements SiteService {
    @Autowired
    private SiteServiceBO siteServiceBO;

    @Override
    public String getName(String name) {
        return name + "poi";
    }
}

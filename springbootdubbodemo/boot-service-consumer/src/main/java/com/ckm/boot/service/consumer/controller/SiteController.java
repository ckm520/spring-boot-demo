package com.ckm.boot.service.consumer.controller;

import com.ckm.api.SiteService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ckm
 * @Date 2022/1/8
 **/
@RestController
@RequestMapping("/site")
public class SiteController {
    @DubboReference
    private SiteService siteService;

    @RequestMapping("/name")
    public String getName(String name) {
        return siteService.getName(name);
    }
}

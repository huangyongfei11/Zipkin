package com.ht.springcloud.providera.controller;

import com.ht.springcloud.providera.feign.CustomeProviderB;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author K1081221
 * @version 2019/8/20
 * @description:
 * @modified:
 */
@RestController
public class TestController {

    @Autowired
    private CustomeProviderB customeProviderB;

    @GetMapping("testa")
    public String test(){
        String providerb = customeProviderB.getBinfos();

        return "hello zipkin providera  \b" + providerb;
    }
}
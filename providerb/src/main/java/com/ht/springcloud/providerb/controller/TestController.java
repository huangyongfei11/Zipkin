package com.ht.springcloud.providerb.controller;

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

    @GetMapping("testb")
    public String test(){

        return "providerb";
    }
}
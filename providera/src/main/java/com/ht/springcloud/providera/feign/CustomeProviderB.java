package com.ht.springcloud.providera.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author K1081221
 * @version 2019/8/20
 * @description:
 * @modified:
 */
@FeignClient(name = "providerb", fallback = CustomeProviderB.ServiceFailback.class)
public interface CustomeProviderB {

    @GetMapping("testb")
    String getBinfos();

    @Component
    class ServiceFailback implements CustomeProviderB {
        @Override
        public String getBinfos() {
            return "Feign调用失败【getBinfos】";
        }


    }
}
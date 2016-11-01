package cn.com.jhn.controller;

import cn.com.jhn.domain.BaseBenchBasicInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Rest 入口，用于测试
 * @author 陈琳
 * @create 2016-10-20 上午 10:52
 **/
@RestController
@RequestMapping("/spring-cloud-client-redis")
public class InvoiceController {
    @Autowired
    protected RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;
    /**
     * @description:spring cloud  mysql client  config 测试
     * @author:陈琳
     * @return:
     * @param
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String test() {
       /* Map<String,Object> condiMap=new HashMap<String,Object>();
        condiMap.put("benchType", 1);
        condiMap.put("benchCode",2);
        List<String> serviceIds = discoveryClient.getServices();
        StringBuffer services=new StringBuffer("");
        if(serviceIds!=null&&serviceIds.size()>0){
            for(String s : serviceIds){
                System.out.println("serviceId:" + s);
                List<ServiceInstance> serviceInstances =  discoveryClient.getInstances(s);
                if(serviceInstances!=null&&serviceInstances.size()>0){
                    for(ServiceInstance si:serviceInstances){
                        services.append(si.getServiceId()+"/n"+si.getClass()+"/n");

                    }
                }else{
                    services.append("no service.");
                }
            }
        }

        return "Welcome to Spring Cloud mysql client config read !\n"+
               services;*/
        BaseBenchBasicInfo baseInfo=this.restTemplate.getForObject("http://mysql/spring-cloud-client-mysql/",
                                             BaseBenchBasicInfo.class);

        return "";
    }

}

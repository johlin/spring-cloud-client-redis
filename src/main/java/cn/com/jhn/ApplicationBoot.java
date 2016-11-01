package cn.com.jhn;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

/**
 * SRPING BOOT FIRST EXAMPLE
 *
 * @author 陈琳
 * @create 2016-10-19 下午 3:33
 **/
@SpringBootApplication
@ServletComponentScan
@RestController
@EnableDiscoveryClient
public class ApplicationBoot extends SpringBootServletInitializer {



    public static void main(String[] args) throws Exception {
        SpringApplication springApplication = new SpringApplication(ApplicationBoot.class);
        springApplication.run(args);
    }
}

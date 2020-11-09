package com.kedacom.tz.sh.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.kedacom.tz.sh.service.fallbackFactory.EchoServiceFallbackFactory;

//SpringCloudAlibaba  降级必须与熔断器sentinel一起用才生效
@FeignClient(name = "nacos-producer", fallbackFactory = EchoServiceFallbackFactory.class)
public interface EchoService {
	@GetMapping(value = "/echo/{str}")
	String echo(@PathVariable("str") String str);
}

package com.kedacom.tz.sh.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {
	@Value("${info}")
	private String info;

	@GetMapping(value = "/config/getInfo")
	public String getConfig() {
		return info;
	}
}

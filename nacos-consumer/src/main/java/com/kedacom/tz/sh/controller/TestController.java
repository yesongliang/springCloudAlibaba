package com.kedacom.tz.sh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.kedacom.tz.sh.service.EchoService;

@RestController
public class TestController {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private EchoService echoService;

	@RequestMapping(value = "/echo/{str}", method = RequestMethod.GET)
	public String echo(@PathVariable String str) {
		return restTemplate.getForObject("http://nacos-producer/echo/" + str, String.class);
	}

	@RequestMapping(value = "/fegin/echo/{str}", method = RequestMethod.GET)
	public String echoFegin(@PathVariable String str) {
		return echoService.echo(str);
	}
}

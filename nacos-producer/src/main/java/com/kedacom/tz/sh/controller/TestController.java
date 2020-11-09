package com.kedacom.tz.sh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping(value = "/echo/{string}")
	public String echo(@PathVariable String string) {
		return string;
	}
}

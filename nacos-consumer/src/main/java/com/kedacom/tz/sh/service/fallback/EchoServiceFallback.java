package com.kedacom.tz.sh.service.fallback;

import com.kedacom.tz.sh.service.EchoService;

public class EchoServiceFallback implements EchoService {

	private Throwable throwable;

	public EchoServiceFallback(Throwable throwable) {
		this.throwable = throwable;
	}

	@Override
	public String echo(String str) {
		return "fallback,error message:" + throwable.getMessage();
	}

}

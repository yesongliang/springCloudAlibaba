package com.kedacom.tz.sh.service.fallbackFactory;

import org.springframework.stereotype.Component;

import com.kedacom.tz.sh.service.fallback.EchoServiceFallback;

import feign.hystrix.FallbackFactory;

@Component
public class EchoServiceFallbackFactory implements FallbackFactory<EchoServiceFallback> {
	@Override
	public EchoServiceFallback create(Throwable throwable) {
		return new EchoServiceFallback(throwable);
	}
}

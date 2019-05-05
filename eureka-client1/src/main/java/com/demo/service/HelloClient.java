package com.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient("client1")
public interface HelloClient {
	@RequestMapping(value = "/service-instances/{applicationName}")
	String hello(@PathVariable(value="applicationName") String applicationName);
}

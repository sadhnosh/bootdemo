package com.vg.springbootdemo.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vg.springbootdemo.model.FullResponse;
import com.vg.springbootdemo.model.Response;

@RestController
@RequestMapping("/healthcheck")
public class HealthController {
	
	
	@GetMapping()
	public Response getHealthStatus(@RequestParam("format") String format) {
		if(format.equals("short")) {
			return new Response("OK");
		}else {
			return new FullResponse("OK", new Date());
		}
	}

}

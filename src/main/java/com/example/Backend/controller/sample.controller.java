package com.example.Backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/api/sample")
public class SampleController {

	@GetMapping
	public String getSample() {
		return "Hello from Sample Controller";
	}

	@PostMapping
	public String createSample(@RequestBody String data) {
		return "Received: " + data;
	}

    
}
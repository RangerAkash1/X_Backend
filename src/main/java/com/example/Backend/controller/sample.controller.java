package com.example.Backend.controller;


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
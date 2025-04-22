package org.example.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestExceptionController {
	@GetMapping("/boom")
	public String boom() {
		throw new RuntimeException("테스트용 예외 발생!");
	}
}

package net.javaguides.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameCnt {
	
	@GetMapping("/Game")
	public String example() {
		return "Game";
	}
}

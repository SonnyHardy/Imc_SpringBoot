package com.sonny.imc;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;;


@RestController
@AllArgsConstructor
@RequestMapping(path = "imc", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
public class ImcController {
	
	private ImcService imcService;

	@PostMapping
	public @ResponseBody Map<String, String> calculate(@RequestBody ImcDTO data) {
		
		return this.imcService.calculate(data);
	}
}

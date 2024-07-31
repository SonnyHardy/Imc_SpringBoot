package com.sonny.imc;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.util.Map;

import org.springframework.web.bind.annotation.*;

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

	@GetMapping
	public Map<String, Object> getImc() {
		ImcDTO imc = new ImcDTO(80, 1.75);
		return Map.of("Poids", imc.poids(),
				"Taille", imc.taille(),
				"IMC", this.imcService.calculate(imc));
	}
}

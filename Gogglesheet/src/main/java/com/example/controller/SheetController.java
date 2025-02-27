package com.example.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.SheetService;



@RestController
@RequestMapping("/api/sheet")
public class SheetController {
	private final SheetService sheetService;

	public SheetController(SheetService sheetService) {
		this.sheetService = sheetService;
	}

	@GetMapping("/calculate")
	public String calculate(@RequestParam String formula) {
		return sheetService.evaluateFormula(formula);
	}
}

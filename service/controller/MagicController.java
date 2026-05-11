package com.example.magic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.magic.service.MagicService;

@Controller
public class MagicController{
	private final MagicService magicService;
	public MagicController(MagicService magicService) {
		this.magicService=magicService;}
	@GetMapping("/magic")
	public String recommend(
	        @RequestParam(required = false) String input,
	        Model model) {

	    if(input != null && !input.isEmpty()) {

	        String result = magicService.recommend(input);

	        model.addAttribute("result", result);
	    }

	    return "result";
	}}
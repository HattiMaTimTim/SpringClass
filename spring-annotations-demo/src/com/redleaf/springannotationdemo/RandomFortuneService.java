package com.redleaf.springannotationdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String [] fortunes = {
			"Beware",
			"Be diligent",
			"Really?"
	};
	
	@Override
	public String getFortune() {
		return fortunes[(new Random()).nextInt(fortunes.length)];
	}

}

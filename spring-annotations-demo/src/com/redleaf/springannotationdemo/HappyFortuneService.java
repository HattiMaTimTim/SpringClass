package com.redleaf.springannotationdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "You'll have a happy day";
	}

}

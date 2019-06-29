package com.redleaf.springannotationdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Will be a dull day tomorrow!";
	}

}

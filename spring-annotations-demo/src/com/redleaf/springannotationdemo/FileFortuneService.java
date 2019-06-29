package com.redleaf.springannotationdemo;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	private List<String> fortunes = new LinkedList<String>();

//	@Value("${fortunes.file}")
//	private String filename;

	private String filename = System.getProperty("user.dir") + "\\src\\fortunes.txt";

	public FileFortuneService() {
		//initializeFortunes();
	}

	@PostConstruct
	private void initializeFortunes() {
		//filename = System.getProperty("user.dir") + "\\src\\" + filename;
		Scanner scanner = null;
		System.out.println("Fortune file: " + filename);
		try {
			if (filename==null) throw new Exception("Input filename is null");
			scanner = new Scanner(new File(filename));
			while (scanner.hasNext()) {
				String fortune = scanner.nextLine();
				fortunes.add(fortune);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		finally {
			if (scanner != null) scanner.close();
		}
	}

	@Override
	public String getFortune() {
		return (fortunes==null || fortunes.size() < 1)? "No fortune for you!" : (String) fortunes.get((new Random()).nextInt(fortunes.size()));
	}

}

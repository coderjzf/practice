package com.jzf.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordCounterUtils {
	public void wordCount(String fileName, String word) throws FileNotFoundException, IOException {
		int count = 0;
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				int index;
				while (line.length() >= word.length() && (index = line.indexOf(word)) >= 0) {
					count++;
					line = line.substring(index + word.length());
				}
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		new WordCounterUtils().wordCount("f:\\wordcounter.txt", "jzf");
	}
}

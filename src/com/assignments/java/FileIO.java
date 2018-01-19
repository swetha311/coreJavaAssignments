package com.assignments.java;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileIO {

	public static void main(String[] args) {

		String path = "C:/Users/HanMin/Documents/test.txt";

		String content;

		try {

			content = new String(Files.readAllBytes(Paths.get(path)));
			System.out.println(content);

			// count the number of a's

			int count = 0;

			for (int i = 0; i < content.length(); i++) {

				if (content.charAt(i) == 'a') {
					count++;
				}

			}
			System.out.println("count a's " + count);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

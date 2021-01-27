package com.thinkitive.persist;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CapitalizeVowelsInFiles {
	public static void main(String[] args) {
		String s = readFile();
		System.out.println(s);
		writeFile(s);
	}

	public static String readFile() {
		StringBuilder sb = new StringBuilder();
		try (FileReader fr = new FileReader("mydemo.txt")) {
			int data = 0;
			while ((data = fr.read()) != -1) {
				char c = (char) data;
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
					sb.append((char) (c - 32));
				else
					sb.append(c);
			}
		} catch (IOException e) {
			System.out.println(e);
		}

		return sb.toString();
	}

	public static void writeFile(String s) {
		try (FileWriter fw = new FileWriter("mydemo.txt")) {
			fw.write(s);
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
}

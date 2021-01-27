package com.thinkitive.persist;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FirstFile {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		try (FileReader fr = new FileReader("first.txt"); FileWriter fw = new FileWriter("second.txt")) {
			int data = 0;
			while ((data = fr.read()) != -1) {
				sb.append((char) data);
			}
			fw.write(sb.toString());
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e1) {
			System.out.println(e1);
		}
	}
}

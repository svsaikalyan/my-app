package com.sai;

public class Table {
	public void tableFor(int j) {
		if (j>1) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(j + "*" + i + "=" + j * i);
			}
		}else {
			System.out.println("Please enter a valid number");
		}
	}
}

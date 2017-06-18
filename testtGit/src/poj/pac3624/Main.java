package poj.pac3624;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	static int r;
	static int c;
	static int[] w;
	static int[] v;
	// static int mv[][];//max value
	static int[] mv;

	public static void main(String[] args) throws FileNotFoundException {
		// File file=new File("c:/data.txt");
		// Scanner cin=new Scanner(file);

		Scanner cin = new Scanner(System.in);
		r = cin.nextInt();// r件物品
		c = cin.nextInt();// 袋子大小

		mv = new int[c + 1];
		w = new int[r + 1];// 第i件物品的重量
		v = new int[r + 1];// 第i件物品的价值

		for (int i = 1; i <= r; i++) {// input weight & value
			w[i] = cin.nextInt();
			v[i] = cin.nextInt();
		}

		for (int i = 1; i <= r; ++i) {
			for (int j = c; j >= w[i]; --j) {// j袋子剩余容量
				int a = mv[j - w[i]] + v[i];// 加上第i件物品的最大价值
				int b = mv[j];// 不加第i件物品的最大价值
				mv[j] = max(a, b);
			}
		}
		System.out.println(mv[c]);
	}

	static int max(int a, int b) {
		return a > b ? a : b;
	}

}
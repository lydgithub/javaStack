package cn.beijing;

import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestUUID implements Runnable {

	
	public static void main(String[] args) {
		ExecutorService pool=Executors.newFixedThreadPool(5);
		for (int i = 0; i < 8; i++) {
			pool.execute(new TestUUID());
		}
		pool.shutdown();
	}

	public static String genReqID(){
		return UUID.randomUUID().toString().toUpperCase();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(genReqID());
		}
	}
}

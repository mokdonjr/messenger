package com.example.mymessenger;

import com.example.mymessenger.common.StaticBaseBeanTest;
import org.junit.jupiter.api.Test;

import java.util.concurrent.*;

class MymessengerApplicationTests extends StaticBaseBeanTest {

	@Test
	void contextLoads() throws InterruptedException, ExecutionException, TimeoutException {
		System.out.println("1");
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Callable<String> task = this::doWork;

		Future<String> future = executorService.submit(task);
		System.out.println("future get : " + future.get(2, TimeUnit.SECONDS));
		System.out.println("2");

		//Executors.newSingleThreadExecutor().submit(this::doWork).get(2, TimeUnit.SECONDS);
	}

	public String doWork() throws InterruptedException {
		System.out.println("do work start!");
		TimeUnit.SECONDS.sleep(3);
		System.out.println("do work end!");
		return "do work return~";
	}

}

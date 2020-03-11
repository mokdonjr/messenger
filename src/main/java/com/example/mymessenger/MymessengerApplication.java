package com.example.mymessenger;

import com.example.mymessenger.common.StaticBaseBean;
import com.example.mymessenger.common.util.LogUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MymessengerApplication extends StaticBaseBean {

	public static void main(String[] args) {
		LogUtil.runWithStopWatch("어플리케이션 부팅 시간", () -> {
			SpringApplication.run(MymessengerApplication.class, args);
		});
	}

}

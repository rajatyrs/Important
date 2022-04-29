package com.Login;

import java.time.Duration;

import com.AmazonPage.AmazonLogin;

public class AmznLogin extends AmazonLogin {

	public static void main(String[] args) {

		AmazonLogin Momo = new AmazonLogin();

		Momo.PageLaunch();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().minimize();

	}

}

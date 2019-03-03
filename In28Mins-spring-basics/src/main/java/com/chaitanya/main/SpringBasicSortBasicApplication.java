package com.chaitanya.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.chaitanya.main.basic.BinarySearchImpl;

@Configuration
@ComponentScan
public class SpringBasicSortBasicApplication {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringBasicScopeApplication.class)) {

			BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
			BinarySearchImpl binarySearchImpl1 = applicationContext.getBean(BinarySearchImpl.class);

			System.out.println(binarySearchImpl);
			System.out.println(binarySearchImpl1);
			int result = binarySearchImpl.binarySearch(new int[] { 1, 2, 3, 5 }, 3);

			System.out.println(result);
		}
	}
}
package com.chaitanya.main.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {

	public BubbleSortAlgorithm() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int[] sortNumbers(int[] numbers) {
		// Bubble Sort Logic
		System.out.println("Using Bubble Sort!");
		return numbers;
	}
}

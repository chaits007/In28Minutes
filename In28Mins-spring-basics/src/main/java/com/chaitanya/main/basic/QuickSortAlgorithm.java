package com.chaitanya.main.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {

	public QuickSortAlgorithm() {
		System.out.println("QuickStart Object Created!");
	}

	@Override
	public int[] sortNumbers(int[] numbers) {
		// Quick Sort Logic
		System.out.println("Using QuickSort");
		return numbers;
	}
}

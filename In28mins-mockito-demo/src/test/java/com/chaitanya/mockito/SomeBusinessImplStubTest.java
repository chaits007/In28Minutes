package com.chaitanya.mockito;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SomeBusinessImplStubTest {

	@Test
	public void test() {
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(new DataServiceStub());
		assertEquals(5, someBusinessImpl.findGreatest());
	}
}

class DataServiceStub implements DataService {

	@Override
	public int[] retreiveAllData() {
		return new int[] { 5, 2, 3 };
	}

}

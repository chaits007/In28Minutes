package com.chaitanya.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

public class SomeBusinessImplMockTest {

	@Test
	public void testFindGreatestWith3Numbers() {

		DataService dataServiceMock = Mockito.mock(DataService.class);
		when(dataServiceMock.retreiveAllData()).thenReturn(new int[] { 5, 4, 2 });

		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceMock);
		assertEquals(5, someBusinessImpl.findGreatest());
	}

	@Test
	public void testFindGreatestWith1Numbers() {

		DataService dataServiceMock = Mockito.mock(DataService.class);
		when(dataServiceMock.retreiveAllData()).thenReturn(new int[] { 5 });

		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceMock);
		assertEquals(5, someBusinessImpl.findGreatest());
	}

	@Test
	public void testFindGreatestWithNoNumbers() {

		DataService dataServiceMock = Mockito.mock(DataService.class);
		when(dataServiceMock.retreiveAllData()).thenReturn(new int[] {});

		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceMock);
		assertEquals(Integer.MIN_VALUE, someBusinessImpl.findGreatest());
	}
}
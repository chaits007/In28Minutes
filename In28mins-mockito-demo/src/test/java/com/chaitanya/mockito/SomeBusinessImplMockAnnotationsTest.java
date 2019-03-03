package com.chaitanya.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessImplMockAnnotationsTest {

	@Mock
	DataService dataServiceMock;

	@InjectMocks
	SomeBusinessImpl someBusinessImpl;

	@Test
	public void testFindGreatestWith3Numbers() {

		when(dataServiceMock.retreiveAllData()).thenReturn(new int[] { 5, 4, 2 });
		assertEquals(5, someBusinessImpl.findGreatest());
	}

	@Test
	public void testFindGreatestWith1Numbers() {
		when(dataServiceMock.retreiveAllData()).thenReturn(new int[] { 5 });
		assertEquals(5, someBusinessImpl.findGreatest());
	}

	@Test
	public void testFindGreatestWithNoNumbers() {
		when(dataServiceMock.retreiveAllData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE, someBusinessImpl.findGreatest());
	}
}
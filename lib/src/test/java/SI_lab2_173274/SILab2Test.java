package SI_lab2_173274;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SILab2Test {
	
		private List<Time> createList(Time...times){
			return new ArrayList<>(Arrays.asList(times));
		}
			
		@Test
		public void MultipleconditionTest1 () {
			
			RuntimeException ex;
			
			Time time = new Time(25,0,0);
			
			ex = assertThrows(RuntimeException.class,()->SILab2.function(createList(time)));
			
			//assertTrue(ex.getMessage().contains("The hours are smaller than the minimum"));
			assertTrue(ex.getMessage().contains("The hours are grater than the maximum"));
			
						
		}
		
		@Test
		public void MultipleconditionTest2() {
			
			RuntimeException ex;
			
			Time time = new Time(1,60,0);
			
			ex = assertThrows(RuntimeException.class,()->SILab2.function(createList(time)));
			
			//assertTrue(ex.getMessage().contains("The hours are smaller than the minimum"));
			assertTrue(ex.getMessage().contains("The minutes are not valid!"));
			
						
		}
		
		@Test
		public void MultipleconditionTest3() {
			Time time = new Time(24,0,0);
			List<Integer> lista_rez = new ArrayList<>();
			lista_rez.add(86400);
			assertEquals(SILab2.function(createList(time)),lista_rez);			
		}
		
		
		
	
}

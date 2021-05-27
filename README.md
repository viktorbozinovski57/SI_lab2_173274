# Viktor Bozinovski 173274

![Control Flow Graph](https://user-images.githubusercontent.com/82264456/119826726-9e2f5100-bef8-11eb-8268-cea5b26b22eb.jpg)

 3.Цикломатската комплексност е мерка за комплексноста на програмата.Цикломатската комплексност за дадениот код е 7.Се добива според формулата:
V(G) = E – N + 2
E = flow graph edges
N = flow graph nodes
V(G) = 28 edges – 23 nodes + 2 = 7

  	@Test
		public void MultipleconditionTest1() {
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
  
  
	

		



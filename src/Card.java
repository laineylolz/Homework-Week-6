
public class Card {

	//i. Fields:
		
		private int value;
		private String name;
		
		public Card(int value, String name) {
				this.name = name;
				this.value = value;
			}
			
	//ii. Methods
		
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
		}
		public void getName() {
			System.out.println(name);
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public void describe() {
			System.out.printf("%s \n", name);
		
		}
}

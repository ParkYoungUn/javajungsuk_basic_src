class Card {
	String kind;
	int number;

	Card() {
		this("SPADE", 1);
	}

	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
}

//		String toStiring() {
//			System.out.println(this+"---------");
//		}
//		public String toString(){
//			return "kind"+kind;
//		}

class Ex9_4 {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		
		Class c31 = c1.getClass();
		

		System.out.println(Card.class.getName());
		System.out.println(c1.getClass());
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}
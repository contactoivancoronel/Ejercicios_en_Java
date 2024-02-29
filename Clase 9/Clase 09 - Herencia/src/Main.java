
public class Main {

	public static void main(String[] args) {

		Tiburon tibu = new Tiburon();
		
		Mojarrita moji = new Mojarrita();

		System.out.println("Mojarrita");
		moji.nadar(2);		
		
		System.out.println("Tiburon");
		tibu.nadar(20);
		tibu.asustar();
		System.out.println("-----------------------------");

		System.out.println("Tiburon");
		Pez pecesin = tibu;
		pecesin.nadar(5);

		System.out.println("Mojarrita");
		pecesin = moji;
		pecesin.nadar(5);
		
	}

}

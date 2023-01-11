package Day5Practice;

public class FlipCoin {
	 

	public static void main(String[] args) {
		int FlipCoin = (int) (Math.random() * 10) % 2;
		if(FlipCoin ==1) {
			System.out.println("head");
		}else {
			System.out.println("tail");
		}
	}

}

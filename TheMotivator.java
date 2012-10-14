
public class TheMotivator {

	
	public void feedback(int score) {
		if (score == 100)
			System.out.println("You're awesome");
		else if (score == 65)
			System.out.println("duh, added to master");
		else if (score == 69) {
			System.out.println("chg69branch");
			System.out.println("babble");
		}
		else if (score > 90)
			System.out.println("That's great");
		else if (score > 60)
			System.out.println("That's good ");
		else
			System.out.println("Well, what can I say?");
	}
	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
		tm.feedback(69);
	}

}

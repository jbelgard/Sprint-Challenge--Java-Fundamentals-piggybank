package piggyBank;

import java.util.ArrayList;

public class Main
{
	public static void main(String[] args)
	{
		ArrayList<Money> piggyBank1 = new ArrayList<>();

		piggyBank1.add(new Dollar(5, 1));
		piggyBank1.add(new Quarter(1, 0));
		piggyBank1.add(new Dime(17, 0));
		piggyBank1.add(new Nickel(55, 0));
		piggyBank1.add(new Penny(12, 0));

		piggyBank1.forEach(piggy -> System.out.println(piggy.stringValue()));

		double myPiggies = 0.0;
		for (Money m : piggyBank1)
		{
			myPiggies = myPiggies + m.getValue();
		}

		double notMyPiggies = 0.0;
		for (Money m : piggyBank1)
		{
			notMyPiggies = myPiggies - notMyPiggies - m.getReducedValue();
		}

		System.out.println("********************************");
		System.out.println('\n');
		System.out.println("My Piggie has $" + myPiggies);
		System.out.println('\n');
		System.out.println("********************************");
		System.out.println('\n');
		System.out.println("My Piggie now has $" + notMyPiggies);
		System.out.println('\n');
		System.out.println("********************************");
	}
}
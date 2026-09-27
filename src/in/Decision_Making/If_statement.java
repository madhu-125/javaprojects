package in.Decision_Making;

import java.util.Scanner;

public class If_statement {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("What is your Online Test..?");
		String examStatus = sc.nextLine();

		if (examStatus.equals("pass")) {
			System.out.println("Please Wait for Round-1");
			String Round1 = sc.nextLine();

			if (Round1.equals("pass")) {
				System.out.println("Please Wait for Round-2");
				String Round2 = sc.nextLine();

				if (Round2.equals("pass")) {
					System.out.println("Please Wait for Final Round");
					String f_round = sc.nextLine();

					if (f_round.equals("pass")) {
						System.out.println("Are you Qulify all rounds, Congralations ..!");
					} else {
						System.out.println("you can fail this round Shell we leave Today");
					}
				} else {
					System.out.println(" you can fail this round Shell we leave Today");
				}
			} else {
				System.out.println("you can fail this round Shell we leave Today");
			}
		} else {
			System.out.println("you can fail this round Shell we leave Today");
		}

	}

}

package finalpractice;

import java.util.Scanner;

public class Text {

	public static void main(String[] args) {
		String PhoneBook[][] = { { "�j��", "032125678" }, { "�R�y", "0226713456" }, { "�ަw", "075534321" } };

		System.out.print("�п�J�Q�䪺�H�W�G");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();

		for (int i = 0; i < 3; i++) {
			if (PhoneBook[i][0].equals(name)) {
				System.out.println(PhoneBook[i][0] + " " + PhoneBook[i][1]);
				break;
			}else {
				System.out.println("�d�L���H");
				break;
			}
		}
	}

}

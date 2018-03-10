package finalpractice;

import java.util.Scanner;

public class Text {

	public static void main(String[] args) {
		String PhoneBook[][] = { { "大雄", "032125678" }, { "靜宜", "0226713456" }, { "技安", "075534321" } };

		System.out.print("請輸入想找的人名：");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();

		for (int i = 0; i < 3; i++) {
			if (PhoneBook[i][0].equals(name)) {
				System.out.println(PhoneBook[i][0] + " " + PhoneBook[i][1]);
				break;
			}else {
				System.out.println("查無此人");
				break;
			}
		}
	}

}



class Encode {

	public static void main(String args[]) {
		    String openWord =  "Тhis is a test.";
			String closeWord = "";
			String decmsg = "";
			int key = 88;
			System.out.print("Исходное сообщение: ");
			System.out.println(openWord + "\n");

			for(int i = 0; i < openWord.length(); i++)
				closeWord += (char) (openWord.charAt(i) ^ key);

			System.out.println("Зашифрованное сообщение : " + closeWord);


			for(int i = 0; i < openWord.length(); i++)
				decmsg += (char) (closeWord.charAt(i) ^ key);

			System.out.println("Дешефрованное сообщение : " + decmsg);

	}
}
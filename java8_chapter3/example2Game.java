import java.util.Random;

class example2Game{
	public static void main(String args[])
		throws java.io.IOException{

	Random random = new Random();
	int num = 97 + random.nextInt((97 + 26) - 97);
	char ch, answer = (char) (num);
	boolean p;

	System.out.println("Загадана буква из диапазона a-z.");
	System.out.print("Попытайтесь её угадать: ");
    ch = (char) System.in.read();

    p = (ch == answer)? true: false;
 	
 	if(p) 
 		System.out.println("** Правильно! **");
 	
 	else
    	System.out.println("Правильный ответ: " + answer);


	}
}
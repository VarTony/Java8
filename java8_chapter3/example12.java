class example12{
	public static void main(String args[])
		throws java.io.IOException{
			char ch;
			int i = 0;

				System.out.println("Для завершения программы введите '.' ");

     for( ; ; ){

     	ch = (char) System.in.read();
     	if(ch >= 'a' & ch <= 'z'){
     	 i++;
     	 ch -= 32;
     	 System.out.print(ch);
     	}

     	else if(ch >= 'A' & ch <= 'Z'){
     	 i++;
     	 ch += 32;
     	 System.out.print(ch);
     	}

     	else if(ch == ' ') System.out.print(ch);


     	else if(ch == '.') break;
     }

     System.out.println("Колличество изменений - " + i);



	}
}
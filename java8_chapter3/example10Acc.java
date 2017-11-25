class example10Acc{
	public static void main(String args[])
		throws java.io.IOException{
			char ch;
			int i = 0;

				System.out.println("Для завершения программы введите '.' ");

     for( ; ; ){

     	ch = (char) System.in.read();
     	if(ch == ' ') i++;
     	if(ch == '.') break;
     }

     System.out.println("Колличество пробелов - " + i);



	}
}
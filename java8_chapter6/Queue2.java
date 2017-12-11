class ClassQueue2 {

private char q[];
private int putloc, getloc, Size;




ClassQueue2(int Size) {
	this.Size = Size;
	q = new char[Size + 1];
	putloc = getloc = 0;
}

ClassQueue2(char a[]) {
	q = new char[a.length + 1];
	putloc = 0;
	getloc = 0;

	for(int i = 0; i < a.length; i++)
		put(a[i]);
}

ClassQueue2(ClassQueue2 ob) {
	q = new char[ob.q.length];
	putloc = ob.putloc;
	getloc = ob.getloc;

	for(int i = getloc + 1; i < putloc + 1; i++)
		q[i] = ob.q[i];
}


 void put(char ch){
 	if(putloc == q.length - 1) {
 		System.out.println(" [>_<] Очередь заполнена; ");
 		return;
	}

	putloc++;
	q[putloc] = ch;

}

char get(){
	if(putloc == getloc){
		System.out.println(" [^_^] Очередь пуста; ");
		return (char) 0;
	}

	getloc++;
	return q[getloc];
}
}

class Queue2 {
	public static void main(String args[]) {

	ClassQueue2 q1 = new ClassQueue2(10);
	char name[] = {'T', 'o', 'm', 'm', 'y'};
	ClassQueue2 q2 = new ClassQueue2(name);

	char ch;
	int i;

	for(i = 0; i < 10; i++) {
		q1.put((char) ('A' + i));		
	}

	ClassQueue2 q3 = new ClassQueue2(q1);

	System.out.print("Содержимое q1 : ");
	for(i = 0; i < 10; i++) {
		ch = q1.get();
		System.out.print(ch);
}

		System.out.println();
		System.out.println();


	System.out.print("Содержимое q2 : ");
	for(i = 0; i < 10; i++) {
		ch = q2.get();
		System.out.print(ch);
}
		System.out.println();
		System.out.println();



	System.out.print("Содержимое q3 : ");
	for(i = 0; i < 10; i++) {
		ch = q3.get();
		System.out.print(ch);
}
		System.out.println();
		System.out.println();


}
}
class Queue {

private char q[];
private int putloc, getloc, Size;

Queue(int Size) {
	this.Size = Size;
	q = new char[Size + 1];
	putloc = getloc = 0;
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
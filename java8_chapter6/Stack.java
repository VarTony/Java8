
 	class Stack {
 
 			private char aValue[];
 			private int j = 0;
 			private int size;

 			Stack(int size) {
 				this.size = size;
 				aValue = new char[size];

 			}

 			 
 			void setStack(char value) {
 				if(j > this.size){
 					System.out.println("Стэк заполнен;");
 					return;
 				}
 				aValue[j] = value;
 				j++;
 				System.out.println("В стэк добавлен элемент: " + value);
 				System.out.println("Стек: " + aValue);
 			}


 			 char getStack() {
 			 	if(j <= 0){
 			 		System.out.println("Стэк пуст;");
 			 		return  (char) '_';
 			 	}

 			 	j--;
 			 	return aValue[j];

 			 }

 }
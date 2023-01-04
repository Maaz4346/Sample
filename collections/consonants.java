package collections;

public class consonants {
	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		System.out.println("the size of the arraylist before passing any elemen is :"+al.size());
		for(char i='a';i<='z';i++)
		{
			al.add(i);}
			System.out.println("the followingt in data present int arraylist");
		System.out.println(al);
		Object alpha[]=al.toArray();
		System.out.println("the consonants are :");
		for(Object o:alpha) {
			char ch =(char)o;
			
			if (ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u') {
				
				System.out.print(ch+" ");
		}
			
			}
	}
	}

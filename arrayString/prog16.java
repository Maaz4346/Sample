package arrayString;

public class prog16 {
public static void main(String[] args) {
	String s="washing powder nirma washing powder nirma doodh se safeedi";
	String[]s1=s.split(" ");
	
		for(int i=0;i<s1.length;i++) {
			int count=0;
			
			for(int j=i+1;j<s1.length;j++) {
			 if(s1[i].equals(s1[j])&&i>j) {
				 count++;
			 }	
			 if(s1[i].equals(s1[j])) {
				 count++;
				 
			 }
			 
			}
			
		}
	}

}

package assignment;

public class cont {

	public static void main(String[] args) {
     int first = 5, second = 20;
     do {
    	 if(first++ > --second) {
    		 continue;
    	 }
     }while(first <15);
     System.out.println("first = " + first + "and second = "+ second);
	}

}

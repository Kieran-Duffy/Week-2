//Exercise2.java
/* This program when run displays Title,author and other info of harry potter using integers
 *, floats, and strings*/ 



public class Exercise2{
	public static void main(String args[])
		{
		  
		  String info1 = "Title", info2 = "Harry Potter and the prisoner of Azkabhan", info3 = "author", info4 = "JK Rowling", info5 = "Number of pages", info6 = "Year published", info7 = "Price" ;
		  int pageNumber = 317, yearPublish = 1999 ;
		  float bookPrice = 35.50f ;
		  
		  	String formatString= String.format("%-25s%-1s\n%-25s%-1s\n%-25s%-1d\n%-25s%-1d\n%-25s%.1f",
		  	info1,info2,info3,info4,info5,pageNumber,info6,yearPublish,info7,bookPrice);
		  	
		  	
		  
		  
		  
		  System.out.println(formatString);
		}
		
} 
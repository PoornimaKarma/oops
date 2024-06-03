package singleinheritance;
   class dadaji
 {
	  int property=1000000;
 }
  public class inheritance extends dadaji 
  {
	  int myproperty =1000;
      public static void main(String args[]){
	 inheritance i= new inheritance();
	 System.out.println("dadaji ki property" +i.property);
	 System.out.println(" my property" +i.myproperty);
   }
}

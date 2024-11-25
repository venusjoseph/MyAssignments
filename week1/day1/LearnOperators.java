package week1.day1;

public class LearnOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Assignment operator
         int number =7;
         number=number+2;
         System.out.println("The number is " +number);
         System.out.println("\n");
         //arithmetic operator
         int a=10;
         int b=2;
         System.out.println("The addition result is " +(a+b));
         System.out.println("The subtraction result is " +(a-b));
         System.out.println("The multiplication result is " +(a*b));
         System.out.println("The division result is " +(a/b));
         System.out.println("The percentage result is " +(a%b));
         System.out.println("\n");
         //condition check
         int c=8;
         int d=6;
         System.out.println(c==d);
         System.out.println(c!=d);
         System.out.println(c<d);
         System.out.println(c<=d);
         System.out.println(c>d);
         System.out.println(c>=d);
         System.out.println("\n");
         //logical operator
         int e=4;
         int f=6;
         System.out.println(e<f && e==f);
         System.out.println(e<f && e<=f);
         System.out.println(e==f || e<f);
         System.out.println("\n");
         //Post and pre increment operator
         int p=7;
         int q=11;
         // p values is incremented to 1 after returning the current value  i.e 7
         System.out.println("Post-Increment");      
         System.out.println(p++);       
         // q is incremented to 1 and then it's value is returned
         System.out.println("Pre-Increment");               
         System.out.println(++q);      
         System.out.println("\n");
         
         //Post and pre decrement operator
         int r=5;
         int s=19;
         // r values is decremented to 1 after returning the current value  i.e 7
         System.out.println("Post-Decrement");      
         System.out.println(r--);       
         // s is decremented to 1 and then it's value is returned
         System.out.println("Pre-Decrement");               
         System.out.println(--s);      
         System.out.println("\n");
         
         
	}

}

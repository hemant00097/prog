
public class Test {
	public static void main(String[] args) 
	{
		// declaration & instatiation
		int x[]=new int[5];
		// initlization 
		x[0]=100;
		x[1]=200;
		x[2]=300;
		x[3]=400;
		x[4]=500;
		// x[5]=900;     Runtime Errer
		System.out.println("Accessing pasticular data from  Array");
		int a= x[3];
		System.out.println(x[1]);
		//System.out.println(x[7]);       Runtime Errer
				
	}

}
// import java.util.Scanner ; class A2 
// { 
// 	public static void main(String[] args) 
// 	{
// 		 Scanner s = new Scanner(System.in ) ;
// 		  char[] a = new char[ 5 ] ; // read data from the user
// 		   for (int i = 0 ; i < a.length ; i++ )
// 		  {
// 			 a[i] = s.next().charAt(0) ;
// 		  } // read a key character 
		  
// 		 char key = s.next().charAt( 0 ) ; // create a count variable 
// 		 int count = 0 ; // find frequency
// 		  for (int i = 0 ; i < a.length ; i++ )
//           {
// 	         if ( key == a[i] )
// 	         {
// 		        count ++ ; 
// 		     } 
// 		  }// end of for System.out.println( count ) ;
// 	}
// }
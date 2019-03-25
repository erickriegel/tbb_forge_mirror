package fr.asipsante.tra.forge;

/**
 * Hello world!
 *
 */
import org.apache.commons.beanutils.converters.DateConverter;
 
 public class App 
{
	public static boolean test1, test2;
	public String mot1, mot2;
	
    public static void main( String[] args )
    {
    	System.out.println( "Hello World! "  + new DateConverter().toString());
		test1 = true;
		test2 = false;
		if (test1) doSomething();
    }
	
	public static void doSomething(){
		System.out.println("Coucou");
	};
	
	public String doSomething2(){
		mot1 = "test";
		mot2 = "retest";
		return (mot1);
	};
}

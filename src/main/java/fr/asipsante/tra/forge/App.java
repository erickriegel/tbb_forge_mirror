package fr.asipsante.tra.forge;

/**
 * Hello world!
 *
 */
import org.apache.commons.beanutils.converters.DateConverter;
 
 public class App 
{
	public static boolean test1, test2;
	
    public static void main( String[] args )
    {
    	System.out.println( "Hello World! "  + new DateConverter().toString());
		test1 = true;
		if (test1) doSomething();
    }
	
	public static void doSomething(){
		System.out.println("Coucou");
	};
}

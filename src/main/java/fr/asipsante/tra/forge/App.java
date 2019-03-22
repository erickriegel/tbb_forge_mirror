package fr.asipsante.tra.forge;

/**
 * Hello world!
 *
 */
import org.apache.commons.beanutils.converters.DateConverter;
 
 public class App 
{
	String test1, test2;
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World! "  + new DateConverter().toString());
		test1 = true;
		
		doSomething(){
			System.out.println("Coucou");
		};
		
		if (test1) doSomething();
    }
}

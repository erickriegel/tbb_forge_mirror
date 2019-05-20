package fr.asipsante.tra.forge;

/**
 * Hello world!
 *
 *
 */
import org.apache.commons.beanutils.converters.DateConverter;
 
 public class App 
{
	public static boolean test1, test2;
	private String PASSWORD = "password";
	
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
		String mot1 = "test", mot2 = "retest";
		int chiffre1, chiffre2;
		chiffre1 = 1;
		try {
		}
		catch (Exception e){
		}
		return (mot1);
	};
}

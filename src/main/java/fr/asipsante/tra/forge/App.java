package fr.asipsante.tra.forge;

/**
 * Hello world!
 *
 */
import org.apache.commons.beanutils.converters.DateConverter;
 
 public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World! "  + new DateConverter().toString());
    }
}

public class Hello
{
 public static void main( String argv[] )
 {
	 //Indent the lines my guy ew
 String name = "World";
 if ( argv.length != 0 )
 {
 name = argv[0];
 }
 System.out.println( "Hello, " + name + "!" );
 }
}
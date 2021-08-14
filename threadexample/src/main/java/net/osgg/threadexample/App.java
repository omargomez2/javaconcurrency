package net.osgg.threadexample;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	new ColourThread("Black").start();
        new ColourThread("White").start();
    }
}

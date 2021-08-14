package net.osgg.threadexample;

import net.osgg.threadexample.ColourThread;

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

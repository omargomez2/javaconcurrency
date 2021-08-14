package net.osgg.threadexample;

public class ColourThread extends Thread{

	public ColourThread(String str) {
        super(str);
    }
    
    public void run() {
        for (int i = 0; i < 7; i++) {
            System.out.println(i+1 + " " + getName());
            try {
                sleep((int)(Math.random() * 500));
            } catch (InterruptedException e) {}
        }
        System.out.println("DONE! " + getName());
    }
}

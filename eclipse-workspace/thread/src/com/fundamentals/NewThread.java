package com.fundamentals;

  class NewThread implements Runnable {
	Thread t;

	public NewThread() {
		t = new Thread(this, "Child Thread");
		t.start();
	}

	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(t + ":" + i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Child Thread Exiting");
	}
}

public class CreatingThread {
	public static void main(String args[])
	{
		new NewThread();
		Thread t=Thread.currentThread();
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println(t+":" +i);
				Thread.sleep(500);
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.println("Main Thread Exiting");
		}
}
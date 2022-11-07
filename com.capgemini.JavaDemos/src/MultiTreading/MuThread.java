package MultiTreading;


class e extends Thread{
	
	public void run()
	{
		System.out.println("Eclipse Thread name is"+ Thread.currentThread().getName());
		System.out.println("Eclipse Thread ID is"+ Thread.currentThread().getId());

	}
}

class c extends Thread
{
	public void run()
	{
		System.out.println("calculator Thread name is"+ Thread.currentThread().getName());
		System.out.println("calculator Thread ID is"+ Thread.currentThread().getId());

	}

}

class Ch extends Thread{
	public void run()
	{
		System.out.println("Chrome Thread name is"+ Thread.currentThread().getName());
		System.out.println("Chrome Thread ID is"+ Thread.currentThread().getId());
	}
}

class On extends Thread{
	public void run()
	{
		System.out.println("OneNote Thread name is"+ Thread.currentThread().getName());
		System.out.println("OneNote Thread ID is"+ Thread.currentThread().getId());	}
}
public class MuThread {

	
	public static void main(String[] args) {
		Eclipse e=new Eclipse();	
	    e.start();
	    
	    calculator c=new calculator();	
	    c.start();
	
	    Chrome ch=new Chrome();	
	    ch.start();
	    
	    OneNote on=new OneNote();	
	    on.start();
	    
	    for (int i = 0; i < 4; i++) {
			System.out.println("Main Thread name is" + Thread.currentThread().getName());
			System.out.println("Main Thread ID is" + Thread.currentThread().getId());
		}
	}

}

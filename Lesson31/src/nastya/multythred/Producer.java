package nastya.multythred;

public class Producer implements Runnable {
	private final Warehouse warehouse;
	
	public Producer (Warehouse warehouse) {
		this.warehouse = warehouse;
	}
	@Override
	
	public void run() {
		for (int i = 1; i <= 5; i++) {
			warehouse.put(i);
			try {Thread.sleep(500);} catch (InterruptedException e) {}
			
			}
		}
	}
	



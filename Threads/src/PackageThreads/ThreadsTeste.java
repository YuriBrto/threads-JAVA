package PackageThreads;

public class ThreadsTeste {
static int i = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Thread(t1).start();
new Thread(t2).start();
	}

	private static void contador(String name) {
		i++;
		System.out.println("O valor do contador atual é " +i+ " Thread :" + name);
		
	}
	private static Runnable t1 = new Runnable() {
		public void run() {
		try {
for(int i=0; i<5;i++) {
	contador("t1");
}			
		} catch (Exception e) {
		}	
		}
	};
	
	//T2
	private static Runnable t2 = new Runnable() {
		public void run() {
		try {
for(int i=0; i<5;i++) {
	contador("t2");
}			
		} catch (Exception e) {
		}	
		}
	};
}

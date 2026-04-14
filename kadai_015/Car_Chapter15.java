package kadai_015;

public class Car_Chapter15 {
	
	private int gear = 1;
	private int speed = 10;
	
	 public Car_Chapter15( int gear, int speed ) {
	        this.gear = gear;
	        this.speed = speed;
	        }
	
	public void changeGear(int afterGear) {
		if(afterGear == 1) {
			speed = 10;
			System.out.println("ギア" + gear + "から1に切り替えました" );
			gear = 1;
		}else if(afterGear == 2) {
			speed = 20;
			System.out.println("ギア" + gear + "から2に切り替えました" );
			gear = 2;
		}else if(afterGear == 3) {
			speed = 30;
			System.out.println("ギア" + gear + "から3に切り替えました" );
			gear = 3;
		}else if(afterGear == 4) {
			speed = 40;
			System.out.println("ギア" + gear + "から4に切り替えました" );
			gear = 4;
		}else if(afterGear == 5) {
			speed = 50;
			System.out.println("ギア" + gear + "から5に切り替えました" );
			gear = 5;
		}else {
			speed = 10;
		}			
	}
	
	public void run() {
		System.out.println("速度は時速" + speed + "kmです");
	}


}

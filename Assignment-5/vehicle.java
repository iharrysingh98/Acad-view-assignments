 abstract class VehicleAbstract {
  abstract void start();
	public void stop(){
		System.out.println("Stopping Vehicle in abstract class");
	}
}
class TwoWheeler extends VehicleAbstract{


	public void start() {
		System.out.println("Starting Two Wheeler");
	}

}
class FourWheeler extends VehicleAbstract{
 

	public void start() {
		System.out.println("Starting Four Wheeler");
	}
}



class VehicleTesting {
	public static void main(String[] args) {
		VehicleAbstract my2Wheeler = new TwoWheeler();
		VehicleAbstract my4Wheeler = new FourWheeler();
		my2Wheeler.start();
		my2Wheeler.stop();
		my4Wheeler.start();
		my4Wheeler.stop();
	}
}

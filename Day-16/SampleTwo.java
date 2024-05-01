
public class SampleTwo { // main class
    
	public static void main(String args[]) // main methods
	{

		MountainBike mb = new MountainBike(3, 100, 25);// value
		System.out.println(mb.toString());
	}
//}
    
}

// base class
class Bicycle { // bicycle
    
	// the Bicycle class has two fields
	public int gear; // gear
	public int speed;// speed

	// the Bicycle class has one constructor
	public Bicycle(int gear, int speed)
	{
		this.gear = gear;// ini
		this.speed = speed;// ini
	}

	// the Bicycle class has three methods
	public void applyBrake(int decrement)
	{
		speed -= decrement;// speed
	}

	public void speedUp(int increment)
	{
		speed += increment;//inc.
	}

	// toString() method to print info of Bicycle
	public String toString()
	{
		return ("No of gears are " + gear + "\n"
				+ "speed of bicycle is " + speed);// fields
	}
}

// derived class
class MountainBike extends Bicycle {//class mountain bike extends bicycle

	// the MountainBike subclass adds one more field
	public int seatHeight;// seat height

	// the MountainBike subclass has one constructor
	public MountainBike(int gear, int speed,
						int startHeight)
	{
		// invoking base-class(Bicycle) constructor
		super(gear, speed);
		seatHeight = startHeight;// ini
	}

	// the MountainBike subclass adds one more method
	public void setHeight(int newValue)
	{
		seatHeight = newValue; // sear height new value
	}

	// overriding toString() method
	// of Bicycle to print more info
	@Override public String toString()
	{
		return (super.toString() + "\nseat height is "
				+ seatHeight);// seat height
	}
}


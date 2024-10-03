public class PlymrpsmOverride{
	
	void cars(){
		System.out.println("Some cars");
	}
}

class PrivateCar extends PlymrpsmOverride{
	@Override
	void cars(){
		System.out.println("This is private car.");
	}
}
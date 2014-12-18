package base.containerTest;

public class EnumTest {
	public enum MyDoorOpener {
		ME,MYWIFE;
	}

	public static void main(String[] args) {
		MyDoorOpener m = MyDoorOpener.MYWIFE;
		switch(m){
		case ME:
			 System.out.println("ME");
			 break;
		case MYWIFE:
			System.out.println("MYWIFE");
			break;
			default:
				System.out.println("default");
		}
	}

}

/*enum MyDoorOpener{
	ME,MYWIFE
}*/

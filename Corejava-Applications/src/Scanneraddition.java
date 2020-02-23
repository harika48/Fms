import java.util.Scanner;

public class Scanneraddition {
	public static void main(String[] args) {
		String name;
		 Scanner in= new Scanner(System.in);
		 System.out.println("Enter name");
		 name=in.nextLine();
		 System.out.println("Enter the first no");
		 int i =in.nextInt();
		System.out.println("enter the second no");
		int j = in.nextInt();
		int z=i+j;
		System.out.println("Addition:"+z);
		System.out.println("Name:"+name);
	}

}

import java.util.Scanner;
public class Human {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan= new Scanner(System.in);
System.out.println("Enter the first name, middle initial, and last name");

String Firstname= scan.nextLine();
String Lastname= scan.nextLine();
String Middleinitial= scan.nextLine();

Human2 human = new Human2(Firstname, Lastname, Middleinitial, "Doctor", 35);

System.out.println(human.Firstname);
System.out.println(human.Middleinitial);

Human2 human2= new Human2 (Firstname, Lastname, Middleinitial, "Pharmacist", 32);

System.out.println(human.Firstname+'\t'+human.Middleinitial+'\t'+human.Lastname+'\t'+human.Career+'\t'+human.YearsOld);

System.out.println(human2.Firstname+'\t'+human2.Middleinitial+'\t'+human2.Lastname+'\t'+human2.Career+'\t'+human2.YearsOld);
	}

}

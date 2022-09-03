package primitiveDataTypes;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//operators perform actions on operands
		// there are many operators, such as + - * / = for example
		String firstName = "Edward";
		String lastName = "Smith";
		String fullName = firstName + " " + lastName; //concatenation
		System.out.println(fullName);
		
		int age = 35;
		System.out.println(age);
		boolean isAge30 = age == 30;
		System.out.println("Are you 30?");
		System.out.println(isAge30);
		System.out.println("Are you 35?");
		System.out.println(age == 35);
		
		System.out.println("Next year, how old will you be?");
		age = age +1;
		System.out.println(age);
		

		
		
	}

}

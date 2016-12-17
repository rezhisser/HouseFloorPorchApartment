package com.gmail.rezhisser;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter apartment number");
		int numberApartment = sc.nextInt();
		
		int countFloors = 9; // count floors
		int countPorchs = 4; // count Porch
		int countApartmentsFloor = 4; // the count of apartments per floor
		int numberPorch = 0; // number Porch
		
		int countApartmentsPorch = countFloors*countApartmentsFloor; // the count of apartments per Porch
		
		if (numberApartment > 0 && numberApartment <= countApartmentsPorch*countPorchs){ //check whether there is such an apartment in house

		numberPorch =   (int) (Math.ceil(numberApartment/countApartmentsPorch + 1)); // define the number Porch
		
		int nn = numberApartment%countApartmentsPorch; // special hack for floors, an multiples countFloors, which return 0
		
		if (nn==0){
			numberPorch = numberPorch -1;
		}
		
		System.out.println("number of the Porch " + numberPorch);
		
		
		int numberFloor =   (int) (Math.ceil((numberApartment - countApartmentsPorch*(numberPorch-1))/countApartmentsFloor) + 1); // define the number of the floor
		
		int kkk = numberApartment%countApartmentsFloor; // special hack for apartments, whith number which multiples countApartmentsFloor, which return 0
		if (kkk==0){
			numberFloor = numberFloor -1;
		}
		
		System.out.println("number of the floor " + numberFloor);
		
		}
		
		else System.out.println("apartments with this number does not exist in the house");	
		
		
		sc.close(); // 

	}

}

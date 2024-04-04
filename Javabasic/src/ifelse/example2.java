package ifelse;

public class example2 {
public static void main(String[] args) {
	int age=19;
	char bldgrp='O';
	if(age> 18) {
		if(bldgrp=='O') {
			System.out.println("Eligible for blood donation.");
		}
		else {
			System.out.println("Not eligible blood group mismatch.");
		}
	}
	else {
		System.out.println("Not eligible due to age.");
	}
}
}

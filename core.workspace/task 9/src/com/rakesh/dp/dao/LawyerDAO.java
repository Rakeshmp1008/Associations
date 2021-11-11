package com.rakesh.dp.dao;

import com.rakesh.dp.dto.LawyerDTO;

public class LawyerDAO {

	private LawyerDTO[] dtos = new LawyerDTO[10];
	private int jbl = 0;

	public void create(LawyerDTO adder) {
		if (this.jbl < this.dtos.length && adder != null) {
			this.dtos[this.jbl++] = adder;
		} else {
			System.out.println("CREATE METHOD IS INVALID");
		}
	}

	public void create(LawyerDTO adder, int pin) {
		if (pin >= 0 && pin < this.dtos.length && adder != null) {
			this.dtos[pin] = adder;
		} else {
			System.out.println("CREATE OVERLOADING METHOD IS INVALID");
		}
	}

	public void delete(int index) {
		if (index >= 0 && index < this.dtos.length) {
			this.dtos[index] = null;
		} else {
			System.out.println("DELETE METHOD IS INVALID");
		}
	}

	public boolean searchByName(String name) {
		System.out.println("PASSING NAME IS :  ".concat(name));
		for (int ice = 0; ice < dtos.length; ice++) {
			LawyerDTO ref = this.dtos[ice];
			if (ref != null) {
				System.out.println("refer index is : ".concat(String.valueOf(ice)));
				String tempname = ref.getName();
				System.out.println("Matching ".concat(tempname));
				if (name.equals(tempname)) {
					System.out.println("NAME IS FOUND");
					return true;
				} else {
					System.out.println("NAME IS NOT FOUND");
				}
			}
		}
		return false;
	}

	public boolean searchByCasesWon(Integer caseWon) {
		System.out.println("Passing : ".concat(String.valueOf(caseWon)));
		for (int can = 0; can < dtos.length; can++) {
			LawyerDTO ref = this.dtos[can];
			if (ref != null) {
				System.out.println("Ref index is : ".concat(String.valueOf(can)));
				Integer tempCaseWon = ref.getCasesWon();
				System.out.println("Matching : ".concat(String.valueOf(tempCaseWon)));
				if (caseWon == tempCaseWon) {
					System.out.println("CASE WON IS FOUND");
					return true;
				} else {
					System.out.println("CASE WON IS NOT FOUND");
				}
			}
		}

		return false;

	}

	public void getExpByName(String name) {
		System.out.println("Passing : ".concat(name));
		for (int dash = 0; dash < dtos.length; dash++) {
			LawyerDTO ref = this.dtos[dash];
			if (ref != null) {

				String tempname = ref.getName();
				System.out.println("getting : ".concat(name));
				if (name == name) {
					System.out.println("EXPERIANCE IS");
				}
			}
		}

	}

	public LawyerDTO[] getDtos() {

		return dtos;
	}

	public void getQualificationByName(String name) {
		System.out.println("Passing : ".concat(name));
		for (int dash = 0; dash < dtos.length; dash++) {
			LawyerDTO ref = this.dtos[dash];
			if (ref != null) {
				System.out.println("QUALIFICATION IS".concat(String.valueOf(ref.getQualification())));
			}

		}

	}

}

package com.rays.interfaces;

public class TestBusinessMan {

	public static void main(String[] args) {

		BusinessMan b = new BusinessMan();

		b.donation();
		b.earnMomey();
		b.party();
		b.helpToOther();

		System.out.println("===============================");

		Richman r = new BusinessMan();

		r.donation();
		r.earnMomey();
		r.party();

		System.out.println("================================");

		SocialWorker s = new BusinessMan();

		s.helpToOther();
	}
}

//Output:
//	Donation
//	Earn Money
//	Party
//	Help To Other Person
//	===============================
//	Donation
//	Earn Money
//	Party
//	================================
//	Help To Other Person

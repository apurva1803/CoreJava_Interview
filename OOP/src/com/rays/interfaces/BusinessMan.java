package com.rays.interfaces;

public class BusinessMan implements Richman, SocialWorker{

	@Override
	public void helpToOther() {
		System.out.println("Help To Other Person");

	}

	@Override
	public void earnMomey() {
		System.out.println("Earn Money");

	}

	@Override
	public void donation() {
		System.out.println("Donation");

	}

	@Override
	public void party() {
		System.out.println("Party");

	}
}

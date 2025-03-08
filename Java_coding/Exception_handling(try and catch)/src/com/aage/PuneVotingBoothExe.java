package com.aage;

public class PuneVotingBoothExe {

	public static void main(String[] args) {
		IndianVotingBooth isha=new IndianVotingBooth();
		try {
			isha.eligibilityForVoting();
		} catch (EligibilityException e) {
			System.out.println(e);
		}
		System.out.println("------------------------------------------------------------------");
		IndianVotingBooth kia=new IndianVotingBooth();
		try {
			kia.eligibilityForVotingCandiate();
		} catch (EligibilityException e) {
			// TODO Auto-generated catch block
		System.out.println(e);
		}
	}
	

}

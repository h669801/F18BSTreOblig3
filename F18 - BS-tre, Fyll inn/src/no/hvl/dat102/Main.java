package no.hvl.dat102;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BS_Tre<Integer> tre = new BS_Tre<Integer>();
		tre.leggTil(6);
		tre.leggTil(2);
		tre.leggTil(4);
		tre.leggTil(1);
		tre.leggTil(7);
		tre.leggTil(9);
//		tre.leggTil(20);
		System.out.println(tre.hoyde());
	}

}

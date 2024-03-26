package curs8;

public class ArrayExample2 {

	public static void main(String[] args) {

		Legume cartof = new Legume("Cartof ducle", 98);
		cartof.printDetails();
		
		Legume[] arrayDeLegume = new Legume[3];
		arrayDeLegume[0] = cartof;
	//	Legume[] arrayDeLegume = { cartof, null, null}
		
		arrayDeLegume[0].printDetails();
		
		arrayDeLegume[1] =  new Legume("Praz", 55);
	//	Legume[] arrayDeLegume = { cartof, arrayDelgume[1], null}
		
		arrayDeLegume[1].printDetails();
		
		arrayDeLegume[2] =  new Legume("Pastarnac", 35);
		
		
		
		for(Legume leguma : arrayDeLegume) {
			
			leguma.printDetails();
		}
		
		
		
	}

}

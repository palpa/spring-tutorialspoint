package com.tutorialspoint;

public class Cuadernillo {
	private int hojas;
	private int pagInicial;
	private int pagFinal;

	public Cuadernillo(int hojas, int pagInicial, int pagFinal) {
		this.hojas = hojas;
		this.pagInicial = pagInicial;
		this.pagFinal = pagFinal;
	}

	public void imprimirOrdenImpresion() {
		int pagInicialAux = this.pagInicial;
		int pagFinalAux = pagInicialAux - 1 + (hojas * 4);
		int hojaActual = 1;
		
		while (pagFinalAux > pagInicialAux && hojaActual <= this.hojas) {
						
			if (hojaActual > 1)
				System.out.print("; ");

			imprimirCara(pagFinalAux, pagInicialAux);

			pagInicialAux += 1;
			pagFinalAux -= 1;
			
			if (pagFinalAux > pagInicialAux)
			{
				System.out.print("; ");
				
				imprimirContraCara(pagInicialAux, pagFinalAux);

				pagInicialAux += 1;
				pagFinalAux -= 1;
			}
		
			hojaActual++;
		}
	}


	private void imprimirCara(int pagX, int pagY) {
		if (pagX <= this.pagFinal)
			System.out.print(pagX + " y " + pagY);
		else
			System.out.print("(B) y " + pagY);
	}
	
	private void imprimirContraCara(int pagX, int pagY) {
		if (pagY <= this.pagFinal)
			System.out.print(pagX + " y " + pagY);
		else
			if (pagX <= this.pagFinal)
				System.out.print(pagX + " y (B)");
			else
				System.out.print("(B) y (B)");
	}
}

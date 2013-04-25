package com.tutorialspoint;

public class LibroImpreso {
	int maxHojasCuadernillo;
	int totalPaginas;

	public LibroImpreso(int maxHojasCuadernillo, int totalPaginas) {
		this.maxHojasCuadernillo = maxHojasCuadernillo;
		this.totalPaginas = totalPaginas;
	}

	public void imprimirLibro() {
		int paginasxCuadCompleto = maxHojasCuadernillo * 4;
		int cantCuadernillosCompletos = totalPaginas / paginasxCuadCompleto;
		int paginasCuadernillosCompletos = cantCuadernillosCompletos
				* paginasxCuadCompleto;
		int i;

		System.out.println("Cuadernillos completos: "
				+ cantCuadernillosCompletos);

		for (i = 1; i <= paginasCuadernillosCompletos; i = i
				+ paginasxCuadCompleto) {
			Cuadernillo unCuadernillo = new Cuadernillo(maxHojasCuadernillo, i,
					i + paginasxCuadCompleto - 1);
			unCuadernillo.imprimirOrdenImpresion();
		}

		
		int paginasPendientes = totalPaginas - paginasCuadernillosCompletos;
		System.out.println("\nPaginas pendientes: " + paginasPendientes);

		if (paginasPendientes > 0) {
			int hojasCuadernilloIncompleto = ((Double) Math
					.ceil(((double)paginasPendientes) / 4)).intValue();

			System.out.println("Hojas cuadernillo incompleto: "
					+ hojasCuadernilloIncompleto + " - indice: " + i);

			Cuadernillo unCuadernillo = new Cuadernillo(
					hojasCuadernilloIncompleto, i, (i + paginasPendientes - 1));
			unCuadernillo.imprimirOrdenImpresion();
		}

	}

}

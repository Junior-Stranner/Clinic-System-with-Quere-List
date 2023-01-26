package Clinica;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class PrincipalClinica {
	private static  String pacienteAtualizado = "";

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Queue<String> nomes = new LinkedList<> ();


		menu(nomes);
	}

	private static void retirarSenha(Queue <String> nomes) {
		Scanner in = new Scanner(System.in);


		System.out.println("digite nome do Paciente");
		nomes.add(in.nextLine());
	}

	public static void esperaFila(Queue <String> nomes) {
		Scanner in = new Scanner(System.in);


		System.out.println("pacientes na Fila de Espera"+nomes);

	}

	private static void verificaListaEspers(Queue <String> nomes) {
		Scanner in = new Scanner(System.in);

		String confiraPa;
		System.out.println("digite um nome");
		confiraPa =in.nextLine();

		if(nomes.contains(confiraPa)) {

			System.out.println(" encontrou paciente");

		}else {
			System.out.println(" paciente inesistente");
		}
	}

	private static void realizarAtendimento(Queue <String> nomes) {

		pacienteAtualizado += nomes.poll();

		System.out.println("Atendimento realizado ");


	}

	private static void atendimentoRealizado() {

		System.out.println(pacienteAtualizado);
	}


	private static void menu(Queue <String> nomes) {
		Scanner in = new Scanner(System.in);

		int op;
		do {
			op = lermenu();
			switch(op) {

			case 1: retirarSenha(nomes);

			break;

			case 2: esperaFila(nomes);
			break;

			case 3:verificaListaEspers(nomes);
			break;

			case 4:realizarAtendimento(nomes);
			break;

			case 5: atendimentoRealizado();
			break;

			case 6: System.out.println("sair !!");
			}

		}while(op != 6);


	}
	private static int lermenu() {
		Scanner in = new Scanner(System.in);
		int op;
		System.out.println(" MENU "
				+ "\n 1 - Retirar senha para ser atendido"
				+ "\n 2 - mostrar as pessoa em espera"
				+ "\n 3 - verificar se determinada pessoa esta em espera"
				+ "\n 4 - realizar atendimento "
				+ "\n 5 - atendimentos realizados"
				+ "\n 6 - Sair !!");
		op = Integer.parseInt(in.nextLine());
		return op;
	}

}

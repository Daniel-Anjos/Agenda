import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int opcao;
		
		do {
		System.out.println("*** Agenda Eletrônica ****");
		System.out.println("1 - Novo Contato");
		System.out.println("2 - Consultar Agenda");
		System.out.println("0 - Sair");
		opcao = leitor.nextInt();
		switch (opcao) {
		case 1:
			Contatos.Cadastro();
			break;
		case 2:
			//consulta
			break;
		case 0:
			break;
		default:
			System.out.println("Opcao Invalida, tente novamente!");
			break;
		}
		leitor.nextLine ();
		} while (opcao!= 0);
		System.out.println("Programa Finalizado");
	}

}

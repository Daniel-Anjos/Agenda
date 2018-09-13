import java.util.Scanner;

public class Contatos {

		int codigo;
		String nome;
		String telefone;
		String endereco;
		
				
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}

		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}

		public static void Cadastro () {
			Scanner l = new Scanner(System.in);
			//Contatos [] c = new Contatos [5];
			System.out.println("*** Cadastro de Contatos ***");	
			System.out.println("Informe o Nome do contato: ");
			//nome = l.nextLine();
			System.out.println("Informe o telefone:");
			//telefone = l.nextLine();
			System.out.println("Informe o endere�o: ");
			//endereco = l.nextLine();
			
		}
		
}

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

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

		public Contatos() {
			this.getNome();
			this.getTelefone();
			this.getEndereco();
		}
		
		
		public void Cadastrar () {
			@SuppressWarnings("resource")
			Scanner l = new Scanner(System.in);
			System.out.println("*** Cadastro de Contatos ***");	
			System.out.println("Informe o Nome do contato: ");
			this.setNome(l.nextLine());
			System.out.println("Informe o telefone:");
			this.setTelefone(l.nextLine());
			System.out.println("Informe o endereco: ");
			this.setEndereco(l.nextLine());
			
		}
		
		public void Consultar () {
			System.out.println("Nome:"+ this.getNome());
			System.out.println("Telefone: "+ this.getTelefone());
			System.out.println("Endereco:"+ this.getEndereco());
		}
		
}

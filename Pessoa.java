package main8;

import java.time.LocalDate;
import java.util.Scanner;

//Criando superclasse

public class Pessoa {

	private String nome;
	private String endereco;
	private String email;
	
	public Pessoa(String nome, String endereco, String email) {
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		
	}
 
	  public String toString() {
		
		return "Nome:" + nome + " ,Endereço:" + endereco + ", E-mail:" + email;
	  }
	
}


  //Criando classe de herança

//Classe pessoa fisica(utilizando toString para cpf)
class PessoaFisica extends Pessoa{
	private String cpf;
	
	public PessoaFisica(String nome, String cpf, String endereco, String email) {
		super(nome, endereco, email);
		this.cpf = cpf;
	}
	
	
	public String toString() {
		return super.toString() + ", cpf" + cpf;
	}
}

 
//Classe pessoa juridica(utilizando toString para cnpj)

class PessoaJuridica extends Pessoa{
	private String cnpj;
	
	 public PessoaJuridica(String nome, String cnpj, String endereco, String email) {
		super(nome, endereco, email);
		this.cnpj = cnpj;
	 }
	
	 public String toString() {
		return super.toString() + ", CNPJ:" + cnpj;
	 }
	
}

//Classe funcionário(utilizando toString para salário)

class funcionario extends PessoaFisica {
	private double salario;
	
	
	public funcionario(String nome, String cpf, double salario ,String endereco, String email) {
		super(nome,cpf,endereco,email);
		this.salario = salario;
	}
	
	
	public String toString() {
		return super.toString() + "Salário: " + salario;
	}
}

   


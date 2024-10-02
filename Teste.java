package main8;

//Classe para teste 

public class Teste {

	public static void main(String[] args) {
	
	//Pessoa fisica	
	PessoaFisica pessoa_Fisica1 = new PessoaFisica("Danilo Alves","146.556.390-01", "Rua Alvares, 78", "daniloz@gmail.com");
	
	//Pessoa jurídica
	PessoaJuridica pessoa_Juridica1 = new PessoaJuridica("Capcom", "13.883.198/0001-40", "Kyocera Harajuku Building 5F","info@cid.capcom.com" );
	
	//Funcionário
	funcionario funcionario1 = new funcionario("David Martines", "711.375.814-08", 0, "6.200,00", "Rua Ascencio ,número 12, davidmartin.hootmail.com");

	
	//Exibir no console
	System.out.println(pessoa_Fisica1);
	System.out.println(pessoa_Juridica1);
	System.out.println(funcionario1);
	}

}

class Pessoa {
	static int id = 1;
}

public class Variaveis {

	String nome = "Daniel";
	//Variavel de instância
	String nomeCompleto = nome + " Alexandre de Mendonca";
	//Referencia dentro de outra variavel

	public void ImprimeNome(){
		System.out.println(nome);
	}

	public void ImprimeNomeCompleto(){
		System.out.println(nomeCompleto);
	}	

	public static void main(String args[]){
		Teste t = new Teste();
		t.ImprimeNomeCompleto();
		t.nome = "Joao";
		//Ressignificação do valor da variavael de instancia
		System.out.println(t.nome);

		Pessoa p = new Pessoa();
		System.out.println(p.id);
		System.out.println(Pessoa.id);
	}
}
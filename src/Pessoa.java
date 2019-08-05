
public class Pessoa {
 
	
	private String nome;
	private Integer idade;
	private int altura;
	
	
	public Pessoa(String nome, Integer idade, int altura) { //construtor com campos  
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}


	public Pessoa() {
		super();
		//construtor vazio
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Integer getIdade() {
		return idade;
	}


	public void setIdade(Integer idade) {
		this.idade = idade;
	}


	public float getAltura() {
		return altura;
	}


	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	
	 
	
}

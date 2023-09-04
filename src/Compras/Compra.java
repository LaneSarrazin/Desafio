package Compras;

public class Compra implements Comparable<Compra>{ //toda as vezes que usar o comparable tem que fazer o compareTo
	private String descricao;
	private double valor;
	
	
	//fazendo meu construtor
	
	public Compra(String descricao, double valor) {
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public double getValor() {
		return valor;
	}
	
	@Override
	public String toString() {
		return "Compra: descricao = " + descricao + 
				"valor = " + valor;
	}
	
	@Override
		public int compareTo(Compra outraCompra ) {
			return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
		}
}

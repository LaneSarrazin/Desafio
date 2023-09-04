package Compras;

import java.util.ArrayList;
import java.util.List;

public class Cartao_credito {
	private double limite;
	private double saldo;
	private List<Compra> compras;
	
	//fazendo meu construtor
	public Cartao_credito(double limite) {
		this.limite = limite;
		this.saldo = limite;
		this.compras = new ArrayList<>();
	}
	
	public boolean lancaCompra(Compra compra) {
		//verificando se tenho limite para fazer essa compra
		
		if (this.saldo > compra.getValor()) {
			this.saldo -= compra.getValor();
			this.compras.add(compra);
			return true;
		}
		
		return false;
	}
	
	
	
	public double getLimite() {
		return limite;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public List<Compra> getCompras(){
		return compras;
	}
}

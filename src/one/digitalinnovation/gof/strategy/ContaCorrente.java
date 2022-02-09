package one.digitalinnovation.gof.strategy;

public class ContaCorrente implements Conta {

	@Override
	public void saldo() {
		System.out.println("Saldo da conta corrente");
	}

}

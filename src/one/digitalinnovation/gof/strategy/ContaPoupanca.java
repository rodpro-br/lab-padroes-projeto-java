package one.digitalinnovation.gof.strategy;

public class ContaPoupanca implements Conta {

	@Override
	public void saldo() {
		System.out.println("Saldo da conta poupança");
	}

}

public class Conta { // Inicia com valores zerados por padrão
	double saldo;
	int agencia; 
	int numero;
	String titular;
	
	public void depositar(double valor) {
		
		this.saldo += valor;
	}
	
	public boolean sacar(double valor) { // boolean pois pode sacar com sucesso ou não
		
		if(this.saldo >= valor) {
			
			this.saldo -= valor;
			System.out.println("Operação concluída com sucesso");
			return true;
		}else {
			
			System.out.println("Não foi possível concluir esta operação");
			return false;
		}
	}
	
	public boolean transferir(double valor, Conta conta) {
		
		if(this.saldo >= valor) {
			
			conta.depositar(valor); // reaproveitando método para depoisitar valor na conta de referência
			this.sacar(valor); // usando o método de sacar para retirar o valor da conta referida
			
			System.out.println("Transferência concluída com sucesso");
			return true;
		} else {
			
			System.out.println("Não foi possível concluir a transferência, verifique seu saldo");
			return false;
		}
	}
}
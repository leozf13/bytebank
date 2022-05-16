
public class CriaConta {
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200.0;
		
		System.out.println(primeiraConta.saldo);
		primeiraConta.titular = "Leonardo";
		
		System.out.println(primeiraConta.titular);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo); // adicionando +100 ao saldo
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 780.0;
		
		System.out.println(segundaConta.saldo); // saldo da segunda conta
		System.out.println(primeiraConta.agencia); // Imprime 0
		
		System.out.println(segundaConta.titular); // null
		
		
	}
}	

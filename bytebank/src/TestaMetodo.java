
public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Conta leonardo = new Conta();
		
		System.out.println(leonardo.saldo);
		
		leonardo.depositar(550.0);
		
		System.out.println(leonardo.saldo);
		
		Conta mariana = new Conta();
		mariana.depositar(700);
		
		System.out.println(mariana.saldo);
		
		leonardo.transferir(150.0, mariana);
		
		System.out.println(leonardo.saldo);
		
		System.out.println(mariana.saldo);
	}

}

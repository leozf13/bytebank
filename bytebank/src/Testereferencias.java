
public class Testereferencias {
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300.0;
		
		System.out.println("O saldo da Primeira Conta é: " + primeiraConta.saldo);
		
		Conta SegundaConta = primeiraConta; // copia referencia do objeto da primeiraConta para segundaConta
		
		SegundaConta.saldo += 50;
		
		System.out.println(primeiraConta.saldo); // O saldo foi alterado nas duas contas pois referenciam a mesma conta
	}
}

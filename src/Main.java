import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		char opcao;
		
		Cliente cliente = new Cliente();
		cliente.setNome("Alcides");
		
		Conta cc = new ContaCorrente(cliente);
		//cc.depositar(100);
		
		Conta cp = new ContaPoupanca(cliente);
		//cc.transferir(cp, 50);	

		//cc.imprimirExtrato();
		//cp.imprimirExtrato();
		
		Scanner sc = new Scanner(System.in);		
				
		
		do {
		
			System.out.println(":: MENU DO BANCO DIGITAL ::");
			System.out.println("1 - Agência");
			System.out.println("2 - Contas");
			System.out.println("3 - Clientes");
			System.out.println("4 - Transacao");
			System.out.println("5 - Sair");
			System.out.println("Escolha Opção:"); 
			
			opcao = sc.next().toUpperCase().charAt(0);
			
			switch (opcao){
			
				case '1' : 
					cc.depositar(100);
					break;					
				case '2' :
					cp.depositar(10);					
					break;
				case '3' :					
					cc.transferir(cp, 50);
					break;					
				case '4' :
					cc.imprimirExtrato();
					cp.imprimirExtrato();					
					break;
			    default:
			    	System.out.println("Opção inválida");				 
			}			
			
		} while ( opcao != '5' );
		
		System.out.println("SISTEMA FINALIZADO!");
	}

}

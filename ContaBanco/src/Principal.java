import java.util.Scanner;

import br.com.crud.model.ContaTerminal;

public class Principal {
  
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		ContaTerminal conta=new ContaTerminal();
		System.out.println("Por favor digite o seu nome ");
		conta.setNomeCliente(scanner.next());
		
		System.out.println("Por favor digite o número da Agência");
		conta.setAgencia(scanner.next());
	
		System.out.println("Por favor digite o número da conta");
		conta.setNumero(scanner.nextInt());
	
		System.out.println("Por favor digite o seu saldo");
		conta.setSaldo(scanner.nextFloat());
		System.out.println("Olá ".concat(conta.getNomeCliente())+", obrigado por criar uma conta em nosso banco, sua agência é ".concat(conta.getAgencia())+", conta "+conta.getNumero()+" e seu saldo "+conta.getSaldo()+" já está disponível para saque ");
	}
}

package lista5;

import java.util.Scanner;

public class MainPeople {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		People people1=new People();
		People people2=new People();
		people1.setNome("Albert Einstein");
		people1.setData(14, 3, 1879);
		people2.setNome("Isaac Newton");
		people2.setData(4, 1, 1643);
		
		System.out.println("Informe o dia de hoje:");
		int diaAtual=input.nextInt();
		System.out.println("Informe o mês atual:");
		int mêsAtual=input.nextInt();
		System.out.println("Informe o ano atual:");
		int anoAtual=input.nextInt();
		
		System.out.println("A idade de "+people1.getNome()+" seria "+ people1.calculaIdade(diaAtual, mêsAtual, anoAtual));
		System.out.println("A idade de "+people2.getNome()+" seria "+ people2.calculaIdade(diaAtual, mêsAtual, anoAtual));

	}

}

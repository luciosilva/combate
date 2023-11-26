package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String firstChampionName;
		int firstChampionInitialLife;
		int firstChampionAttack;
		int firstChampionArmor;
		
		String secoundChampionName;
		int secoundChampionInitialLife;
		int secoundChampionAttack;
		int secoundChampionArmor;
		
		int turns = 0;
		
		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		firstChampionName = sc.nextLine();

		System.out.print("Vida inicial: ");
		firstChampionInitialLife = sc.nextInt();
		sc.nextLine();

		System.out.print("Ataque: ");
		firstChampionAttack = sc.nextInt();
		sc.nextLine();

		System.out.print("Armadura: ");
		firstChampionArmor = sc.nextInt();
		sc.nextLine();


		
		
		System.out.println("\nDigite os dados do segundo campeão:");
		System.out.print("Nome: ");
		secoundChampionName = sc.nextLine();

		System.out.print("Vida inicial: ");
		secoundChampionInitialLife = sc.nextInt();
		sc.nextLine();

		System.out.print("Ataque: ");
		secoundChampionAttack = sc.nextInt();
		sc.nextLine();

		System.out.print("Armadura: ");
		secoundChampionArmor = sc.nextInt();
		sc.nextLine();
		
		Champion first = new Champion(firstChampionName, firstChampionInitialLife, firstChampionAttack, firstChampionArmor);
		Champion secound = new Champion(secoundChampionName, secoundChampionInitialLife, secoundChampionAttack, secoundChampionArmor);		
		
		System.out.print("\nQuantos turnos você deseja executar? ");
		turns = sc.nextInt();
		sc.nextLine();		
		sc.close();
		
		for(int i = 1; i <= turns; i++)
		{
			System.out.printf("\nResultado do turno %d:%n",i);
			first.takeDamage(secound);
			secound.takeDamage(first);
			
			System.out.println(first.status());
			System.out.println(secound.status());
			
			if(	i == turns || 
				first.getLife() < 0 ||
				secound.getLife() < 0 
			){
				System.out.println("\nFIM DO COMBATE");
				System.exit(0);
			}
		}
	}

}

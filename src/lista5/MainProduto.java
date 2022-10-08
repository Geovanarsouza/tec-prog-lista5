package lista5;

import java.util.Scanner;

public class MainProduto {

	public static void main(String[] args) {
		Product product=new Product();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the name of product: ");
		String name=input.nextLine();
		product.getproductName(name);
		System.out.println("Enter of the cost price: ");
		float costPrice=input.nextFloat();
		product.getcostPrice(costPrice);
		System.out.println("Enter of the sale price: ");
		float salePrice=input.nextFloat();
		product.getsalePrice(salePrice);
		System.out.println("Enter of the company expenses: ");
		float companyExpense=input.nextFloat();
		product.getcompanyExpenses(companyExpense);
		float percentageOfTheprofitMargin=product.calculationOfTheProfitMargin()/100;
		System.out.println("The porcentege os the Profit Margin is: "+percentageOfTheprofitMargin+"%");
	}

}

package lista5;
/*4. Crie uma classe Produto, essa classe deverá conter os seguintes
atributos: nome do produto, preço de custo, preço de venda, margem de
lucro e despesas da empresa. E o método: Cálculo da Margem de Lucros.
OBS: Cálculo da Margem de Lucro: Margem de Lucro = {[PV – (PC + D)] / PV]}
x 100. Com - PC= Preço de Custo, PV= Preço de Venda, D= Despesas.
Por fim, no método main(), crie um novo objeto da classe Produto, peça para o
usuário informar o nome, os preços de custo e de venda e exiba a margem de
lucro em porcentagem.*/
public class Product {
	private String productName;
	private float costPrice;
	private float salePrice;
	private float profitMargin;
	private float companyExpenses;
	
	public String getproductName(String productName) {
		this.productName=productName;
		return productName;
	}
	public float getcostPrice(float costPrice) {
		this.costPrice=costPrice;
		return costPrice;
	}
	public float getsalePrice(float salePrice) {
		this.salePrice=salePrice;
		return salePrice;
	}
	public float getprofitMargin(float profitMargin) {
		this.profitMargin=profitMargin;
		return profitMargin;
	}
	public float getcompanyExpenses(float companyExpenses) {
		this.companyExpenses=companyExpenses;
		return companyExpenses;
	}
	public float calculationOfTheProfitMargin() {
		float profitMargin1=(salePrice-(costPrice+companyExpenses)/salePrice)*100;
		return profitMargin1;
	}
}

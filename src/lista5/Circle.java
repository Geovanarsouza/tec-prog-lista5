package lista5;
/*3. Crie uma classe Círculo para representar círculos. Esta classe deverá
conter o seguinte atributo: raio e os métodos: área, circunferência,
aumentar círculo.
OBS: no método aumentar círculo, receba um valor double e use-o como
percentual para aumentar o raio do círculo.
Por fim, no método main(), crie um novo objeto da classe Círculo, peça para o
usuário informar o raio e retorne a área e a circunferência. Peça também o
percentual de aumento do raio e retorne a nova área e a nova circunferência.
OBS: Defina o pi como 3,14.*/
public class Circle {
	public float ray;
	
	public float getincreaseCircle(double increase,float ray) {
		this.ray=ray;
		ray+=((increase/100)*ray);
		return ray;
	}
	public float getarea(float ray) {
		float area=(float) 3.14*(ray*ray);
		return area;
	}
	public float getcircumference(float ray) {
		float circumference=(float) (2*3.14*ray);
		return circumference;
	}

}

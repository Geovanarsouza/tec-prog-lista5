package lista5;
/*1. Crie uma classe Controle Remoto que pode controlar o volume e trocar os
canais da televisão. O controle de volume permite:
● aumentar ou diminuir a potência do volume de som em uma unidade de
cada vez
● aumentar e diminuir o número do canal em uma unidade trocar para um
canal indicado
● consultar o valor do volume de som e o canal selecionado*/
public class RemoteControl {
	public int volume;
	public int channel;
	
	public int increaseVolume(int volume) {
		volume++;
		return volume;
	}
	public int decreaseVolume(int volume) {
		volume--;
		return volume;
	}
	public int decreaseChannel(int channel) {
		channel--;
		return channel;
	}
	public int increaseChannel(int channel) {
		channel++;
		return channel;
	}
	public int searchChannel(int channel) {
		return channel;
	}
	public int consultationVolume() {
		return volume;
	}
	public int consultationChannel() {
		return channel;
	}
}

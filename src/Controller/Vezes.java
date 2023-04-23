package Controller;

public class Vezes {
private  int qd=0;
	public Vezes() {
		super ();
		}
public int Qd(int num1, int num2) {
		int div;
		int rest;
		//se o divisor for igual ao numero eles são unidades e iguais retorna 1
		if ( num1==num2) {
			return 1;
		// se ele nao e igual na 1º condição não faz sentido continuar
		}else  if (num1 <10) {
		return 0;
	}else {
		// aqui peguei o resto da divisão 
		 rest =num1%10;
		 // aqui apenas dividi por dez para pode enviar novamente para a recursiva
		div=num1/10;
		// fiz a comparação do resto com o divisor se for igual qd vale 1
		if( rest==num2) {
		qd = 1; 
		 // caso contrario qd vale 0
		}else {
			qd=0;
		}
	}// aqui retorna a divisão por 10 e divisor que não muda..aumentando com qd com os valores que determinei nos if anteriores
	 	return qd + Qd(div,num2);
}
}

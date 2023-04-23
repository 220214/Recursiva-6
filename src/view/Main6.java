package view;

import Controller.Vezes;

public class Main6 {

	public static void main(String[] args) {
		// como coloquei a condição no random não fiz if
		int num1= (int)((Math.random()*999999)+10);// numero qualquer 
		int num2 = (int)((Math.random()*9)+0);//divisor qualquer 
		Vezes v = new Vezes();
		int qd = v.Qd(num1, num2);
		System.out.println("O numero " + num1 + " A quandidade de vezes que  "+ num2+ " aparece é "+ qd);
	}

}


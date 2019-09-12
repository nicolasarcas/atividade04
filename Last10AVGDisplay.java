package atividade04;

import java.util.LinkedList;

public class Last10AVGDisplay implements Observer {
	
	private LinkedList<Double> aux ;
	private double media;
	
	public Last10AVGDisplay() {
		aux = new LinkedList<Double>();
	}
	
	@Override
	public void update(double t, double h, double p) {
		
		double media = 0;
		if(aux.size() >= 10)
			aux.remove(0);
		aux.add(t);
		
		for(Double d: aux) {
			media += d;
		}
		media /= aux.size();
		
		if(aux.size() >= 10) {
			System.out.println("-----Média das ultimas 10 temperaturas--------");
			System.out.printf("%.2f\n", media);
		}
		
	}


}

package atividade04;

import java.util.LinkedList;

public class Last10Display implements Observer {
	
	private LinkedList<Double> aux;
	
	public Last10Display() {
		aux = new LinkedList<Double>();
	}
	
	@Override
	public void update(double t, double h, double p) {
		
		if(aux.size() >= 10)
			aux.remove(0);
		aux.add(t);
		
		if(aux.size()>=10) {
			System.out.println("-----Últimas 10 temperaturas-----");
			for(Double d : aux) 			
				System.out.printf("%.2f  ",d);
		}
		System.out.println("\n");

	}

}

package inicio;

import logica.Auto;
import logica.Moto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto miAuto = new Auto();
		Moto miMoto = new Moto();
		
		System.out.println("hola mundo");
		
		miAuto.queSoy();
		miMoto.queSoy();
	}

}

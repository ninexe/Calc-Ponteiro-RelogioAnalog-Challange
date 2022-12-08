package relogiojava;

public class relogio {
	public int retornaAnguloRelogio(int hora, int minuto) {
		
		int vHour = (360/12) * hora;
		int vMin = (360/60) * minuto;

		if(vHour > vMin) 
			return vHour - vMin;
		 else 
			return vMin - vHour;
	}
}

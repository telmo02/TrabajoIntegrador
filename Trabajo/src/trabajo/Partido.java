package trabajo;

public class Partido {

	public static void main(String[] args) {
		//Equipo equipo1 = new Equipo("Boca", "Equipo de brian");
				//Equipo equipo2 = new Equipo("River", "Equipo de lean");
				//Equipo equipo3 = new Equipo("Velez", "Equipo de telmo");
				//Equipo equipo4 = new Equipo("Racing", "Equipo de facu");
				
		        System.out.println("El sistema de puntos funciona de la siguiente forma: \nGanar=2  \nPerder=0  \nEmpatar=1");
				
		        Ronda ronda = new Ronda();
		        ronda.setNro(1);
		        ronda.setPartidos(2);
				
				Equipo equipo1 = new Equipo();
				Equipo equipo2 = new Equipo();
				equipo1.setEquipo("River");
				equipo1.setDescripcion("Equipo de lean");
				equipo2.setEquipo("Boca");
			    equipo2.setDescripcion("equipo de brian");
			    
			    equipo1.getInformacion();
			    equipo2.getInformacion();
			    System.out.println(" ");
			    
			    // se declara los goles para ver cuantos puntos tiene cada uno
			    int puntajeEquipo1=0, puntajeEquipo2=0;
			    int partidos=0;
			    ronda.getRonda();
			    while(partidos<2) {
			    	
			    	int gol1=(int)(Math.random()*5);
			    	int gol2=(int)(Math.random()*5);
			    	
			    	if (gol1>gol2) {
			    		puntajeEquipo1 = puntajeEquipo1 + 2;
			    	}else if(gol2>gol1) {
			    		puntajeEquipo2 = puntajeEquipo2 + 2;
			    	}else if(gol1==gol2) {
			    		puntajeEquipo1++;
			    		puntajeEquipo2++;
			    	}
			    	partidos++;
			    	System.out.println("El resultado del partido numero "+ partidos);
			    	System.out.println(equipo1.getEquipo()+" <"+gol1+"-"+gol2+"> "+equipo2.getEquipo()+"\n");
			    	System.out.println("Equipo1 	Goles   	Equipo2 \n "+equipo1.getEquipo()+"	  	 "+gol1+"-"+gol2+"		 "+equipo2.getEquipo()+" \n ");
			    	if(gol1==gol2) {
			    		System.out.println("El equipo de "+ equipo1.getEquipo()+" empato este partido con "+equipo2.getEquipo()+"\n");
			    	}else if(gol1>gol2) {
			    		System.out.println("El equipo de "+ equipo1.getEquipo()+" gano este partido\n");
			    	}else {
			    		System.out.println("El equipo de "+ equipo2.getEquipo()+" gano este partido\n");
			    	}
			    		
			    }
			    // aca ya es final de la ronda y se dicen los puntos de cada uno
			    System.out.println("Se jugaron "+partidos+" partidos");
			    System.out.println("el equipo de "+equipo1.getEquipo()+" consiguio "+puntajeEquipo1+" puntos");
			    System.out.println("el equipo de "+equipo2.getEquipo()+" consiguio "+puntajeEquipo2+" puntos");
			    if (puntajeEquipo1==puntajeEquipo2) {
			    	System.out.println("El equipo "+equipo1.getEquipo()+" empato en puntos con "+equipo2.getEquipo());
			    }else if(puntajeEquipo1>puntajeEquipo2) {
			    	System.out.println("El equipo de "+equipo1.getEquipo()+ " gano");
			    }else {
			    	System.out.println("El equipo de "+equipo2.getEquipo()+ " gano");
			    }
			    
			    
			    	
			    
			    
				
				
			    
			    

	}
	
	

}

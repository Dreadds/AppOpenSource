package pe.edu.upc.model.dao;

import java.util.ArrayList;
import java.util.List;

import pe.edu.upc.model.entity.Persona;
import pe.edu.upc.service.IPersona;


public class daoPersona implements IPersona {
	
	private List<Persona> lPersona;
	
	public daoPersona() {
		// TODO Auto-generated constructor stub
		lPersona=new ArrayList<Persona>();
	}

	public int contar() {
		// TODO Auto-generated method stub
		return lPersona.size();
	}

	public Persona obtenerElemento(int pos) {
		// TODO Auto-generated method stub
		return lPersona.get(pos);
	}

	public String insertar(Persona o) {
		// TODO Auto-generated method stub
		if(getByPersonaDNI(o.getDNI())==null){
			lPersona.add(o);
			return "Registro OK";
		}else{
			return "DNI duplicado";
		}
	}

	public Persona getByPersonaDNI(String dni) {
		// TODO Auto-generated method stub
		
		for (Persona persona : lPersona) {
			if(persona.getDNI().equals(dni)){
				return persona;
			}
		}
		return null;
	}
	
	
	
}

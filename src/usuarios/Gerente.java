package usuarios;

import java.io.Serializable;

public class Gerente extends Empleado{

	public Gerente(String nombre, String apellido, int edad, String dni, String nombreDeUsuario, String contrase�a, String horario, float pagoPorHoras) {
		
		super(nombre, apellido, edad, dni, nombreDeUsuario, contrase�a, horario,pagoPorHoras);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	@Override
    public float aCobrar()
    {	
    	return super.getSueldo();
    }
	
}

package cl.psep.example.switchyard.switchyard_example;

import org.switchyard.component.bean.Service;

@Service(HolaService.class)
public class HolaServiceBean implements HolaService {

	@Override
	public String saluda(String nombre) {
		return "Hola, estimado " + nombre;
	}

}

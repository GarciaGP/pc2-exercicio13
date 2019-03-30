package br.com.etechoracio.training.view.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import org.springframework.stereotype.Component;

@Component(value = "cpfConverter")
public class CpfConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		String cpf = value;

		if (cpf != null && !cpf.equals("")) {
			cpf = value.replaceAll("[^0-9]", "");
		}
		return cpf;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		String cpf = String.valueOf(value);
		if (cpf != null && cpf.length() == 11) {
			cpf = cpf.substring(0,3) + "." + 
			cpf.substring(3,6) + "." +
			cpf.substring(6,9) + "." +
			cpf.substring(9);
		}
		return cpf;
	}

}

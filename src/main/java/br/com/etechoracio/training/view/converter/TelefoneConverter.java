package br.com.etechoracio.training.view.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import org.springframework.stereotype.Component;

@Component(value = "foneConverter")
public class TelefoneConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		String telefone = value;

		if (telefone != null && !telefone.equals("")) {
			telefone = value.replaceAll("[^0-9]", "");
		}
		return telefone;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		String telefone = String.valueOf(value);
		if (telefone != null && telefone.length() == 10) {
			telefone = "(" + telefone.substring(0, 2) + ")" + telefone.substring(2, 6) + "-" + telefone.substring(6);
		}
		return telefone;
	}
}

package cl.psep.example.switchyard.switchyard_example;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

public final class TransformadorMensaje {

	@Transformer(to = "{urn:cl.psep.example.switchyard:switchyard-example:1.0}saludaResponse")
	public String transformStringToSaludaResponse(String from) {
		return "<saludaResponse xmlns=\"urn:cl.psep.example.switchyard:switchyard-example:1.0\"><saludo>" + from + "</saludo></saludaResponse>";
	}

	@Transformer(from = "{urn:cl.psep.example.switchyard:switchyard-example:1.0}saluda")
	public String transformSaludaToString(Element from) {
		return new String(from.getTextContent());
	}

}

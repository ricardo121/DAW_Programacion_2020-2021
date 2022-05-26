package Ejercicio1;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;

import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;



import org.w3c.dom.*;


public class ModificacionDOM {

    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("C:\\Users\\Ricardo\\IdeaProjects\\U10\\src\\main\\java\\Ejercicio1\\pilotos.xml"));


            //Obtenemos el nodo raíz
            Node root = doc.getDocumentElement();

            //Nodo texto de salto de línea que voy a utilizar posteriormente
            Text saltoLinea = doc.createTextNode("\n");

            //1 - Uso de insertBefore()
            //Voy a insertar un nodo comentario antes de la primera persona
            Comment comentario = doc.createComment("Empieza la lista de personas");

            //Obtengo una referencia a la primera ocurrencia de persona
            Element primeraPersona = (Element) doc.getElementsByTagName("piloto").item(0);




            //2 - Uso de appendChild()
            //Vamos a insertar un nuevo nodo Element persona

            // Creo la etiqueta padre persona, le doy nombre
            Element persona = doc.createElement("Piloto");


            Element nombre = doc.createElement("nombre");
            nombre.setTextContent("Ricardo");

            Element edad = doc.createElement("edad");
            edad.setTextContent("23");

            Element escuderia = doc.createElement("escuderia");
            escuderia.setTextContent("Ferrari");

            Element campeonatos = doc.createElement("campeonatos");
            campeonatos.setTextContent("2");

            //Construyo toda la estructura general de la etiqueta
            persona.appendChild(saltoLinea);
            persona.appendChild(nombre);
            persona.appendChild(saltoLinea);
            persona.appendChild(saltoLinea);
            persona.appendChild(edad);
            persona.appendChild(saltoLinea);
            persona.appendChild(escuderia);
            persona.appendChild(saltoLinea);
            persona.appendChild(campeonatos);
            persona.appendChild(saltoLinea);


            //Añadimos ese nuevo nodo al root
            root.appendChild(persona);



            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer t = factory.newTransformer();
            DOMSource xml = new DOMSource(doc);
            StreamResult s = new StreamResult(new File("C:\\Users\\Ricardo\\IdeaProjects\\U10\\src\\main\\java\\Ejercicio1\\ejercicio1.xml"));
            t.transform(xml,s);

        } catch (ParserConfigurationException | SAXException | IOException | TransformerException e) {
            e.printStackTrace();
        }
    }


}

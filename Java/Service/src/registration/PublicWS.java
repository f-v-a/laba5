package registration;

import javax.xml.ws.Endpoint;
import service.endpoint.TovarService;

public class PublicWS {

public static void main (String[] argv) {
Endpoint.publish("http://localhost:8080/Server/TovarService", new TovarService());
}
}
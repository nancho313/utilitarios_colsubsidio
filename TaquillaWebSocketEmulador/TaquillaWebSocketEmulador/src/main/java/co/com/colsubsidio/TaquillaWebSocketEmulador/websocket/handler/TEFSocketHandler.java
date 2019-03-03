package co.com.colsubsidio.TaquillaWebSocketEmulador.websocket.handler;

import co.com.colsubsidio.TaquillaWebSocketEmulador.util.ConstantesTaquilla;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;

@Component
public class TEFSocketHandler extends TextWebSocketHandler {

    private static final String RESPUESTA_OK = "1";

    private static final String RESPUESTA_ERROR = "0";

    private ConstantesTaquilla constantesTaquilla;

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message)
            throws IOException {

        String mensaje = message.getPayload();

        System.out.println(mensaje);

        String[] transaccionesTef = mensaje.split("^");

        String respuesta = "";

        for(String transaccionTef : transaccionesTef){

            String[] dataTransaccion = transaccionTef.split("%");

            String drId = dataTransaccion[0];

            String respuestaRandom = "";

            boolean respuestaOk = constantesTaquilla.getRespuestaOk().equals(RESPUESTA_OK);

            if(respuestaOk){

                String monto = dataTransaccion[1].split(",")[1];

                respuestaRandom = "00,674018,601660**3289,AH,MAESTRO,"+agregarCeros(monto)+",000000000000,000000000000,000014,00,000245";
            }
            else
            {
                respuestaRandom = "99,Error en la configuracion del Puerto Serial";
            }

            respuesta = respuesta + drId+"%"+respuestaRandom+"^";
        }

        respuesta = "TEF:"+respuesta;

        session.sendMessage(new TextMessage(respuesta));

    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {

    }

    private String agregarCeros(String value){

        int cantidadCerosAAgregar = 9 - (value.length());

        String respuesta = "";

        for (int i= 0; i < cantidadCerosAAgregar ; i++){

            respuesta = respuesta + "0";
        }

        return respuesta+value;
    }

    @Autowired
    public void setConstantesTaquilla(ConstantesTaquilla constantesTaquilla) {
        this.constantesTaquilla = constantesTaquilla;
    }
}

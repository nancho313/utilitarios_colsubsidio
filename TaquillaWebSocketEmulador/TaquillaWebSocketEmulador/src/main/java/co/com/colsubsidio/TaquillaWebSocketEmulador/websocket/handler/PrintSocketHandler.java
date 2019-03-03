package co.com.colsubsidio.TaquillaWebSocketEmulador.websocket.handler;

import co.com.colsubsidio.TaquillaWebSocketEmulador.util.ConstantesTaquilla;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import javax.xml.bind.DatatypeConverter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

@Component
public class PrintSocketHandler extends TextWebSocketHandler {

    private ConstantesTaquilla constantesTaquilla;

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message)
            throws InterruptedException, IOException {

        System.out.println("Este es el mensaje");

        System.out.println(message.getPayload());

        String dataToPrint[] = message.getPayload().split("%");

        for(String data : dataToPrint){

            byte[] archivo = toByteArray(data);

            String fileName = "archivo_"+new Date().getTime()+".pdf";

            String fileDirName = constantesTaquilla.getPrintOut()+"/"+fileName;

            System.out.println("Directorio archivo -> "+fileDirName);

            File file = new File(fileDirName);

            file.createNewFile();

            FileOutputStream stream = new FileOutputStream(file);

            try {
                stream.write(archivo);
                stream.flush();
            } finally {
                stream.close();
            }

            System.out.println("Se construyo el reporte !!! -> "+fileName);
        }
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable throwable) throws Exception {
        System.out.println("error occured at sender " + session);
        throwable.printStackTrace();
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        System.out.println(String.format("Session "+session.getId()+" closed because of "+status.getReason()));
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {

        System.out.println("Connected ... " + session.getId());
    }

    public static byte[] toByteArray(String s) {
        return DatatypeConverter.parseHexBinary(s);
    }

    @Autowired
    public void setConstantesTaquilla(ConstantesTaquilla constantesTaquilla) {
        this.constantesTaquilla = constantesTaquilla;
    }
}

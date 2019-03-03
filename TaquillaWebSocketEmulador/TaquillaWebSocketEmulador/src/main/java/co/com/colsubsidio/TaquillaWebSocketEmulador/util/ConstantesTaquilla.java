package co.com.colsubsidio.TaquillaWebSocketEmulador.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix="taquilla")
public class ConstantesTaquilla {

    private String printOut;

    private String respuestaOk;

    public String getPrintOut() {
        return printOut;
    }

    public void setPrintOut(String printOut) {
        this.printOut = printOut;
    }

    public String getRespuestaOk() {
        return respuestaOk;
    }

    public void setRespuestaOk(String respuestaOk) {
        this.respuestaOk = respuestaOk;
    }
}

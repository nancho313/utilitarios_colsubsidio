package co.com.colsubsidio.TaquillaWebSocketEmulador;

import co.com.colsubsidio.TaquillaWebSocketEmulador.util.ConstantesTaquilla;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ConstantesTaquilla.class)
public class TaquillaWebSocketEmuladorApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaquillaWebSocketEmuladorApplication.class, args);
	}
}

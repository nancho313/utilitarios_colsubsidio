package co.com.colsubsidio.TaquillaWebSocketEmulador.websocket.config;

import co.com.colsubsidio.TaquillaWebSocketEmulador.websocket.handler.PrintSocketHandler;
import co.com.colsubsidio.TaquillaWebSocketEmulador.websocket.handler.TEFSocketHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.server.standard.ServletServerContainerFactoryBean;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer{

    private TEFSocketHandler tefHandler;

    private PrintSocketHandler printHandler;

    @Autowired
    public WebSocketConfig(TEFSocketHandler tefHandler, PrintSocketHandler printHandler){

        super();
        this.tefHandler=tefHandler;
        this.printHandler=printHandler;
    }

    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {

        registry.addHandler(printHandler, "/taquillaWSPrint").setAllowedOrigins("*");
        registry.addHandler(tefHandler, "/taquillaWSTef").setAllowedOrigins("*");

    }

    @Bean
    public ServletServerContainerFactoryBean createWebSocketContainer() {
        ServletServerContainerFactoryBean container = new ServletServerContainerFactoryBean();
        container.setMaxTextMessageBufferSize(1024*1024*50);
        container.setMaxBinaryMessageBufferSize(1024*1024*50);
        return container;
    }
}


package com.infinitec.taquillav2.out.ws.canales.impresion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.infinitec.taquillav2.out.ws.canales.impresion package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CanalesImpresionRequest_QNAME = new QName("urn:infinitec.com:taquillav2:out:ws:canales:impresion", "CanalesImpresion_Request");
    private final static QName _CanalesImpresionResponse_QNAME = new QName("urn:infinitec.com:taquillav2:out:ws:canales:impresion", "CanalesImpresion_Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.infinitec.taquillav2.out.ws.canales.impresion
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CanalesImpresionResp }
     * 
     */
    public CanalesImpresionResp createCanalesImpresionResp() {
        return new CanalesImpresionResp();
    }

    /**
     * Create an instance of {@link CanalesImpresionReq }
     * 
     */
    public CanalesImpresionReq createCanalesImpresionReq() {
        return new CanalesImpresionReq();
    }

    /**
     * Create an instance of {@link MensajeBaseDTO }
     * 
     */
    public MensajeBaseDTO createMensajeBaseDTO() {
        return new MensajeBaseDTO();
    }

    /**
     * Create an instance of {@link CanalesImpresionItemVentaResp }
     * 
     */
    public CanalesImpresionItemVentaResp createCanalesImpresionItemVentaResp() {
        return new CanalesImpresionItemVentaResp();
    }

    /**
     * Create an instance of {@link CanalesImpresionItemResp }
     * 
     */
    public CanalesImpresionItemResp createCanalesImpresionItemResp() {
        return new CanalesImpresionItemResp();
    }

    /**
     * Create an instance of {@link MensajeRespuestaBaseDTO }
     * 
     */
    public MensajeRespuestaBaseDTO createMensajeRespuestaBaseDTO() {
        return new MensajeRespuestaBaseDTO();
    }

    /**
     * Create an instance of {@link CanalesImpresionItemCortesiaResp }
     * 
     */
    public CanalesImpresionItemCortesiaResp createCanalesImpresionItemCortesiaResp() {
        return new CanalesImpresionItemCortesiaResp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CanalesImpresionReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:infinitec.com:taquillav2:out:ws:canales:impresion", name = "CanalesImpresion_Request")
    public JAXBElement<CanalesImpresionReq> createCanalesImpresionRequest(CanalesImpresionReq value) {
        return new JAXBElement<CanalesImpresionReq>(_CanalesImpresionRequest_QNAME, CanalesImpresionReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CanalesImpresionResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:infinitec.com:taquillav2:out:ws:canales:impresion", name = "CanalesImpresion_Response")
    public JAXBElement<CanalesImpresionResp> createCanalesImpresionResponse(CanalesImpresionResp value) {
        return new JAXBElement<CanalesImpresionResp>(_CanalesImpresionResponse_QNAME, CanalesImpresionResp.class, null, value);
    }

}

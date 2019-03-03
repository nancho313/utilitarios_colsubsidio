
package com.infinitec.taquillav2.out.ws.canales.impresion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MensajeRespuestaBaseDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MensajeRespuestaBaseDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoRespuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EsOperacionExitosa" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IdentificadorProceso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MensajeRespuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MensajeRespuestaOriginal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MensajeRespuestaBaseDTO", propOrder = {
    "codigoRespuesta",
    "esOperacionExitosa",
    "identificadorProceso",
    "mensajeRespuesta",
    "mensajeRespuestaOriginal"
})
public class MensajeRespuestaBaseDTO {

    @XmlElement(name = "CodigoRespuesta")
    protected String codigoRespuesta;
    @XmlElement(name = "EsOperacionExitosa")
    protected boolean esOperacionExitosa;
    @XmlElement(name = "IdentificadorProceso")
    protected String identificadorProceso;
    @XmlElement(name = "MensajeRespuesta")
    protected String mensajeRespuesta;
    @XmlElement(name = "MensajeRespuestaOriginal")
    protected String mensajeRespuestaOriginal;

    /**
     * Gets the value of the codigoRespuesta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRespuesta() {
        return codigoRespuesta;
    }

    /**
     * Sets the value of the codigoRespuesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRespuesta(String value) {
        this.codigoRespuesta = value;
    }

    /**
     * Gets the value of the esOperacionExitosa property.
     * 
     */
    public boolean isEsOperacionExitosa() {
        return esOperacionExitosa;
    }

    /**
     * Sets the value of the esOperacionExitosa property.
     * 
     */
    public void setEsOperacionExitosa(boolean value) {
        this.esOperacionExitosa = value;
    }

    /**
     * Gets the value of the identificadorProceso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorProceso() {
        return identificadorProceso;
    }

    /**
     * Sets the value of the identificadorProceso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorProceso(String value) {
        this.identificadorProceso = value;
    }

    /**
     * Gets the value of the mensajeRespuesta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajeRespuesta() {
        return mensajeRespuesta;
    }

    /**
     * Sets the value of the mensajeRespuesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajeRespuesta(String value) {
        this.mensajeRespuesta = value;
    }

    /**
     * Gets the value of the mensajeRespuestaOriginal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajeRespuestaOriginal() {
        return mensajeRespuestaOriginal;
    }

    /**
     * Sets the value of the mensajeRespuestaOriginal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajeRespuestaOriginal(String value) {
        this.mensajeRespuestaOriginal = value;
    }

}

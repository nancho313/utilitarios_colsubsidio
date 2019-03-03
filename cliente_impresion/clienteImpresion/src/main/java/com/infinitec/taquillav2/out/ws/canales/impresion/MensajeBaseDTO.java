
package com.infinitec.taquillav2.out.ws.canales.impresion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MensajeBaseDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MensajeBaseDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Canal" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="IdentificadorProceso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdentificadorSesion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Host" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NombreOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrigenCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MensajeBaseDTO", propOrder = {
    "canal",
    "identificadorProceso",
    "identificadorSesion",
    "host",
    "nombreOperacion",
    "origenCliente",
    "usuario",
    "version"
})
public class MensajeBaseDTO {

    @XmlElement(name = "Canal")
    protected short canal;
    @XmlElement(name = "IdentificadorProceso")
    protected String identificadorProceso;
    @XmlElement(name = "IdentificadorSesion")
    protected String identificadorSesion;
    @XmlElement(name = "Host")
    protected String host;
    @XmlElement(name = "NombreOperacion")
    protected String nombreOperacion;
    @XmlElement(name = "OrigenCliente")
    protected String origenCliente;
    @XmlElement(name = "Usuario")
    protected String usuario;
    @XmlElement(name = "Version")
    protected String version;

    /**
     * Gets the value of the canal property.
     * 
     */
    public short getCanal() {
        return canal;
    }

    /**
     * Sets the value of the canal property.
     * 
     */
    public void setCanal(short value) {
        this.canal = value;
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
     * Gets the value of the identificadorSesion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorSesion() {
        return identificadorSesion;
    }

    /**
     * Sets the value of the identificadorSesion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorSesion(String value) {
        this.identificadorSesion = value;
    }

    /**
     * Gets the value of the host property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHost(String value) {
        this.host = value;
    }

    /**
     * Gets the value of the nombreOperacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreOperacion() {
        return nombreOperacion;
    }

    /**
     * Sets the value of the nombreOperacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreOperacion(String value) {
        this.nombreOperacion = value;
    }

    /**
     * Gets the value of the origenCliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigenCliente() {
        return origenCliente;
    }

    /**
     * Sets the value of the origenCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigenCliente(String value) {
        this.origenCliente = value;
    }

    /**
     * Gets the value of the usuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Sets the value of the usuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}

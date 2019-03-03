
package com.infinitec.taquillav2.out.ws.canales.impresion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CanalesImpresion_Req complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CanalesImpresion_Req">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodInfoVenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodDetalleVenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumFactura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MensajeBaseDTO" type="{urn:infinitec.com:taquillav2:out:ws:canales:impresion}MensajeBaseDTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CanalesImpresion_Req", propOrder = {
    "codInfoVenta",
    "codDetalleVenta",
    "numFactura",
    "mensajeBaseDTO"
})
public class CanalesImpresionReq {

    @XmlElement(name = "CodInfoVenta")
    protected String codInfoVenta;
    @XmlElement(name = "CodDetalleVenta")
    protected String codDetalleVenta;
    @XmlElement(name = "NumFactura")
    protected String numFactura;
    @XmlElement(name = "MensajeBaseDTO", required = true)
    protected MensajeBaseDTO mensajeBaseDTO;

    /**
     * Gets the value of the codInfoVenta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodInfoVenta() {
        return codInfoVenta;
    }

    /**
     * Sets the value of the codInfoVenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodInfoVenta(String value) {
        this.codInfoVenta = value;
    }

    /**
     * Gets the value of the codDetalleVenta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodDetalleVenta() {
        return codDetalleVenta;
    }

    /**
     * Sets the value of the codDetalleVenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodDetalleVenta(String value) {
        this.codDetalleVenta = value;
    }

    /**
     * Gets the value of the numFactura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumFactura() {
        return numFactura;
    }

    /**
     * Sets the value of the numFactura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumFactura(String value) {
        this.numFactura = value;
    }

    /**
     * Gets the value of the mensajeBaseDTO property.
     * 
     * @return
     *     possible object is
     *     {@link MensajeBaseDTO }
     *     
     */
    public MensajeBaseDTO getMensajeBaseDTO() {
        return mensajeBaseDTO;
    }

    /**
     * Sets the value of the mensajeBaseDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link MensajeBaseDTO }
     *     
     */
    public void setMensajeBaseDTO(MensajeBaseDTO value) {
        this.mensajeBaseDTO = value;
    }

}

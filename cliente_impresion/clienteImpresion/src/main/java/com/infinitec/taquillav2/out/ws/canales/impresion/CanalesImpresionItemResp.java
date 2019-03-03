
package com.infinitec.taquillav2.out.ws.canales.impresion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CanalesImpresionItemResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CanalesImpresionItemResp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodDetalleVenta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FacturaPdfBytes" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="ManillaPdfBytes" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CanalesImpresionItemResp", propOrder = {
    "codDetalleVenta",
    "facturaPdfBytes",
    "manillaPdfBytes"
})
public class CanalesImpresionItemResp {

    @XmlElement(name = "CodDetalleVenta", required = true)
    protected String codDetalleVenta;
    @XmlElement(name = "FacturaPdfBytes")
    protected byte[] facturaPdfBytes;
    @XmlElement(name = "ManillaPdfBytes")
    protected byte[] manillaPdfBytes;

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
     * Gets the value of the facturaPdfBytes property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFacturaPdfBytes() {
        return facturaPdfBytes;
    }

    /**
     * Sets the value of the facturaPdfBytes property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFacturaPdfBytes(byte[] value) {
        this.facturaPdfBytes = value;
    }

    /**
     * Gets the value of the manillaPdfBytes property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getManillaPdfBytes() {
        return manillaPdfBytes;
    }

    /**
     * Sets the value of the manillaPdfBytes property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setManillaPdfBytes(byte[] value) {
        this.manillaPdfBytes = value;
    }

}

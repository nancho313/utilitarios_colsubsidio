
package com.infinitec.taquillav2.out.ws.canales.impresion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CanalesImpresionItemCortesiaResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CanalesImpresionItemCortesiaResp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Producto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TipoProducto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TipoTarifa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Razon" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CanalesImpresionItemCortesiaResp", propOrder = {
    "producto",
    "tipoProducto",
    "tipoTarifa",
    "razon",
    "cantidad"
})
public class CanalesImpresionItemCortesiaResp {

    @XmlElement(name = "Producto", required = true)
    protected String producto;
    @XmlElement(name = "TipoProducto", required = true)
    protected String tipoProducto;
    @XmlElement(name = "TipoTarifa", required = true)
    protected String tipoTarifa;
    @XmlElement(name = "Razon", required = true)
    protected String razon;
    @XmlElement(name = "Cantidad")
    protected int cantidad;

    /**
     * Gets the value of the producto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducto() {
        return producto;
    }

    /**
     * Sets the value of the producto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducto(String value) {
        this.producto = value;
    }

    /**
     * Gets the value of the tipoProducto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoProducto() {
        return tipoProducto;
    }

    /**
     * Sets the value of the tipoProducto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoProducto(String value) {
        this.tipoProducto = value;
    }

    /**
     * Gets the value of the tipoTarifa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoTarifa() {
        return tipoTarifa;
    }

    /**
     * Sets the value of the tipoTarifa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoTarifa(String value) {
        this.tipoTarifa = value;
    }

    /**
     * Gets the value of the razon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazon() {
        return razon;
    }

    /**
     * Sets the value of the razon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazon(String value) {
        this.razon = value;
    }

    /**
     * Gets the value of the cantidad property.
     * 
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Sets the value of the cantidad property.
     * 
     */
    public void setCantidad(int value) {
        this.cantidad = value;
    }

}

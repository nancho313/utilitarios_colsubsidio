
package com.infinitec.taquillav2.out.ws.canales.impresion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CanalesImpresionItemVentaResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CanalesImpresionItemVentaResp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Producto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TipoProducto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TipoTarifa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Categoria" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ValorUnitario" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Seguro" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ValorSeguro" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ValorInc" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="BaseInc" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ValorIva" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="BaseIva" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ValorTotal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CanalesImpresionItemVentaResp", propOrder = {
    "producto",
    "tipoProducto",
    "tipoTarifa",
    "categoria",
    "valorUnitario",
    "seguro",
    "valorSeguro",
    "valorInc",
    "baseInc",
    "valorIva",
    "baseIva",
    "valorTotal"
})
public class CanalesImpresionItemVentaResp {

    @XmlElement(name = "Producto", required = true)
    protected String producto;
    @XmlElement(name = "TipoProducto", required = true)
    protected String tipoProducto;
    @XmlElement(name = "TipoTarifa", required = true)
    protected String tipoTarifa;
    @XmlElement(name = "Categoria", required = true)
    protected String categoria;
    @XmlElement(name = "ValorUnitario")
    protected double valorUnitario;
    @XmlElement(name = "Seguro")
    protected boolean seguro;
    @XmlElement(name = "ValorSeguro")
    protected double valorSeguro;
    @XmlElement(name = "ValorInc")
    protected double valorInc;
    @XmlElement(name = "BaseInc")
    protected double baseInc;
    @XmlElement(name = "ValorIva")
    protected double valorIva;
    @XmlElement(name = "BaseIva")
    protected double baseIva;
    @XmlElement(name = "ValorTotal")
    protected double valorTotal;

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
     * Gets the value of the categoria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Sets the value of the categoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoria(String value) {
        this.categoria = value;
    }

    /**
     * Gets the value of the valorUnitario property.
     * 
     */
    public double getValorUnitario() {
        return valorUnitario;
    }

    /**
     * Sets the value of the valorUnitario property.
     * 
     */
    public void setValorUnitario(double value) {
        this.valorUnitario = value;
    }

    /**
     * Gets the value of the seguro property.
     * 
     */
    public boolean isSeguro() {
        return seguro;
    }

    /**
     * Sets the value of the seguro property.
     * 
     */
    public void setSeguro(boolean value) {
        this.seguro = value;
    }

    /**
     * Gets the value of the valorSeguro property.
     * 
     */
    public double getValorSeguro() {
        return valorSeguro;
    }

    /**
     * Sets the value of the valorSeguro property.
     * 
     */
    public void setValorSeguro(double value) {
        this.valorSeguro = value;
    }

    /**
     * Gets the value of the valorInc property.
     * 
     */
    public double getValorInc() {
        return valorInc;
    }

    /**
     * Sets the value of the valorInc property.
     * 
     */
    public void setValorInc(double value) {
        this.valorInc = value;
    }

    /**
     * Gets the value of the baseInc property.
     * 
     */
    public double getBaseInc() {
        return baseInc;
    }

    /**
     * Sets the value of the baseInc property.
     * 
     */
    public void setBaseInc(double value) {
        this.baseInc = value;
    }

    /**
     * Gets the value of the valorIva property.
     * 
     */
    public double getValorIva() {
        return valorIva;
    }

    /**
     * Sets the value of the valorIva property.
     * 
     */
    public void setValorIva(double value) {
        this.valorIva = value;
    }

    /**
     * Gets the value of the baseIva property.
     * 
     */
    public double getBaseIva() {
        return baseIva;
    }

    /**
     * Sets the value of the baseIva property.
     * 
     */
    public void setBaseIva(double value) {
        this.baseIva = value;
    }

    /**
     * Gets the value of the valorTotal property.
     * 
     */
    public double getValorTotal() {
        return valorTotal;
    }

    /**
     * Sets the value of the valorTotal property.
     * 
     */
    public void setValorTotal(double value) {
        this.valorTotal = value;
    }

}

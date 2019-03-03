
package com.infinitec.taquillav2.out.ws.canales.impresion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CanalesImpresion_Resp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CanalesImpresion_Resp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReciboPdfBytes" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="CodInfoVenta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CanalesImpresionItemVenta" type="{urn:infinitec.com:taquillav2:out:ws:canales:impresion}CanalesImpresionItemVentaResp" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CanalesImpresionItemCortesia" type="{urn:infinitec.com:taquillav2:out:ws:canales:impresion}CanalesImpresionItemCortesiaResp" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CanalesImpresionItemResp" type="{urn:infinitec.com:taquillav2:out:ws:canales:impresion}CanalesImpresionItemResp" maxOccurs="unbounded"/>
 *         &lt;element name="MensajeRespuestaBaseDTO" type="{urn:infinitec.com:taquillav2:out:ws:canales:impresion}MensajeRespuestaBaseDTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CanalesImpresion_Resp", propOrder = {
    "reciboPdfBytes",
    "codInfoVenta",
    "canalesImpresionItemVenta",
    "canalesImpresionItemCortesia",
    "canalesImpresionItemResp",
    "mensajeRespuestaBaseDTO"
})
public class CanalesImpresionResp {

    @XmlElement(name = "ReciboPdfBytes")
    protected byte[] reciboPdfBytes;
    @XmlElement(name = "CodInfoVenta", required = true)
    protected String codInfoVenta;
    @XmlElement(name = "CanalesImpresionItemVenta", nillable = true)
    protected List<CanalesImpresionItemVentaResp> canalesImpresionItemVenta;
    @XmlElement(name = "CanalesImpresionItemCortesia", nillable = true)
    protected List<CanalesImpresionItemCortesiaResp> canalesImpresionItemCortesia;
    @XmlElement(name = "CanalesImpresionItemResp", required = true, nillable = true)
    protected List<CanalesImpresionItemResp> canalesImpresionItemResp;
    @XmlElement(name = "MensajeRespuestaBaseDTO", required = true)
    protected MensajeRespuestaBaseDTO mensajeRespuestaBaseDTO;

    /**
     * Gets the value of the reciboPdfBytes property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getReciboPdfBytes() {
        return reciboPdfBytes;
    }

    /**
     * Sets the value of the reciboPdfBytes property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setReciboPdfBytes(byte[] value) {
        this.reciboPdfBytes = value;
    }

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
     * Gets the value of the canalesImpresionItemVenta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the canalesImpresionItemVenta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCanalesImpresionItemVenta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CanalesImpresionItemVentaResp }
     * 
     * 
     */
    public List<CanalesImpresionItemVentaResp> getCanalesImpresionItemVenta() {
        if (canalesImpresionItemVenta == null) {
            canalesImpresionItemVenta = new ArrayList<CanalesImpresionItemVentaResp>();
        }
        return this.canalesImpresionItemVenta;
    }

    /**
     * Gets the value of the canalesImpresionItemCortesia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the canalesImpresionItemCortesia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCanalesImpresionItemCortesia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CanalesImpresionItemCortesiaResp }
     * 
     * 
     */
    public List<CanalesImpresionItemCortesiaResp> getCanalesImpresionItemCortesia() {
        if (canalesImpresionItemCortesia == null) {
            canalesImpresionItemCortesia = new ArrayList<CanalesImpresionItemCortesiaResp>();
        }
        return this.canalesImpresionItemCortesia;
    }

    /**
     * Gets the value of the canalesImpresionItemResp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the canalesImpresionItemResp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCanalesImpresionItemResp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CanalesImpresionItemResp }
     * 
     * 
     */
    public List<CanalesImpresionItemResp> getCanalesImpresionItemResp() {
        if (canalesImpresionItemResp == null) {
            canalesImpresionItemResp = new ArrayList<CanalesImpresionItemResp>();
        }
        return this.canalesImpresionItemResp;
    }

    /**
     * Gets the value of the mensajeRespuestaBaseDTO property.
     * 
     * @return
     *     possible object is
     *     {@link MensajeRespuestaBaseDTO }
     *     
     */
    public MensajeRespuestaBaseDTO getMensajeRespuestaBaseDTO() {
        return mensajeRespuestaBaseDTO;
    }

    /**
     * Sets the value of the mensajeRespuestaBaseDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link MensajeRespuestaBaseDTO }
     *     
     */
    public void setMensajeRespuestaBaseDTO(MensajeRespuestaBaseDTO value) {
        this.mensajeRespuestaBaseDTO = value;
    }

    @Override
    public String toString() {
        return "CanalesImpresionResp{" +
                "codInfoVenta='" + codInfoVenta + '\'' +
                ", canalesImpresionItemVenta=" + canalesImpresionItemVenta +
                ", canalesImpresionItemCortesia=" + canalesImpresionItemCortesia +
                ", canalesImpresionItemResp=" + canalesImpresionItemResp +
                ", mensajeRespuestaBaseDTO=" + mensajeRespuestaBaseDTO +
                '}';
    }
}

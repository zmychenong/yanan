
package io.renren.common.agvs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>IOShowData complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="IOShowData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PortID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="ShowX" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="ShowY" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="SimulateValue" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="bStatus" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IOShowData", namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", propOrder = {
    "cardID",
    "name",
    "portID",
    "showX",
    "showY",
    "simulateValue",
    "type",
    "bStatus"
})
public class IOShowData {

    @XmlElement(name = "CardID")
    @XmlSchemaType(name = "unsignedShort")
    protected int cardID;
    @XmlElement(name = "Name", required = true, nillable = true)
    protected String name;
    @XmlElement(name = "PortID")
    @XmlSchemaType(name = "unsignedShort")
    protected int portID;
    @XmlElement(name = "ShowX")
    protected float showX;
    @XmlElement(name = "ShowY")
    protected float showY;
    @XmlElement(name = "SimulateValue")
    @XmlSchemaType(name = "unsignedShort")
    protected int simulateValue;
    @XmlElement(name = "Type")
    @XmlSchemaType(name = "unsignedShort")
    protected int type;
    protected boolean bStatus;

    /**
     * ��ȡcardID���Ե�ֵ��
     * 
     */
    public int getCardID() {
        return cardID;
    }

    /**
     * ����cardID���Ե�ֵ��
     * 
     */
    public void setCardID(int value) {
        this.cardID = value;
    }

    /**
     * ��ȡname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * ��ȡportID���Ե�ֵ��
     * 
     */
    public int getPortID() {
        return portID;
    }

    /**
     * ����portID���Ե�ֵ��
     * 
     */
    public void setPortID(int value) {
        this.portID = value;
    }

    /**
     * ��ȡshowX���Ե�ֵ��
     * 
     */
    public float getShowX() {
        return showX;
    }

    /**
     * ����showX���Ե�ֵ��
     * 
     */
    public void setShowX(float value) {
        this.showX = value;
    }

    /**
     * ��ȡshowY���Ե�ֵ��
     * 
     */
    public float getShowY() {
        return showY;
    }

    /**
     * ����showY���Ե�ֵ��
     * 
     */
    public void setShowY(float value) {
        this.showY = value;
    }

    /**
     * ��ȡsimulateValue���Ե�ֵ��
     * 
     */
    public int getSimulateValue() {
        return simulateValue;
    }

    /**
     * ����simulateValue���Ե�ֵ��
     * 
     */
    public void setSimulateValue(int value) {
        this.simulateValue = value;
    }

    /**
     * ��ȡtype���Ե�ֵ��
     * 
     */
    public int getType() {
        return type;
    }

    /**
     * ����type���Ե�ֵ��
     * 
     */
    public void setType(int value) {
        this.type = value;
    }

    /**
     * ��ȡbStatus���Ե�ֵ��
     * 
     */
    public boolean isBStatus() {
        return bStatus;
    }

    /**
     * ����bStatus���Ե�ֵ��
     * 
     */
    public void setBStatus(boolean value) {
        this.bStatus = value;
    }

}

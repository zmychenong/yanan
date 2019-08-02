
package io.renren.common.agvs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ChargeParkMessage complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ChargeParkMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CarrierID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="ChargeID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="Delaytime" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="EnterTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ParkID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="StationID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="StrIpAddr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UChargingState" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="UNeedPushFlag" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="UPriority" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="bCharge" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargeParkMessage", namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", propOrder = {
    "carrierID",
    "chargeID",
    "delaytime",
    "enterTime",
    "parkID",
    "stationID",
    "strIpAddr",
    "uChargingState",
    "uNeedPushFlag",
    "uPriority",
    "bCharge"
})
public class ChargeParkMessage {

    @XmlElement(name = "CarrierID")
    @XmlSchemaType(name = "unsignedShort")
    protected int carrierID;
    @XmlElement(name = "ChargeID")
    @XmlSchemaType(name = "unsignedShort")
    protected int chargeID;
    @XmlElement(name = "Delaytime")
    @XmlSchemaType(name = "unsignedShort")
    protected int delaytime;
    @XmlElement(name = "EnterTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar enterTime;
    @XmlElement(name = "ParkID")
    @XmlSchemaType(name = "unsignedShort")
    protected int parkID;
    @XmlElement(name = "StationID")
    @XmlSchemaType(name = "unsignedShort")
    protected int stationID;
    @XmlElement(name = "StrIpAddr", required = true, nillable = true)
    protected String strIpAddr;
    @XmlElement(name = "UChargingState")
    @XmlSchemaType(name = "unsignedShort")
    protected int uChargingState;
    @XmlElement(name = "UNeedPushFlag")
    @XmlSchemaType(name = "unsignedShort")
    protected int uNeedPushFlag;
    @XmlElement(name = "UPriority")
    @XmlSchemaType(name = "unsignedShort")
    protected int uPriority;
    protected boolean bCharge;

    /**
     * ��ȡcarrierID���Ե�ֵ��
     * 
     */
    public int getCarrierID() {
        return carrierID;
    }

    /**
     * ����carrierID���Ե�ֵ��
     * 
     */
    public void setCarrierID(int value) {
        this.carrierID = value;
    }

    /**
     * ��ȡchargeID���Ե�ֵ��
     * 
     */
    public int getChargeID() {
        return chargeID;
    }

    /**
     * ����chargeID���Ե�ֵ��
     * 
     */
    public void setChargeID(int value) {
        this.chargeID = value;
    }

    /**
     * ��ȡdelaytime���Ե�ֵ��
     * 
     */
    public int getDelaytime() {
        return delaytime;
    }

    /**
     * ����delaytime���Ե�ֵ��
     * 
     */
    public void setDelaytime(int value) {
        this.delaytime = value;
    }

    /**
     * ��ȡenterTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnterTime() {
        return enterTime;
    }

    /**
     * ����enterTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnterTime(XMLGregorianCalendar value) {
        this.enterTime = value;
    }

    /**
     * ��ȡparkID���Ե�ֵ��
     * 
     */
    public int getParkID() {
        return parkID;
    }

    /**
     * ����parkID���Ե�ֵ��
     * 
     */
    public void setParkID(int value) {
        this.parkID = value;
    }

    /**
     * ��ȡstationID���Ե�ֵ��
     * 
     */
    public int getStationID() {
        return stationID;
    }

    /**
     * ����stationID���Ե�ֵ��
     * 
     */
    public void setStationID(int value) {
        this.stationID = value;
    }

    /**
     * ��ȡstrIpAddr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrIpAddr() {
        return strIpAddr;
    }

    /**
     * ����strIpAddr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrIpAddr(String value) {
        this.strIpAddr = value;
    }

    /**
     * ��ȡuChargingState���Ե�ֵ��
     * 
     */
    public int getUChargingState() {
        return uChargingState;
    }

    /**
     * ����uChargingState���Ե�ֵ��
     * 
     */
    public void setUChargingState(int value) {
        this.uChargingState = value;
    }

    /**
     * ��ȡuNeedPushFlag���Ե�ֵ��
     * 
     */
    public int getUNeedPushFlag() {
        return uNeedPushFlag;
    }

    /**
     * ����uNeedPushFlag���Ե�ֵ��
     * 
     */
    public void setUNeedPushFlag(int value) {
        this.uNeedPushFlag = value;
    }

    /**
     * ��ȡuPriority���Ե�ֵ��
     * 
     */
    public int getUPriority() {
        return uPriority;
    }

    /**
     * ����uPriority���Ե�ֵ��
     * 
     */
    public void setUPriority(int value) {
        this.uPriority = value;
    }

    /**
     * ��ȡbCharge���Ե�ֵ��
     * 
     */
    public boolean isBCharge() {
        return bCharge;
    }

    /**
     * ����bCharge���Ե�ֵ��
     * 
     */
    public void setBCharge(boolean value) {
        this.bCharge = value;
    }

}


package io.renren.common.agvs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ParkMessage complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ParkMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CarrierID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="Delaytime" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="EnterTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="NodeID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="ParkID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="StationID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
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
@XmlType(name = "ParkMessage", namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", propOrder = {
    "carrierID",
    "delaytime",
    "enterTime",
    "nodeID",
    "parkID",
    "stationID",
    "uNeedPushFlag",
    "uPriority",
    "bCharge"
})
public class ParkMessage {

    @XmlElement(name = "CarrierID")
    @XmlSchemaType(name = "unsignedShort")
    protected int carrierID;
    @XmlElement(name = "Delaytime")
    @XmlSchemaType(name = "unsignedShort")
    protected int delaytime;
    @XmlElement(name = "EnterTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar enterTime;
    @XmlElement(name = "NodeID")
    @XmlSchemaType(name = "unsignedShort")
    protected int nodeID;
    @XmlElement(name = "ParkID")
    @XmlSchemaType(name = "unsignedShort")
    protected int parkID;
    @XmlElement(name = "StationID")
    @XmlSchemaType(name = "unsignedShort")
    protected int stationID;
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
     * ��ȡnodeID���Ե�ֵ��
     * 
     */
    public int getNodeID() {
        return nodeID;
    }

    /**
     * ����nodeID���Ե�ֵ��
     * 
     */
    public void setNodeID(int value) {
        this.nodeID = value;
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


package io.renren.common.agvs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service}WorkAreaName" minOccurs="0"/>
 *         &lt;element name="CarrierID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="SleepOrWakeup" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "carrierID",
    "sleepOrWakeup"
})
@XmlRootElement(name = "SetCarrierSleepOrWakeUp")
public class SetCarrierSleepOrWakeUp {

    @XmlElementRef(name = "Name", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<WorkAreaName> name;
    @XmlElement(name = "CarrierID")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer carrierID;
    @XmlElement(name = "SleepOrWakeup")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer sleepOrWakeup;

    /**
     * ��ȡname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}
     *     
     */
    public JAXBElement<WorkAreaName> getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}
     *     
     */
    public void setName(JAXBElement<WorkAreaName> value) {
        this.name = value;
    }

    /**
     * ��ȡcarrierID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCarrierID() {
        return carrierID;
    }

    /**
     * ����carrierID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCarrierID(Integer value) {
        this.carrierID = value;
    }

    /**
     * ��ȡsleepOrWakeup���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSleepOrWakeup() {
        return sleepOrWakeup;
    }

    /**
     * ����sleepOrWakeup���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSleepOrWakeup(Integer value) {
        this.sleepOrWakeup = value;
    }

}

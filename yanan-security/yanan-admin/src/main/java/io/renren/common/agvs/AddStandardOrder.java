
package io.renren.common.agvs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="OrderMessage" type="{http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service}AGVOrderMessage" minOccurs="0"/>
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
    "orderMessage"
})
@XmlRootElement(name = "AddStandardOrder")
public class AddStandardOrder {

    @XmlElementRef(name = "OrderMessage", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<AGVOrderMessage> orderMessage;

    /**
     * ��ȡorderMessage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AGVOrderMessage }{@code >}
     *     
     */
    public JAXBElement<AGVOrderMessage> getOrderMessage() {
        return orderMessage;
    }

    /**
     * ����orderMessage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AGVOrderMessage }{@code >}
     *     
     */
    public void setOrderMessage(JAXBElement<AGVOrderMessage> value) {
        this.orderMessage = value;
    }

}


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
 *         &lt;element name="GetStandardOrderResult" type="{http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service}AGVOrderMessage" minOccurs="0"/>
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
    "getStandardOrderResult"
})
@XmlRootElement(name = "GetStandardOrderResponse")
public class GetStandardOrderResponse {

    @XmlElementRef(name = "GetStandardOrderResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<AGVOrderMessage> getStandardOrderResult;

    /**
     * ��ȡgetStandardOrderResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AGVOrderMessage }{@code >}
     *     
     */
    public JAXBElement<AGVOrderMessage> getGetStandardOrderResult() {
        return getStandardOrderResult;
    }

    /**
     * ����getStandardOrderResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AGVOrderMessage }{@code >}
     *     
     */
    public void setGetStandardOrderResult(JAXBElement<AGVOrderMessage> value) {
        this.getStandardOrderResult = value;
    }

}

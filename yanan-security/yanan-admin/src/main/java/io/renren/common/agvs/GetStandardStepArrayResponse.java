
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
 *         &lt;element name="GetStandardStepArrayResult" type="{http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service}ArrayOfAGVStepMessage" minOccurs="0"/>
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
    "getStandardStepArrayResult"
})
@XmlRootElement(name = "GetStandardStepArrayResponse")
public class GetStandardStepArrayResponse {

    @XmlElementRef(name = "GetStandardStepArrayResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAGVStepMessage> getStandardStepArrayResult;

    /**
     * ��ȡgetStandardStepArrayResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAGVStepMessage }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAGVStepMessage> getGetStandardStepArrayResult() {
        return getStandardStepArrayResult;
    }

    /**
     * ����getStandardStepArrayResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAGVStepMessage }{@code >}
     *     
     */
    public void setGetStandardStepArrayResult(JAXBElement<ArrayOfAGVStepMessage> value) {
        this.getStandardStepArrayResult = value;
    }

}

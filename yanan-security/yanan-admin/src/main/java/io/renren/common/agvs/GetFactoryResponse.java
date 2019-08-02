
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
 *         &lt;element name="GetFactoryResult" type="{http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service}Factory" minOccurs="0"/>
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
    "getFactoryResult"
})
@XmlRootElement(name = "GetFactoryResponse")
public class GetFactoryResponse {

    @XmlElementRef(name = "GetFactoryResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Factory> getFactoryResult;

    /**
     * ��ȡgetFactoryResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Factory }{@code >}
     *     
     */
    public JAXBElement<Factory> getGetFactoryResult() {
        return getFactoryResult;
    }

    /**
     * ����getFactoryResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Factory }{@code >}
     *     
     */
    public void setGetFactoryResult(JAXBElement<Factory> value) {
        this.getFactoryResult = value;
    }

}

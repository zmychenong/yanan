
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
 *         &lt;element name="GetAllFactoryInCompanyResult" type="{http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service}ArrayOfFactory" minOccurs="0"/>
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
    "getAllFactoryInCompanyResult"
})
@XmlRootElement(name = "GetAllFactoryInCompanyResponse")
public class GetAllFactoryInCompanyResponse {

    @XmlElementRef(name = "GetAllFactoryInCompanyResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFactory> getAllFactoryInCompanyResult;

    /**
     * ��ȡgetAllFactoryInCompanyResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFactory }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFactory> getGetAllFactoryInCompanyResult() {
        return getAllFactoryInCompanyResult;
    }

    /**
     * ����getAllFactoryInCompanyResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFactory }{@code >}
     *     
     */
    public void setGetAllFactoryInCompanyResult(JAXBElement<ArrayOfFactory> value) {
        this.getAllFactoryInCompanyResult = value;
    }

}

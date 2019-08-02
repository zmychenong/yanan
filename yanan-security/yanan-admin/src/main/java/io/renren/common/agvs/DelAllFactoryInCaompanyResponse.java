
package io.renren.common.agvs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="DelAllFactoryInCaompanyResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "delAllFactoryInCaompanyResult"
})
@XmlRootElement(name = "DelAllFactoryInCaompanyResponse")
public class DelAllFactoryInCaompanyResponse {

    @XmlElement(name = "DelAllFactoryInCaompanyResult")
    protected Boolean delAllFactoryInCaompanyResult;

    /**
     * ��ȡdelAllFactoryInCaompanyResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelAllFactoryInCaompanyResult() {
        return delAllFactoryInCaompanyResult;
    }

    /**
     * ����delAllFactoryInCaompanyResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelAllFactoryInCaompanyResult(Boolean value) {
        this.delAllFactoryInCaompanyResult = value;
    }

}

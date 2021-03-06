
package io.renren.common.agvs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="CompanyID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="FactoryID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
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
    "companyID",
    "factoryID"
})
@XmlRootElement(name = "GetAllWorkAreaInFactory")
public class GetAllWorkAreaInFactory {

    @XmlElement(name = "CompanyID")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer companyID;
    @XmlElement(name = "FactoryID")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer factoryID;

    /**
     * ��ȡcompanyID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCompanyID() {
        return companyID;
    }

    /**
     * ����companyID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCompanyID(Integer value) {
        this.companyID = value;
    }

    /**
     * ��ȡfactoryID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFactoryID() {
        return factoryID;
    }

    /**
     * ����factoryID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFactoryID(Integer value) {
        this.factoryID = value;
    }

}

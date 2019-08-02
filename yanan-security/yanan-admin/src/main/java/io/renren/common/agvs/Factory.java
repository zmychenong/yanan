
package io.renren.common.agvs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * <p>Factory complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Factory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompanyID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="FactoryID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="FactoryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Factory", namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", propOrder = {
    "companyID",
    "factoryID",
    "factoryName"
})
@ApiModel(value="Factory",description="工厂类")
public class Factory {

    @XmlElement(name = "CompanyID")
    @XmlSchemaType(name = "unsignedShort")
    @ApiModelProperty
    protected int companyID;
    @XmlElement(name = "FactoryID")
    @XmlSchemaType(name = "unsignedShort")
    @ApiModelProperty
    protected int factoryID;
    @XmlElement(name = "FactoryName", required = true, nillable = true)
    @ApiModelProperty
    protected String factoryName;

    /**
     * ��ȡcompanyID���Ե�ֵ��
     * 
     */
    public int getCompanyID() {
        return companyID;
    }

    /**
     * ����companyID���Ե�ֵ��
     * 
     */
    public void setCompanyID(int value) {
        this.companyID = value;
    }

    /**
     * ��ȡfactoryID���Ե�ֵ��
     * 
     */
    public int getFactoryID() {
        return factoryID;
    }

    /**
     * ����factoryID���Ե�ֵ��
     * 
     */
    public void setFactoryID(int value) {
        this.factoryID = value;
    }

    /**
     * ��ȡfactoryName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactoryName() {
        return factoryName;
    }

    /**
     * ����factoryName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactoryName(String value) {
        this.factoryName = value;
    }

}

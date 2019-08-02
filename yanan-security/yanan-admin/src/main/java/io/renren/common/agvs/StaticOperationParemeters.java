
package io.renren.common.agvs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>StaticOperationParemeters complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="StaticOperationParemeters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Introduce" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OPName" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="OperationID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="OperationPars" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfunsignedShort"/>
 *         &lt;element name="OperationType" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StaticOperationParemeters", namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", propOrder = {
    "introduce",
    "opName",
    "operationID",
    "operationPars",
    "operationType"
})
public class StaticOperationParemeters {

    @XmlElement(name = "Introduce", required = true, nillable = true)
    protected String introduce;
    @XmlElement(name = "OPName")
    @XmlSchemaType(name = "unsignedShort")
    protected int opName;
    @XmlElement(name = "OperationID")
    @XmlSchemaType(name = "unsignedShort")
    protected int operationID;
    @XmlElement(name = "OperationPars", required = true, nillable = true)
    protected ArrayOfunsignedShort operationPars;
    @XmlElement(name = "OperationType")
    @XmlSchemaType(name = "unsignedShort")
    protected int operationType;

    /**
     * ��ȡintroduce���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntroduce() {
        return introduce;
    }

    /**
     * ����introduce���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntroduce(String value) {
        this.introduce = value;
    }

    /**
     * ��ȡopName���Ե�ֵ��
     * 
     */
    public int getOPName() {
        return opName;
    }

    /**
     * ����opName���Ե�ֵ��
     * 
     */
    public void setOPName(int value) {
        this.opName = value;
    }

    /**
     * ��ȡoperationID���Ե�ֵ��
     * 
     */
    public int getOperationID() {
        return operationID;
    }

    /**
     * ����operationID���Ե�ֵ��
     * 
     */
    public void setOperationID(int value) {
        this.operationID = value;
    }

    /**
     * ��ȡoperationPars���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfunsignedShort }
     *     
     */
    public ArrayOfunsignedShort getOperationPars() {
        return operationPars;
    }

    /**
     * ����operationPars���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfunsignedShort }
     *     
     */
    public void setOperationPars(ArrayOfunsignedShort value) {
        this.operationPars = value;
    }

    /**
     * ��ȡoperationType���Ե�ֵ��
     * 
     */
    public int getOperationType() {
        return operationType;
    }

    /**
     * ����operationType���Ե�ֵ��
     * 
     */
    public void setOperationType(int value) {
        this.operationType = value;
    }

}

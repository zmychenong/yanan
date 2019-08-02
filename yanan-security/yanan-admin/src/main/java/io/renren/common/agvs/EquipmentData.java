
package io.renren.common.agvs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * <p>EquipmentData complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="EquipmentData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StrIP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UChargeTime" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="UCurEquipmentState" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="UEquipmentID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="UGoalEquipmentState" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="UNodeID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="UStyle" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentData", namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", propOrder = {
    "strIP",
    "uChargeTime",
    "uCurEquipmentState",
    "uEquipmentID",
    "uGoalEquipmentState",
    "uNodeID",
    "uStyle"
})
@ApiModel(value="EquipmentData",description="设备类")
public class EquipmentData {

    @XmlElement(name = "StrIP", required = true, nillable = true)
    @ApiModelProperty
    protected String strIP;
    @XmlElement(name = "UChargeTime")
    @XmlSchemaType(name = "unsignedShort")
    @ApiModelProperty
    protected int uChargeTime;
    @XmlElement(name = "UCurEquipmentState")
    @XmlSchemaType(name = "unsignedShort")
    @ApiModelProperty
    protected int uCurEquipmentState;
    @XmlElement(name = "UEquipmentID")
    @XmlSchemaType(name = "unsignedShort")
    @ApiModelProperty
    protected int uEquipmentID;
    @XmlElement(name = "UGoalEquipmentState")
    @XmlSchemaType(name = "unsignedShort")
    @ApiModelProperty
    protected int uGoalEquipmentState;
    @XmlElement(name = "UNodeID")
    @XmlSchemaType(name = "unsignedShort")
    @ApiModelProperty
    protected int uNodeID;
    @XmlElement(name = "UStyle")
    @XmlSchemaType(name = "unsignedShort")
    @ApiModelProperty
    protected int uStyle;

    /**
     * ��ȡstrIP���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrIP() {
        return strIP;
    }

    /**
     * ����strIP���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrIP(String value) {
        this.strIP = value;
    }

    /**
     * ��ȡuChargeTime���Ե�ֵ��
     * 
     */
    public int getUChargeTime() {
        return uChargeTime;
    }

    /**
     * ����uChargeTime���Ե�ֵ��
     * 
     */
    public void setUChargeTime(int value) {
        this.uChargeTime = value;
    }

    /**
     * ��ȡuCurEquipmentState���Ե�ֵ��
     * 
     */
    public int getUCurEquipmentState() {
        return uCurEquipmentState;
    }

    /**
     * ����uCurEquipmentState���Ե�ֵ��
     * 
     */
    public void setUCurEquipmentState(int value) {
        this.uCurEquipmentState = value;
    }

    /**
     * ��ȡuEquipmentID���Ե�ֵ��
     * 
     */
    public int getUEquipmentID() {
        return uEquipmentID;
    }

    /**
     * ����uEquipmentID���Ե�ֵ��
     * 
     */
    public void setUEquipmentID(int value) {
        this.uEquipmentID = value;
    }

    /**
     * ��ȡuGoalEquipmentState���Ե�ֵ��
     * 
     */
    public int getUGoalEquipmentState() {
        return uGoalEquipmentState;
    }

    /**
     * ����uGoalEquipmentState���Ե�ֵ��
     * 
     */
    public void setUGoalEquipmentState(int value) {
        this.uGoalEquipmentState = value;
    }

    /**
     * ��ȡuNodeID���Ե�ֵ��
     * 
     */
    public int getUNodeID() {
        return uNodeID;
    }

    /**
     * ����uNodeID���Ե�ֵ��
     * 
     */
    public void setUNodeID(int value) {
        this.uNodeID = value;
    }

    /**
     * ��ȡuStyle���Ե�ֵ��
     * 
     */
    public int getUStyle() {
        return uStyle;
    }

    /**
     * ����uStyle���Ե�ֵ��
     * 
     */
    public void setUStyle(int value) {
        this.uStyle = value;
    }

}

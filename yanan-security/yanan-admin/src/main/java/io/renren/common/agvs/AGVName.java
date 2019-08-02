
package io.renren.common.agvs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * <p>AGVName complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AGVName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AGVID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="AGV_Type" type="{http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service}AGVType"/>
 *         &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WorkArea" type="{http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service}WorkAreaName"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AGVName", namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", propOrder = {
    "agvid",
    "agvType",
    "productID",
    "workArea"
})
@ApiModel(value="AGVName",description="AGV小车信息类")
public class AGVName {

    @XmlElement(name = "AGVID")
    @XmlSchemaType(name = "unsignedShort")
    @ApiModelProperty
    protected int agvid;
    @XmlElement(name = "AGV_Type", required = true, nillable = true)
    @ApiModelProperty("AGV类别对象")
    protected AGVType agvType;
    @XmlElement(name = "ProductID", required = true, nillable = true)
    @ApiModelProperty
    protected String productID;
    @XmlElement(name = "WorkArea", required = true, nillable = true)
    @ApiModelProperty("工作区对象")
    protected WorkAreaName workArea;

    /**
     * ��ȡagvid���Ե�ֵ��
     * 
     */
    public int getAGVID() {
        return agvid;
    }

    /**
     * ����agvid���Ե�ֵ��
     * 
     */
    public void setAGVID(int value) {
        this.agvid = value;
    }

    /**
     * ��ȡagvType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AGVType }
     *     
     */
    public AGVType getAGVType() {
        return agvType;
    }

    /**
     * ����agvType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AGVType }
     *     
     */
    public void setAGVType(AGVType value) {
        this.agvType = value;
    }

    /**
     * ��ȡproductID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductID() {
        return productID;
    }

    /**
     * ����productID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductID(String value) {
        this.productID = value;
    }

    /**
     * ��ȡworkArea���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WorkAreaName }
     *     
     */
    public WorkAreaName getWorkArea() {
        return workArea;
    }

    /**
     * ����workArea���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WorkAreaName }
     *     
     */
    public void setWorkArea(WorkAreaName value) {
        this.workArea = value;
    }

}

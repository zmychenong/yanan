
package io.renren.common.agvs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * <p>WorkAreaName complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WorkAreaName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AreaID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="AreaName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CompanyID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="FactoryID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="MapVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkAreaName", namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", propOrder = {
    "areaID",
    "areaName",
    "companyID",
    "factoryID",
    "mapVersion"
})
@ApiModel(value="WorkAreaName",description="工作区对象")
public class WorkAreaName {

    @XmlElement(name = "AreaID")
    @XmlSchemaType(name = "unsignedShort")
    @ApiModelProperty("工作区ID")
    protected int areaID;
    @XmlElement(name = "AreaName", required = true, nillable = true)
    @ApiModelProperty("工作区名称")
    protected String areaName;
    @XmlElement(name = "CompanyID")
    @XmlSchemaType(name = "unsignedShort")
    @ApiModelProperty("公司ID")
    protected int companyID;
    @XmlElement(name = "FactoryID")
    @XmlSchemaType(name = "unsignedShort")
    @ApiModelProperty("仓库ID")
    protected int factoryID;
    @XmlElement(name = "MapVersion", required = true, nillable = true)
    @ApiModelProperty("地图版本")
    protected String mapVersion;

    /**
     * ��ȡareaID���Ե�ֵ��
     * 
     */
    public int getAreaID() {
        return areaID;
    }

    /**
     * ����areaID���Ե�ֵ��
     * 
     */
    public void setAreaID(int value) {
        this.areaID = value;
    }

    /**
     * ��ȡareaName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * ����areaName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaName(String value) {
        this.areaName = value;
    }

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
     * ��ȡmapVersion���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapVersion() {
        return mapVersion;
    }

    /**
     * ����mapVersion���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapVersion(String value) {
        this.mapVersion = value;
    }

	@Override
	public String toString() {
		return "WorkAreaName [areaID=" + areaID + ", areaName=" + areaName + ", companyID=" + companyID + ", factoryID="
				+ factoryID + ", mapVersion=" + mapVersion + "]";
	}
    
    

}

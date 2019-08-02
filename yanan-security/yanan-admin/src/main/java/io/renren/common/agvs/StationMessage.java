
package io.renren.common.agvs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * <p>StationMessage complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="StationMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ParkArray" type="{http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service}ArrayOfParkMessage"/>
 *         &lt;element name="StationID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="Stationlevel" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="Stationtype" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="bHasFreePark" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StationMessage", namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", propOrder = {
    "parkArray",
    "stationID",
    "stationlevel",
    "stationtype",
    "bHasFreePark"
})
@ApiModel(value="StationMessage",description="站点信息类")
public class StationMessage {

    @XmlElement(name = "ParkArray", required = true, nillable = true)
    @ApiModelProperty
    protected ArrayOfParkMessage parkArray;
    @XmlElement(name = "StationID")
    @XmlSchemaType(name = "unsignedShort")
    @ApiModelProperty
    protected int stationID;
    @XmlElement(name = "Stationlevel")
    @XmlSchemaType(name = "unsignedShort")
    @ApiModelProperty
    protected int stationlevel;
    @XmlElement(name = "Stationtype")
    @XmlSchemaType(name = "unsignedShort")
    @ApiModelProperty
    protected int stationtype;
    @ApiModelProperty
    protected boolean bHasFreePark;

    /**
     * ��ȡparkArray���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfParkMessage }
     *     
     */
    public ArrayOfParkMessage getParkArray() {
        return parkArray;
    }

    /**
     * ����parkArray���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfParkMessage }
     *     
     */
    public void setParkArray(ArrayOfParkMessage value) {
        this.parkArray = value;
    }

    /**
     * ��ȡstationID���Ե�ֵ��
     * 
     */
    public int getStationID() {
        return stationID;
    }

    /**
     * ����stationID���Ե�ֵ��
     * 
     */
    public void setStationID(int value) {
        this.stationID = value;
    }

    /**
     * ��ȡstationlevel���Ե�ֵ��
     * 
     */
    public int getStationlevel() {
        return stationlevel;
    }

    /**
     * ����stationlevel���Ե�ֵ��
     * 
     */
    public void setStationlevel(int value) {
        this.stationlevel = value;
    }

    /**
     * ��ȡstationtype���Ե�ֵ��
     * 
     */
    public int getStationtype() {
        return stationtype;
    }

    /**
     * ����stationtype���Ե�ֵ��
     * 
     */
    public void setStationtype(int value) {
        this.stationtype = value;
    }

    /**
     * ��ȡbHasFreePark���Ե�ֵ��
     * 
     */
    public boolean isBHasFreePark() {
        return bHasFreePark;
    }

    /**
     * ����bHasFreePark���Ե�ֵ��
     * 
     */
    public void setBHasFreePark(boolean value) {
        this.bHasFreePark = value;
    }

}


package io.renren.common.agvs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * <p>AGVOrderMessage complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AGVOrderMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CarrierID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="CarrierType" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="CreateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Introduce" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Level" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="MessageTag" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="OrderSource" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="StepArray" type="{http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service}ArrayOfAGVStepMessage"/>
 *         &lt;element name="Style" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="TUserCreateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TagEnd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="TagInvite" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UUserLevel" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="WorkArea" type="{http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service}WorkAreaName"/>
 *         &lt;element name="WorkStatus" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AGVOrderMessage", namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", propOrder = {
    "carrierID",
    "carrierType",
    "createTime",
    "endTime",
    "introduce",
    "level",
    "messageTag",
    "number",
    "orderID",
    "orderSource",
    "startTime",
    "stepArray",
    "style",
    "tUserCreateTime",
    "tagEnd",
    "tagInvite",
    "uUserLevel",
    "workArea",
    "workStatus"
})
@ApiModel(value="AGVOrderMessage",description="AGV任务信息类")
public class AGVOrderMessage {

    @XmlElement(name = "CarrierID")
    @XmlSchemaType(name = "unsignedShort")
    @ApiModelProperty
    protected int carrierID;
    @XmlElement(name = "CarrierType")
    @XmlSchemaType(name = "unsignedShort")
    @ApiModelProperty
    protected int carrierType;
    @XmlElement(name = "CreateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    @ApiModelProperty
    protected XMLGregorianCalendar createTime;
    @XmlElement(name = "EndTime", required = true)
    @XmlSchemaType(name = "dateTime")
    @ApiModelProperty
    protected XMLGregorianCalendar endTime;
    @XmlElement(name = "Introduce", required = true, nillable = true)
    @ApiModelProperty("任务介绍")
    protected String introduce;
    @XmlElement(name = "Level")
    @XmlSchemaType(name = "unsignedShort")
    @ApiModelProperty
    protected int level;
    @XmlElement(name = "MessageTag")
    @ApiModelProperty
    protected long messageTag;
    @XmlElement(name = "Number")
    @XmlSchemaType(name = "unsignedShort")
    @ApiModelProperty
    protected int number;
    @XmlElement(name = "OrderID")
    @XmlSchemaType(name = "unsignedShort")
    @ApiModelProperty
    protected int orderID;
    @XmlElement(name = "OrderSource")
    @XmlSchemaType(name = "unsignedShort")
    @ApiModelProperty
    protected int orderSource;
    @XmlElement(name = "StartTime", required = true)
    @XmlSchemaType(name = "dateTime")
    @ApiModelProperty
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "StepArray", required = true, nillable = true)
    @ApiModelProperty
    protected ArrayOfAGVStepMessage stepArray;
    @XmlElement(name = "Style")
    @XmlSchemaType(name = "unsignedShort")
    @ApiModelProperty
    protected int style;
    @XmlElement(name = "TUserCreateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    @ApiModelProperty
    protected XMLGregorianCalendar tUserCreateTime;
    @XmlElement(name = "TagEnd")
    @ApiModelProperty
    protected boolean tagEnd;
    @XmlElement(name = "TagInvite")
    @ApiModelProperty
    protected boolean tagInvite;
    @XmlElement(name = "UUserLevel")
    @XmlSchemaType(name = "unsignedShort")
    @ApiModelProperty
    protected int uUserLevel;
    @XmlElement(name = "WorkArea", required = true, nillable = true)
    @ApiModelProperty
    protected WorkAreaName workArea;
    @XmlElement(name = "WorkStatus")
    @XmlSchemaType(name = "unsignedShort")
    @ApiModelProperty
    protected int workStatus;

    /**
     * 获取carrierID属性的值。
     * 
     */
    public int getCarrierID() {
        return carrierID;
    }

    /**
     * 设置carrierID属性的值。
     * 
     */
    public void setCarrierID(int value) {
        this.carrierID = value;
    }

    /**
     * 获取carrierType属性的值。
     * 
     */
    public int getCarrierType() {
        return carrierType;
    }

    /**
     * 设置carrierType属性的值。
     * 
     */
    public void setCarrierType(int value) {
        this.carrierType = value;
    }

    /**
     * 获取createTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateTime() {
        return createTime;
    }

    /**
     * 设置createTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateTime(XMLGregorianCalendar value) {
        this.createTime = value;
    }

    /**
     * 获取endTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * 设置endTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * 获取introduce属性的值。
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
     * 设置introduce属性的值。
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
     * 获取level属性的值。
     * 
     */
    public int getLevel() {
        return level;
    }

    /**
     * 设置level属性的值。
     * 
     */
    public void setLevel(int value) {
        this.level = value;
    }

    /**
     * 获取messageTag属性的值。
     * 
     */
    public long getMessageTag() {
        return messageTag;
    }

    /**
     * 设置messageTag属性的值。
     * 
     */
    public void setMessageTag(long value) {
        this.messageTag = value;
    }

    /**
     * 获取number属性的值。
     * 
     */
    public int getNumber() {
        return number;
    }

    /**
     * 设置number属性的值。
     * 
     */
    public void setNumber(int value) {
        this.number = value;
    }

    /**
     * 获取orderID属性的值。
     * 
     */
    public int getOrderID() {
        return orderID;
    }

    /**
     * 设置orderID属性的值。
     * 
     */
    public void setOrderID(int value) {
        this.orderID = value;
    }

    /**
     * 获取orderSource属性的值。
     * 
     */
    public int getOrderSource() {
        return orderSource;
    }

    /**
     * 设置orderSource属性的值。
     * 
     */
    public void setOrderSource(int value) {
        this.orderSource = value;
    }

    /**
     * 获取startTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * 设置startTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * 获取stepArray属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAGVStepMessage }
     *     
     */
    public ArrayOfAGVStepMessage getStepArray() {
        return stepArray;
    }

    /**
     * 设置stepArray属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAGVStepMessage }
     *     
     */
    public void setStepArray(ArrayOfAGVStepMessage value) {
        this.stepArray = value;
    }

    /**
     * 获取style属性的值。
     * 
     */
    public int getStyle() {
        return style;
    }

    /**
     * 设置style属性的值。
     * 
     */
    public void setStyle(int value) {
        this.style = value;
    }

    /**
     * 获取tUserCreateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTUserCreateTime() {
        return tUserCreateTime;
    }

    /**
     * 设置tUserCreateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTUserCreateTime(XMLGregorianCalendar value) {
        this.tUserCreateTime = value;
    }

    /**
     * 获取tagEnd属性的值。
     * 
     */
    public boolean isTagEnd() {
        return tagEnd;
    }

    /**
     * 设置tagEnd属性的值。
     * 
     */
    public void setTagEnd(boolean value) {
        this.tagEnd = value;
    }

    /**
     * 获取tagInvite属性的值。
     * 
     */
    public boolean isTagInvite() {
        return tagInvite;
    }

    /**
     * 设置tagInvite属性的值。
     * 
     */
    public void setTagInvite(boolean value) {
        this.tagInvite = value;
    }

    /**
     * 获取uUserLevel属性的值。
     * 
     */
    public int getUUserLevel() {
        return uUserLevel;
    }

    /**
     * 设置uUserLevel属性的值。
     * 
     */
    public void setUUserLevel(int value) {
        this.uUserLevel = value;
    }

    /**
     * 获取workArea属性的值。
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
     * 设置workArea属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WorkAreaName }
     *     
     */
    public void setWorkArea(WorkAreaName value) {
        this.workArea = value;
    }

    /**
     * 获取workStatus属性的值。
     * 
     */
    public int getWorkStatus() {
        return workStatus;
    }

    /**
     * 设置workStatus属性的值。
     * 
     */
    public void setWorkStatus(int value) {
        this.workStatus = value;
    }

}


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
 * <p>AGVStepMessage complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AGVStepMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CarrierID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="CreateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="MessageTag" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="StepID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="StepMov" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="StepOp" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
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
@XmlType(name = "AGVStepMessage", namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", propOrder = {
    "carrierID",
    "createTime",
    "endTime",
    "messageTag",
    "number",
    "orderID",
    "orderNumber",
    "startTime",
    "stepID",
    "stepMov",
    "stepOp",
    "workArea",
    "workStatus"
})
@ApiModel(value="AGVStepMessage",description="AGV工作区节点类")
public class AGVStepMessage {

    @XmlElement(name = "CarrierID")
    @XmlSchemaType(name = "unsignedShort")
    @ApiModelProperty("AGVID")
    protected int carrierID;
    @XmlElement(name = "CreateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    @ApiModelProperty("创建时间")
    protected XMLGregorianCalendar createTime;
    @XmlElement(name = "EndTime", required = true)
    @XmlSchemaType(name = "dateTime")
    @ApiModelProperty("结束时间")
    protected XMLGregorianCalendar endTime;
    @XmlElement(name = "MessageTag")
    @XmlSchemaType(name = "unsignedShort")
    @ApiModelProperty("消息标记")
    protected int messageTag;
    @XmlElement(name = "Number")
    @XmlSchemaType(name = "unsignedShort")
    @ApiModelProperty
    protected int number;
    @XmlElement(name = "OrderID")
    @XmlSchemaType(name = "unsignedShort")
    @ApiModelProperty("任务ID")
    protected int orderID;
    @XmlElement(name = "OrderNumber")
    @XmlSchemaType(name = "unsignedShort")
    protected int orderNumber;
    @XmlElement(name = "StartTime", required = true)
    @XmlSchemaType(name = "dateTime")
    @ApiModelProperty("开始时间")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "StepID")
    @XmlSchemaType(name = "unsignedShort")
    protected int stepID;
    @XmlElement(name = "StepMov")
    @XmlSchemaType(name = "unsignedShort")
    @ApiModelProperty
    protected int stepMov;
    @XmlElement(name = "StepOp")
    @XmlSchemaType(name = "unsignedShort")
    @ApiModelProperty
    protected int stepOp;
    @XmlElement(name = "WorkArea", required = true, nillable = true)
    @ApiModelProperty
    protected WorkAreaName workArea;
    @XmlElement(name = "WorkStatus")
    @XmlSchemaType(name = "unsignedShort")
    @ApiModelProperty
    protected int workStatus;

    /**
     * ��ȡcarrierID���Ե�ֵ��
     * 
     */
    public int getCarrierID() {
        return carrierID;
    }

    /**
     * ����carrierID���Ե�ֵ��
     * 
     */
    public void setCarrierID(int value) {
        this.carrierID = value;
    }

    /**
     * ��ȡcreateTime���Ե�ֵ��
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
     * ����createTime���Ե�ֵ��
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
     * ��ȡendTime���Ե�ֵ��
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
     * ����endTime���Ե�ֵ��
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
     * ��ȡmessageTag���Ե�ֵ��
     * 
     */
    public int getMessageTag() {
        return messageTag;
    }

    /**
     * ����messageTag���Ե�ֵ��
     * 
     */
    public void setMessageTag(int value) {
        this.messageTag = value;
    }

    /**
     * ��ȡnumber���Ե�ֵ��
     * 
     */
    public int getNumber() {
        return number;
    }

    /**
     * ����number���Ե�ֵ��
     * 
     */
    public void setNumber(int value) {
        this.number = value;
    }

    /**
     * ��ȡorderID���Ե�ֵ��
     * 
     */
    public int getOrderID() {
        return orderID;
    }

    /**
     * ����orderID���Ե�ֵ��
     * 
     */
    public void setOrderID(int value) {
        this.orderID = value;
    }

    /**
     * ��ȡorderNumber���Ե�ֵ��
     * 
     */
    public int getOrderNumber() {
        return orderNumber;
    }

    /**
     * ����orderNumber���Ե�ֵ��
     * 
     */
    public void setOrderNumber(int value) {
        this.orderNumber = value;
    }

    /**
     * ��ȡstartTime���Ե�ֵ��
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
     * ����startTime���Ե�ֵ��
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
     * ��ȡstepID���Ե�ֵ��
     * 
     */
    public int getStepID() {
        return stepID;
    }

    /**
     * ����stepID���Ե�ֵ��
     * 
     */
    public void setStepID(int value) {
        this.stepID = value;
    }

    /**
     * ��ȡstepMov���Ե�ֵ��
     * 
     */
    public int getStepMov() {
        return stepMov;
    }

    /**
     * ����stepMov���Ե�ֵ��
     * 
     */
    public void setStepMov(int value) {
        this.stepMov = value;
    }

    /**
     * ��ȡstepOp���Ե�ֵ��
     * 
     */
    public int getStepOp() {
        return stepOp;
    }

    /**
     * ����stepOp���Ե�ֵ��
     * 
     */
    public void setStepOp(int value) {
        this.stepOp = value;
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

    /**
     * ��ȡworkStatus���Ե�ֵ��
     * 
     */
    public int getWorkStatus() {
        return workStatus;
    }

    /**
     * ����workStatus���Ե�ֵ��
     * 
     */
    public void setWorkStatus(int value) {
        this.workStatus = value;
    }

}

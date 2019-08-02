
package io.renren.common.agvs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AGVStatusMessage complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AGVStatusMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AGVType" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="BatteryLevel" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="BatteryVolty" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="EndNode" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="Event" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="GuideSensor_X" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="GuideSensor_Y" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="GuideStatus" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="Lifter" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="MarkStatus" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="Material" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MessageTag" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="Name" type="{http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service}AGVName"/>
 *         &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="Position_Angle" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="Position_X" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="Position_Y" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="StartNode" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="StepFrom" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="StepID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="StepOperation" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="StepTo" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="TagLog" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
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
@XmlType(name = "AGVStatusMessage", namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", propOrder = {
    "agvType",
    "batteryLevel",
    "batteryVolty",
    "endNode",
    "event",
    "guideSensorX",
    "guideSensorY",
    "guideStatus",
    "lifter",
    "markStatus",
    "material",
    "messageTag",
    "name",
    "orderID",
    "positionAngle",
    "positionX",
    "positionY",
    "startNode",
    "stepFrom",
    "stepID",
    "stepOperation",
    "stepTo",
    "tagLog",
    "workStatus"
})
public class AGVStatusMessage {

    @XmlElement(name = "AGVType")
    @XmlSchemaType(name = "unsignedShort")
    protected int agvType;
    @XmlElement(name = "BatteryLevel")
    @XmlSchemaType(name = "unsignedShort")
    protected int batteryLevel;
    @XmlElement(name = "BatteryVolty")
    protected float batteryVolty;
    @XmlElement(name = "EndNode")
    @XmlSchemaType(name = "unsignedShort")
    protected int endNode;
    @XmlElement(name = "Event")
    @XmlSchemaType(name = "unsignedShort")
    protected int event;
    @XmlElement(name = "GuideSensor_X")
    protected float guideSensorX;
    @XmlElement(name = "GuideSensor_Y")
    protected float guideSensorY;
    @XmlElement(name = "GuideStatus")
    @XmlSchemaType(name = "unsignedShort")
    protected int guideStatus;
    @XmlElement(name = "Lifter")
    @XmlSchemaType(name = "unsignedShort")
    protected int lifter;
    @XmlElement(name = "MarkStatus")
    @XmlSchemaType(name = "unsignedShort")
    protected int markStatus;
    @XmlElement(name = "Material", required = true, nillable = true)
    protected String material;
    @XmlElement(name = "MessageTag")
    @XmlSchemaType(name = "unsignedShort")
    protected int messageTag;
    @XmlElement(name = "Name", required = true, nillable = true)
    protected AGVName name;
    @XmlElement(name = "OrderID")
    @XmlSchemaType(name = "unsignedShort")
    protected int orderID;
    @XmlElement(name = "Position_Angle")
    protected float positionAngle;
    @XmlElement(name = "Position_X")
    protected float positionX;
    @XmlElement(name = "Position_Y")
    protected float positionY;
    @XmlElement(name = "StartNode")
    @XmlSchemaType(name = "unsignedShort")
    protected int startNode;
    @XmlElement(name = "StepFrom")
    @XmlSchemaType(name = "unsignedShort")
    protected int stepFrom;
    @XmlElement(name = "StepID")
    @XmlSchemaType(name = "unsignedShort")
    protected int stepID;
    @XmlElement(name = "StepOperation")
    @XmlSchemaType(name = "unsignedShort")
    protected int stepOperation;
    @XmlElement(name = "StepTo")
    @XmlSchemaType(name = "unsignedShort")
    protected int stepTo;
    @XmlElement(name = "TagLog")
    @XmlSchemaType(name = "unsignedShort")
    protected int tagLog;
    @XmlElement(name = "WorkStatus")
    @XmlSchemaType(name = "unsignedShort")
    protected int workStatus;

    /**
     * ��ȡagvType���Ե�ֵ��
     * 
     */
    public int getAGVType() {
        return agvType;
    }

    /**
     * ����agvType���Ե�ֵ��
     * 
     */
    public void setAGVType(int value) {
        this.agvType = value;
    }

    /**
     * ��ȡbatteryLevel���Ե�ֵ��
     * 
     */
    public int getBatteryLevel() {
        return batteryLevel;
    }

    /**
     * ����batteryLevel���Ե�ֵ��
     * 
     */
    public void setBatteryLevel(int value) {
        this.batteryLevel = value;
    }

    /**
     * ��ȡbatteryVolty���Ե�ֵ��
     * 
     */
    public float getBatteryVolty() {
        return batteryVolty;
    }

    /**
     * ����batteryVolty���Ե�ֵ��
     * 
     */
    public void setBatteryVolty(float value) {
        this.batteryVolty = value;
    }

    /**
     * ��ȡendNode���Ե�ֵ��
     * 
     */
    public int getEndNode() {
        return endNode;
    }

    /**
     * ����endNode���Ե�ֵ��
     * 
     */
    public void setEndNode(int value) {
        this.endNode = value;
    }

    /**
     * ��ȡevent���Ե�ֵ��
     * 
     */
    public int getEvent() {
        return event;
    }

    /**
     * ����event���Ե�ֵ��
     * 
     */
    public void setEvent(int value) {
        this.event = value;
    }

    /**
     * ��ȡguideSensorX���Ե�ֵ��
     * 
     */
    public float getGuideSensorX() {
        return guideSensorX;
    }

    /**
     * ����guideSensorX���Ե�ֵ��
     * 
     */
    public void setGuideSensorX(float value) {
        this.guideSensorX = value;
    }

    /**
     * ��ȡguideSensorY���Ե�ֵ��
     * 
     */
    public float getGuideSensorY() {
        return guideSensorY;
    }

    /**
     * ����guideSensorY���Ե�ֵ��
     * 
     */
    public void setGuideSensorY(float value) {
        this.guideSensorY = value;
    }

    /**
     * ��ȡguideStatus���Ե�ֵ��
     * 
     */
    public int getGuideStatus() {
        return guideStatus;
    }

    /**
     * ����guideStatus���Ե�ֵ��
     * 
     */
    public void setGuideStatus(int value) {
        this.guideStatus = value;
    }

    /**
     * ��ȡlifter���Ե�ֵ��
     * 
     */
    public int getLifter() {
        return lifter;
    }

    /**
     * ����lifter���Ե�ֵ��
     * 
     */
    public void setLifter(int value) {
        this.lifter = value;
    }

    /**
     * ��ȡmarkStatus���Ե�ֵ��
     * 
     */
    public int getMarkStatus() {
        return markStatus;
    }

    /**
     * ����markStatus���Ե�ֵ��
     * 
     */
    public void setMarkStatus(int value) {
        this.markStatus = value;
    }

    /**
     * ��ȡmaterial���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterial() {
        return material;
    }

    /**
     * ����material���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterial(String value) {
        this.material = value;
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
     * ��ȡname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AGVName }
     *     
     */
    public AGVName getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AGVName }
     *     
     */
    public void setName(AGVName value) {
        this.name = value;
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
     * ��ȡpositionAngle���Ե�ֵ��
     * 
     */
    public float getPositionAngle() {
        return positionAngle;
    }

    /**
     * ����positionAngle���Ե�ֵ��
     * 
     */
    public void setPositionAngle(float value) {
        this.positionAngle = value;
    }

    /**
     * ��ȡpositionX���Ե�ֵ��
     * 
     */
    public float getPositionX() {
        return positionX;
    }

    /**
     * ����positionX���Ե�ֵ��
     * 
     */
    public void setPositionX(float value) {
        this.positionX = value;
    }

    /**
     * ��ȡpositionY���Ե�ֵ��
     * 
     */
    public float getPositionY() {
        return positionY;
    }

    /**
     * ����positionY���Ե�ֵ��
     * 
     */
    public void setPositionY(float value) {
        this.positionY = value;
    }

    /**
     * ��ȡstartNode���Ե�ֵ��
     * 
     */
    public int getStartNode() {
        return startNode;
    }

    /**
     * ����startNode���Ե�ֵ��
     * 
     */
    public void setStartNode(int value) {
        this.startNode = value;
    }

    /**
     * ��ȡstepFrom���Ե�ֵ��
     * 
     */
    public int getStepFrom() {
        return stepFrom;
    }

    /**
     * ����stepFrom���Ե�ֵ��
     * 
     */
    public void setStepFrom(int value) {
        this.stepFrom = value;
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
     * ��ȡstepOperation���Ե�ֵ��
     * 
     */
    public int getStepOperation() {
        return stepOperation;
    }

    /**
     * ����stepOperation���Ե�ֵ��
     * 
     */
    public void setStepOperation(int value) {
        this.stepOperation = value;
    }

    /**
     * ��ȡstepTo���Ե�ֵ��
     * 
     */
    public int getStepTo() {
        return stepTo;
    }

    /**
     * ����stepTo���Ե�ֵ��
     * 
     */
    public void setStepTo(int value) {
        this.stepTo = value;
    }

    /**
     * ��ȡtagLog���Ե�ֵ��
     * 
     */
    public int getTagLog() {
        return tagLog;
    }

    /**
     * ����tagLog���Ե�ֵ��
     * 
     */
    public void setTagLog(int value) {
        this.tagLog = value;
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

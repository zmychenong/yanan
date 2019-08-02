
package io.renren.common.agvs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>IOCardData complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="IOCardData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="IOList" type="{http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service}ArrayOfIOShowData"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PortCount" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="bShow" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IOCardData", namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", propOrder = {
    "height",
    "id",
    "ioList",
    "name",
    "portCount",
    "type",
    "value",
    "width",
    "bShow"
})
public class IOCardData {

    @XmlElement(name = "Height")
    @XmlSchemaType(name = "unsignedShort")
    protected int height;
    @XmlElement(name = "ID")
    @XmlSchemaType(name = "unsignedShort")
    protected int id;
    @XmlElement(name = "IOList", required = true, nillable = true)
    protected ArrayOfIOShowData ioList;
    @XmlElement(name = "Name", required = true, nillable = true)
    protected String name;
    @XmlElement(name = "PortCount")
    @XmlSchemaType(name = "unsignedShort")
    protected int portCount;
    @XmlElement(name = "Type")
    @XmlSchemaType(name = "unsignedShort")
    protected int type;
    @XmlElement(name = "Value")
    @XmlSchemaType(name = "unsignedShort")
    protected int value;
    @XmlElement(name = "Width")
    @XmlSchemaType(name = "unsignedShort")
    protected int width;
    protected boolean bShow;

    /**
     * ��ȡheight���Ե�ֵ��
     * 
     */
    public int getHeight() {
        return height;
    }

    /**
     * ����height���Ե�ֵ��
     * 
     */
    public void setHeight(int value) {
        this.height = value;
    }

    /**
     * ��ȡid���Ե�ֵ��
     * 
     */
    public int getID() {
        return id;
    }

    /**
     * ����id���Ե�ֵ��
     * 
     */
    public void setID(int value) {
        this.id = value;
    }

    /**
     * ��ȡioList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIOShowData }
     *     
     */
    public ArrayOfIOShowData getIOList() {
        return ioList;
    }

    /**
     * ����ioList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIOShowData }
     *     
     */
    public void setIOList(ArrayOfIOShowData value) {
        this.ioList = value;
    }

    /**
     * ��ȡname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * ��ȡportCount���Ե�ֵ��
     * 
     */
    public int getPortCount() {
        return portCount;
    }

    /**
     * ����portCount���Ե�ֵ��
     * 
     */
    public void setPortCount(int value) {
        this.portCount = value;
    }

    /**
     * ��ȡtype���Ե�ֵ��
     * 
     */
    public int getType() {
        return type;
    }

    /**
     * ����type���Ե�ֵ��
     * 
     */
    public void setType(int value) {
        this.type = value;
    }

    /**
     * ��ȡvalue���Ե�ֵ��
     * 
     */
    public int getValue() {
        return value;
    }

    /**
     * ����value���Ե�ֵ��
     * 
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * ��ȡwidth���Ե�ֵ��
     * 
     */
    public int getWidth() {
        return width;
    }

    /**
     * ����width���Ե�ֵ��
     * 
     */
    public void setWidth(int value) {
        this.width = value;
    }

    /**
     * ��ȡbShow���Ե�ֵ��
     * 
     */
    public boolean isBShow() {
        return bShow;
    }

    /**
     * ����bShow���Ե�ֵ��
     * 
     */
    public void setBShow(boolean value) {
        this.bShow = value;
    }

}

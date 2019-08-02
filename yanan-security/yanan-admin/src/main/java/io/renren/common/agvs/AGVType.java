
package io.renren.common.agvs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AGVType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AGVType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CoordinateX" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="CoordinateY" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AGVType", namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", propOrder = {
    "coordinateX",
    "coordinateY",
    "length",
    "type",
    "width"
})
public class AGVType {

    @XmlElement(name = "CoordinateX")
    protected float coordinateX;
    @XmlElement(name = "CoordinateY")
    protected float coordinateY;
    @XmlElement(name = "Length")
    protected float length;
    @XmlElement(name = "Type")
    @XmlSchemaType(name = "unsignedShort")
    protected int type;
    @XmlElement(name = "Width")
    protected float width;

    /**
     * ��ȡcoordinateX���Ե�ֵ��
     * 
     */
    public float getCoordinateX() {
        return coordinateX;
    }

    /**
     * ����coordinateX���Ե�ֵ��
     * 
     */
    public void setCoordinateX(float value) {
        this.coordinateX = value;
    }

    /**
     * ��ȡcoordinateY���Ե�ֵ��
     * 
     */
    public float getCoordinateY() {
        return coordinateY;
    }

    /**
     * ����coordinateY���Ե�ֵ��
     * 
     */
    public void setCoordinateY(float value) {
        this.coordinateY = value;
    }

    /**
     * ��ȡlength���Ե�ֵ��
     * 
     */
    public float getLength() {
        return length;
    }

    /**
     * ����length���Ե�ֵ��
     * 
     */
    public void setLength(float value) {
        this.length = value;
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
     * ��ȡwidth���Ե�ֵ��
     * 
     */
    public float getWidth() {
        return width;
    }

    /**
     * ����width���Ե�ֵ��
     * 
     */
    public void setWidth(float value) {
        this.width = value;
    }

}


package io.renren.common.agvs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PathDirectionMessage complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="PathDirectionMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Direction" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="EndNode" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="PathID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="StartNode" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PathDirectionMessage", namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", propOrder = {
    "direction",
    "endNode",
    "pathID",
    "startNode"
})
public class PathDirectionMessage {

    @XmlElement(name = "Direction")
    @XmlSchemaType(name = "unsignedShort")
    protected int direction;
    @XmlElement(name = "EndNode")
    @XmlSchemaType(name = "unsignedShort")
    protected int endNode;
    @XmlElement(name = "PathID")
    @XmlSchemaType(name = "unsignedShort")
    protected int pathID;
    @XmlElement(name = "StartNode")
    @XmlSchemaType(name = "unsignedShort")
    protected int startNode;

    /**
     * ��ȡdirection���Ե�ֵ��
     * 
     */
    public int getDirection() {
        return direction;
    }

    /**
     * ����direction���Ե�ֵ��
     * 
     */
    public void setDirection(int value) {
        this.direction = value;
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
     * ��ȡpathID���Ե�ֵ��
     * 
     */
    public int getPathID() {
        return pathID;
    }

    /**
     * ����pathID���Ե�ֵ��
     * 
     */
    public void setPathID(int value) {
        this.pathID = value;
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

}

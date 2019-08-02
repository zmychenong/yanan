
package io.renren.common.agvs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>IOSwitchData complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="IOSwitchData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IOID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="Node" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="RalationNode" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IOSwitchData", namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", propOrder = {
    "ioid",
    "node",
    "ralationNode",
    "value"
})
public class IOSwitchData {

    @XmlElement(name = "IOID")
    @XmlSchemaType(name = "unsignedShort")
    protected int ioid;
    @XmlElement(name = "Node")
    @XmlSchemaType(name = "unsignedShort")
    protected int node;
    @XmlElement(name = "RalationNode")
    @XmlSchemaType(name = "unsignedShort")
    protected int ralationNode;
    @XmlElement(name = "Value")
    protected boolean value;

    /**
     * ��ȡioid���Ե�ֵ��
     * 
     */
    public int getIOID() {
        return ioid;
    }

    /**
     * ����ioid���Ե�ֵ��
     * 
     */
    public void setIOID(int value) {
        this.ioid = value;
    }

    /**
     * ��ȡnode���Ե�ֵ��
     * 
     */
    public int getNode() {
        return node;
    }

    /**
     * ����node���Ե�ֵ��
     * 
     */
    public void setNode(int value) {
        this.node = value;
    }

    /**
     * ��ȡralationNode���Ե�ֵ��
     * 
     */
    public int getRalationNode() {
        return ralationNode;
    }

    /**
     * ����ralationNode���Ե�ֵ��
     * 
     */
    public void setRalationNode(int value) {
        this.ralationNode = value;
    }

    /**
     * ��ȡvalue���Ե�ֵ��
     * 
     */
    public boolean isValue() {
        return value;
    }

    /**
     * ����value���Ե�ֵ��
     * 
     */
    public void setValue(boolean value) {
        this.value = value;
    }

}


package io.renren.common.agvs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * <p>ClusterMessage complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ClusterMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClusterID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="ClusterStyle" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="NodeList" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfunsignedShort"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterMessage", namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", propOrder = {
    "clusterID",
    "clusterStyle",
    "nodeList"
})
@ApiModel(value="ClusterMessage",description="交管信息类")
public class ClusterMessage {

    @XmlElement(name = "ClusterID")
    @XmlSchemaType(name = "unsignedShort")
    @ApiModelProperty
    protected int clusterID;
    @XmlElement(name = "ClusterStyle")
    @XmlSchemaType(name = "unsignedShort")
    @ApiModelProperty
    protected int clusterStyle;
    @XmlElement(name = "NodeList", required = true, nillable = true)
    @ApiModelProperty
    protected ArrayOfunsignedShort nodeList;

    /**
     * ��ȡclusterID���Ե�ֵ��
     * 
     */
    public int getClusterID() {
        return clusterID;
    }

    /**
     * ����clusterID���Ե�ֵ��
     * 
     */
    public void setClusterID(int value) {
        this.clusterID = value;
    }

    /**
     * ��ȡclusterStyle���Ե�ֵ��
     * 
     */
    public int getClusterStyle() {
        return clusterStyle;
    }

    /**
     * ����clusterStyle���Ե�ֵ��
     * 
     */
    public void setClusterStyle(int value) {
        this.clusterStyle = value;
    }

    /**
     * ��ȡnodeList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfunsignedShort }
     *     
     */
    public ArrayOfunsignedShort getNodeList() {
        return nodeList;
    }

    /**
     * ����nodeList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfunsignedShort }
     *     
     */
    public void setNodeList(ArrayOfunsignedShort value) {
        this.nodeList = value;
    }

}

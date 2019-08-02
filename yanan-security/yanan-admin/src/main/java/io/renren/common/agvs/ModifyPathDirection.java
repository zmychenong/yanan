
package io.renren.common.agvs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service}WorkAreaName" minOccurs="0"/>
 *         &lt;element name="PathMessage" type="{http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service}PathDirectionMessage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "pathMessage"
})
@XmlRootElement(name = "ModifyPathDirection")
public class ModifyPathDirection {

    @XmlElementRef(name = "Name", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<WorkAreaName> name;
    @XmlElementRef(name = "PathMessage", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<PathDirectionMessage> pathMessage;

    /**
     * ��ȡname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}
     *     
     */
    public JAXBElement<WorkAreaName> getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WorkAreaName }{@code >}
     *     
     */
    public void setName(JAXBElement<WorkAreaName> value) {
        this.name = value;
    }

    /**
     * ��ȡpathMessage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PathDirectionMessage }{@code >}
     *     
     */
    public JAXBElement<PathDirectionMessage> getPathMessage() {
        return pathMessage;
    }

    /**
     * ����pathMessage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PathDirectionMessage }{@code >}
     *     
     */
    public void setPathMessage(JAXBElement<PathDirectionMessage> value) {
        this.pathMessage = value;
    }

}

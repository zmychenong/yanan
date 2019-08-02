
package io.renren.common.agvs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfPathDirectionMessage complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPathDirectionMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PathDirectionMessage" type="{http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service}PathDirectionMessage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPathDirectionMessage", namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", propOrder = {
    "pathDirectionMessage"
})
public class ArrayOfPathDirectionMessage {

    @XmlElement(name = "PathDirectionMessage", nillable = true)
    protected List<PathDirectionMessage> pathDirectionMessage;

    /**
     * Gets the value of the pathDirectionMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pathDirectionMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPathDirectionMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PathDirectionMessage }
     * 
     * 
     */
    public List<PathDirectionMessage> getPathDirectionMessage() {
        if (pathDirectionMessage == null) {
            pathDirectionMessage = new ArrayList<PathDirectionMessage>();
        }
        return this.pathDirectionMessage;
    }

}

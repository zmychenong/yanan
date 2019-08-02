
package io.renren.common.agvs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfAGVOrderMessage complex type�� Java �ࡣ
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAGVOrderMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AGVOrderMessage" type="{http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service}AGVOrderMessage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAGVOrderMessage", namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", propOrder = {
    "agvOrderMessage"
})
public class ArrayOfAGVOrderMessage {

    @XmlElement(name = "AGVOrderMessage", nillable = true)
    protected List<AGVOrderMessage> agvOrderMessage;

    /**
     * Gets the value of the agvOrderMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agvOrderMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAGVOrderMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AGVOrderMessage }
     * 
     * 
     */
    public List<AGVOrderMessage> getAGVOrderMessage() {
        if (agvOrderMessage == null) {
            agvOrderMessage = new ArrayList<AGVOrderMessage>();
        }
        return this.agvOrderMessage;
    }

}

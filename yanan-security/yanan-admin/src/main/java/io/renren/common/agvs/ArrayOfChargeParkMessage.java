
package io.renren.common.agvs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfChargeParkMessage complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ArrayOfChargeParkMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChargeParkMessage" type="{http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service}ChargeParkMessage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfChargeParkMessage", namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", propOrder = {
    "chargeParkMessage"
})
public class ArrayOfChargeParkMessage {

    @XmlElement(name = "ChargeParkMessage", nillable = true)
    protected List<ChargeParkMessage> chargeParkMessage;

    /**
     * Gets the value of the chargeParkMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chargeParkMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargeParkMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargeParkMessage }
     * 
     * 
     */
    public List<ChargeParkMessage> getChargeParkMessage() {
        if (chargeParkMessage == null) {
            chargeParkMessage = new ArrayList<ChargeParkMessage>();
        }
        return this.chargeParkMessage;
    }

}

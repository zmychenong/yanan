
package io.renren.common.agvs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfFactory complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFactory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Factory" type="{http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service}Factory" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFactory", namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", propOrder = {
    "factory"
})
public class ArrayOfFactory {

    @XmlElement(name = "Factory", nillable = true)
    protected List<Factory> factory;

    /**
     * Gets the value of the factory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the factory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFactory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Factory }
     * 
     * 
     */
    public List<Factory> getFactory() {
        if (factory == null) {
            factory = new ArrayList<Factory>();
        }
        return this.factory;
    }

}

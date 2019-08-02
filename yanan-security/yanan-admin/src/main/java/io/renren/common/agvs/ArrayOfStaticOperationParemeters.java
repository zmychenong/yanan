
package io.renren.common.agvs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfStaticOperationParemeters complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStaticOperationParemeters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StaticOperationParemeters" type="{http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service}StaticOperationParemeters" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStaticOperationParemeters", namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", propOrder = {
    "staticOperationParemeters"
})
public class ArrayOfStaticOperationParemeters {

    @XmlElement(name = "StaticOperationParemeters", nillable = true)
    protected List<StaticOperationParemeters> staticOperationParemeters;

    /**
     * Gets the value of the staticOperationParemeters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the staticOperationParemeters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStaticOperationParemeters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StaticOperationParemeters }
     * 
     * 
     */
    public List<StaticOperationParemeters> getStaticOperationParemeters() {
        if (staticOperationParemeters == null) {
            staticOperationParemeters = new ArrayList<StaticOperationParemeters>();
        }
        return this.staticOperationParemeters;
    }

}

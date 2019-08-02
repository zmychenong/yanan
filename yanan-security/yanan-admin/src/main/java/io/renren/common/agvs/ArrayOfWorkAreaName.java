
package io.renren.common.agvs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfWorkAreaName complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWorkAreaName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WorkAreaName" type="{http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service}WorkAreaName" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWorkAreaName", namespace = "http://schemas.datacontract.org/2004/07/AGVServer.AGVS.Service", propOrder = {
    "workAreaName"
})
public class ArrayOfWorkAreaName {

    @XmlElement(name = "WorkAreaName", nillable = true)
    protected List<WorkAreaName> workAreaName;

    /**
     * Gets the value of the workAreaName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workAreaName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkAreaName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkAreaName }
     * 
     * 
     */
    public List<WorkAreaName> getWorkAreaName() {
        if (workAreaName == null) {
            workAreaName = new ArrayList<WorkAreaName>();
        }
        return this.workAreaName;
    }

}

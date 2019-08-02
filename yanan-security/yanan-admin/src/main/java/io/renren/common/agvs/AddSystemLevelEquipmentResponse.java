
package io.renren.common.agvs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="AddSystemLevelEquipmentResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "addSystemLevelEquipmentResult"
})
@XmlRootElement(name = "AddSystemLevelEquipmentResponse")
public class AddSystemLevelEquipmentResponse {

    @XmlElement(name = "AddSystemLevelEquipmentResult")
    protected Boolean addSystemLevelEquipmentResult;

    /**
     * ��ȡaddSystemLevelEquipmentResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddSystemLevelEquipmentResult() {
        return addSystemLevelEquipmentResult;
    }

    /**
     * ����addSystemLevelEquipmentResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddSystemLevelEquipmentResult(Boolean value) {
        this.addSystemLevelEquipmentResult = value;
    }

}

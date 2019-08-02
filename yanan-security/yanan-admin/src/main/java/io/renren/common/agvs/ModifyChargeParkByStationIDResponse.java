
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
 *         &lt;element name="ModifyChargeParkByStationIDResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "modifyChargeParkByStationIDResult"
})
@XmlRootElement(name = "ModifyChargeParkByStationIDResponse")
public class ModifyChargeParkByStationIDResponse {

    @XmlElement(name = "ModifyChargeParkByStationIDResult")
    protected Boolean modifyChargeParkByStationIDResult;

    /**
     * ��ȡmodifyChargeParkByStationIDResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isModifyChargeParkByStationIDResult() {
        return modifyChargeParkByStationIDResult;
    }

    /**
     * ����modifyChargeParkByStationIDResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setModifyChargeParkByStationIDResult(Boolean value) {
        this.modifyChargeParkByStationIDResult = value;
    }

}

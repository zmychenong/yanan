
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
 *         &lt;element name="GetStandardOrderColumnCountResult" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "getStandardOrderColumnCountResult"
})
@XmlRootElement(name = "GetStandardOrderColumnCountResponse")
public class GetStandardOrderColumnCountResponse {

    @XmlElement(name = "GetStandardOrderColumnCountResult")
    protected Integer getStandardOrderColumnCountResult;

    /**
     * ��ȡgetStandardOrderColumnCountResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGetStandardOrderColumnCountResult() {
        return getStandardOrderColumnCountResult;
    }

    /**
     * ����getStandardOrderColumnCountResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGetStandardOrderColumnCountResult(Integer value) {
        this.getStandardOrderColumnCountResult = value;
    }

}

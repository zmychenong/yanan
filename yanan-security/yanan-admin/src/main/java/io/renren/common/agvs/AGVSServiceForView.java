
package io.renren.common.agvs;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AGVS_ServiceForView", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://192.168.0.140:8733/AGVS_ServiceForView/?wsdl")
public class AGVSServiceForView
    extends Service
{

    private final static URL AGVSSERVICEFORVIEW_WSDL_LOCATION;
    private final static WebServiceException AGVSSERVICEFORVIEW_EXCEPTION;
    private final static QName AGVSSERVICEFORVIEW_QNAME = new QName("http://tempuri.org/", "AGVS_ServiceForView");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.0.140:8733/AGVS_ServiceForView/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        AGVSSERVICEFORVIEW_WSDL_LOCATION = url;
        AGVSSERVICEFORVIEW_EXCEPTION = e;
    }

    public AGVSServiceForView() {
        super(__getWsdlLocation(), AGVSSERVICEFORVIEW_QNAME);
    }

    public AGVSServiceForView(WebServiceFeature... features) {
        super(__getWsdlLocation(), AGVSSERVICEFORVIEW_QNAME, features);
    }

    public AGVSServiceForView(URL wsdlLocation) {
        super(wsdlLocation, AGVSSERVICEFORVIEW_QNAME);
    }

    public AGVSServiceForView(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, AGVSSERVICEFORVIEW_QNAME, features);
    }

    public AGVSServiceForView(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AGVSServiceForView(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AGVSIServiceForView
     */
    @WebEndpoint(name = "BasicHttpBinding_AGVS_IServiceForView")
    public AGVSIServiceForView getBasicHttpBindingAGVSIServiceForView() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_AGVS_IServiceForView"), AGVSIServiceForView.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AGVSIServiceForView
     */
    @WebEndpoint(name = "BasicHttpBinding_AGVS_IServiceForView")
    public AGVSIServiceForView getBasicHttpBindingAGVSIServiceForView(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_AGVS_IServiceForView"), AGVSIServiceForView.class, features);
    }

    private static URL __getWsdlLocation() {
        if (AGVSSERVICEFORVIEW_EXCEPTION!= null) {
            throw AGVSSERVICEFORVIEW_EXCEPTION;
        }
        return AGVSSERVICEFORVIEW_WSDL_LOCATION;
    }

}

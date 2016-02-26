
package com.mastering.jaxws.client;

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
@WebServiceClient(name = "StockServiceEndpointService", targetNamespace = "http://book.stock.jaxws.mastering.com/", wsdlLocation = "http://127.0.0.1:8089/1/stockservice?wsdl")
public class StockServiceEndpointService
    extends Service
{

    private final static URL STOCKSERVICEENDPOINTSERVICE_WSDL_LOCATION;
    private final static WebServiceException STOCKSERVICEENDPOINTSERVICE_EXCEPTION;
    private final static QName STOCKSERVICEENDPOINTSERVICE_QNAME = new QName("http://book.stock.jaxws.mastering.com/", "StockServiceEndpointService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://127.0.0.1:8089/1/stockservice?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        STOCKSERVICEENDPOINTSERVICE_WSDL_LOCATION = url;
        STOCKSERVICEENDPOINTSERVICE_EXCEPTION = e;
    }

    public StockServiceEndpointService() {
        super(__getWsdlLocation(), STOCKSERVICEENDPOINTSERVICE_QNAME);
    }

    public StockServiceEndpointService(WebServiceFeature... features) {
        super(__getWsdlLocation(), STOCKSERVICEENDPOINTSERVICE_QNAME, features);
    }

    public StockServiceEndpointService(URL wsdlLocation) {
        super(wsdlLocation, STOCKSERVICEENDPOINTSERVICE_QNAME);
    }

    public StockServiceEndpointService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, STOCKSERVICEENDPOINTSERVICE_QNAME, features);
    }

    public StockServiceEndpointService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StockServiceEndpointService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns StockServiceEndpoint
     */
    @WebEndpoint(name = "StockServiceEndpointPort")
    public StockServiceEndpoint getStockServiceEndpointPort() {
        return super.getPort(new QName("http://book.stock.jaxws.mastering.com/", "StockServiceEndpointPort"), StockServiceEndpoint.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns StockServiceEndpoint
     */
    @WebEndpoint(name = "StockServiceEndpointPort")
    public StockServiceEndpoint getStockServiceEndpointPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://book.stock.jaxws.mastering.com/", "StockServiceEndpointPort"), StockServiceEndpoint.class, features);
    }

    private static URL __getWsdlLocation() {
        if (STOCKSERVICEENDPOINTSERVICE_EXCEPTION!= null) {
            throw STOCKSERVICEENDPOINTSERVICE_EXCEPTION;
        }
        return STOCKSERVICEENDPOINTSERVICE_WSDL_LOCATION;
    }

}

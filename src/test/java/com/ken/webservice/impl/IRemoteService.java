
package com.ken.webservice.impl;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.ken.webservice.ObjectFactory;
import com.ken.webservice.Order;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IRemoteService", targetNamespace = "http://webservice.ken.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IRemoteService {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addOrder", targetNamespace = "http://webservice.ken.com/", className = "com.ken.webservice.AddOrder")
    @ResponseWrapper(localName = "addOrderResponse", targetNamespace = "http://webservice.ken.com/", className = "com.ken.webservice.AddOrderResponse")
    public String addOrder(
        @WebParam(name = "arg0", targetNamespace = "")
        List<Order> arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "showRemoteMessage", targetNamespace = "http://webservice.ken.com/", className = "com.ken.webservice.ShowRemoteMessage")
    @ResponseWrapper(localName = "showRemoteMessageResponse", targetNamespace = "http://webservice.ken.com/", className = "com.ken.webservice.ShowRemoteMessageResponse")
    public String showRemoteMessage(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}


package com.ken.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ken.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddOrderResponse_QNAME = new QName("http://webservice.ken.com/", "addOrderResponse");
    private final static QName _ShowRemoteMessageResponse_QNAME = new QName("http://webservice.ken.com/", "showRemoteMessageResponse");
    private final static QName _AddOrder_QNAME = new QName("http://webservice.ken.com/", "addOrder");
    private final static QName _ShowRemoteMessage_QNAME = new QName("http://webservice.ken.com/", "showRemoteMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ken.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddOrder }
     * 
     */
    public AddOrder createAddOrder() {
        return new AddOrder();
    }

    /**
     * Create an instance of {@link ShowRemoteMessage }
     * 
     */
    public ShowRemoteMessage createShowRemoteMessage() {
        return new ShowRemoteMessage();
    }

    /**
     * Create an instance of {@link AddOrderResponse }
     * 
     */
    public AddOrderResponse createAddOrderResponse() {
        return new AddOrderResponse();
    }

    /**
     * Create an instance of {@link ShowRemoteMessageResponse }
     * 
     */
    public ShowRemoteMessageResponse createShowRemoteMessageResponse() {
        return new ShowRemoteMessageResponse();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.ken.com/", name = "addOrderResponse")
    public JAXBElement<AddOrderResponse> createAddOrderResponse(AddOrderResponse value) {
        return new JAXBElement<AddOrderResponse>(_AddOrderResponse_QNAME, AddOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowRemoteMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.ken.com/", name = "showRemoteMessageResponse")
    public JAXBElement<ShowRemoteMessageResponse> createShowRemoteMessageResponse(ShowRemoteMessageResponse value) {
        return new JAXBElement<ShowRemoteMessageResponse>(_ShowRemoteMessageResponse_QNAME, ShowRemoteMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.ken.com/", name = "addOrder")
    public JAXBElement<AddOrder> createAddOrder(AddOrder value) {
        return new JAXBElement<AddOrder>(_AddOrder_QNAME, AddOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowRemoteMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.ken.com/", name = "showRemoteMessage")
    public JAXBElement<ShowRemoteMessage> createShowRemoteMessage(ShowRemoteMessage value) {
        return new JAXBElement<ShowRemoteMessage>(_ShowRemoteMessage_QNAME, ShowRemoteMessage.class, null, value);
    }

}

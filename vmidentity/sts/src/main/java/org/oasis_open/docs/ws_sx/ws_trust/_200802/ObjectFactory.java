
package org.oasis_open.docs.ws_sx.ws_trust._200802;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.oasis_open.docs.ws_sx.ws_trust._200802 package. 
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

    private final static QName _ActAs_QNAME = new QName("http://docs.oasis-open.org/ws-sx/ws-trust/200802", "ActAs");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.oasis_open.docs.ws_sx.ws_trust._200802
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActAsType }
     * 
     */
    public ActAsType createActAsType() {
        return new ActAsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActAsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ws-sx/ws-trust/200802", name = "ActAs")
    public JAXBElement<ActAsType> createActAs(ActAsType value) {
        return new JAXBElement<ActAsType>(_ActAs_QNAME, ActAsType.class, null, value);
    }

}

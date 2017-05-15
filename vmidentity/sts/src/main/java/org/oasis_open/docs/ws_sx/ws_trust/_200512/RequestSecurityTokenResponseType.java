
package org.oasis_open.docs.ws_sx.ws_trust._200512;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.rsa.names._2009._12.std_ext.ws_trust1_4.advice.AdviceSetType;


/**
 * 
 *         Actual content model is non-deterministic, hence wildcard. The following shows intended content model:
 * 
 *         <xs:element ref='wst:TokenType' minOccurs='0' />
 *         <xs:element ref='wst:RequestType' />
 *         <xs:element ref='wst:RequestedSecurityToken'  minOccurs='0' />
 *         <xs:element ref='wst:RequestedAttachedReference' minOccurs='0' />
 *         <xs:element ref='wst:RequestedUnattachedReference' minOccurs='0' />
 *         <xs:element ref='wst:RequestedProofToken' minOccurs='0' />
 *         <xs:element ref='wst:Entropy' minOccurs='0' />
 *         <xs:element ref='wst:Lifetime' minOccurs='0' />
 *         <xs:element ref='wst:Status' minOccurs='0' />
 *         <xs:element ref='wst:AllowPostdating' minOccurs='0' />
 *         <xs:element ref='wst:Renewing' minOccurs='0' />
 *         <xs:element ref='wst:OnBehalfOf' minOccurs='0' />
 *         <xs:element ref='wst:Issuer' minOccurs='0' />
 *         <xs:element ref='wst:AuthenticationType' minOccurs='0' />
 *         <xs:element ref='wst:Authenticator' minOccurs='0' />
 *         <xs:element ref='wst:KeyType' minOccurs='0' />
 *         <xs:element ref='wst:KeySize' minOccurs='0' />
 *         <xs:element ref='wst:SignatureAlgorithm' minOccurs='0' />
 *         <xs:element ref='wst:Encryption' minOccurs='0' />
 *         <xs:element ref='wst:EncryptionAlgorithm' minOccurs='0' />
 *         <xs:element ref='wst:CanonicalizationAlgorithm' minOccurs='0' />
 *         <xs:element ref='wst:ProofEncryption' minOccurs='0' />
 *         <xs:element ref='wst:UseKey' minOccurs='0' />
 *         <xs:element ref='wst:SignWith' minOccurs='0' />
 *         <xs:element ref='wst:EncryptWith' minOccurs='0' />
 *         <xs:element ref='wst:DelegateTo' minOccurs='0' />
 *         <xs:element ref='wst:Forwardable' minOccurs='0' />
 *         <xs:element ref='wst:Delegatable' minOccurs='0' />
 *         <xs:any namespace='##other' processContents='lax' minOccurs='0' maxOccurs='unbounded' />
 * 
 *       
 * 
 * <p>Java class for RequestSecurityTokenResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestSecurityTokenResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;choice minOccurs="0">
 *               &lt;sequence>
 *                 &lt;element ref="{http://docs.oasis-open.org/ws-sx/ws-trust/200512}RequestedSecurityToken"/>
 *                 &lt;element ref="{http://docs.oasis-open.org/ws-sx/ws-trust/200512}Lifetime"/>
 *               &lt;/sequence>
 *               &lt;sequence>
 *                 &lt;element ref="{http://docs.oasis-open.org/ws-sx/ws-trust/200512}Status"/>
 *               &lt;/sequence>
 *             &lt;/choice>
 *             &lt;element ref="{http://docs.oasis-open.org/ws-sx/ws-trust/200512}TokenType"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element ref="{http://docs.oasis-open.org/ws-sx/ws-trust/200512}BinaryExchange" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ws-sx/ws-trust/200512}Renewing" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ws-sx/ws-trust/200512}KeyType" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ws-sx/ws-trust/200512}Delegatable" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ws-sx/ws-trust/200512}SignatureAlgorithm" minOccurs="0"/>
 *         &lt;element ref="{http://www.rsa.com/names/2009/12/std-ext/WS-Trust1.4/advice}AdviceSet" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Context" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestSecurityTokenResponseType", propOrder = {
    "requestedSecurityToken",
    "lifetime",
    "status",
    "tokenType",
    "binaryExchange",
    "renewing",
    "keyType",
    "delegatable",
    "signatureAlgorithm",
    "adviceSet"
})
public class RequestSecurityTokenResponseType {

    @XmlElement(name = "RequestedSecurityToken")
    protected RequestedSecurityTokenType requestedSecurityToken;
    @XmlElement(name = "Lifetime")
    protected LifetimeType lifetime;
    @XmlElement(name = "Status")
    protected StatusType status;
    @XmlElement(name = "TokenType")
    @XmlSchemaType(name = "anyURI")
    protected String tokenType;
    @XmlElement(name = "BinaryExchange")
    protected BinaryExchangeType binaryExchange;
    @XmlElement(name = "Renewing")
    protected RenewingType renewing;
    @XmlElement(name = "KeyType")
    protected String keyType;
    @XmlElement(name = "Delegatable")
    protected Boolean delegatable;
    @XmlElement(name = "SignatureAlgorithm")
    @XmlSchemaType(name = "anyURI")
    protected String signatureAlgorithm;
    @XmlElement(name = "AdviceSet", namespace = "http://www.rsa.com/names/2009/12/std-ext/WS-Trust1.4/advice")
    protected AdviceSetType adviceSet;
    @XmlAttribute(name = "Context")
    @XmlSchemaType(name = "anyURI")
    protected String context;

    /**
     * Gets the value of the requestedSecurityToken property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedSecurityTokenType }
     *     
     */
    public RequestedSecurityTokenType getRequestedSecurityToken() {
        return requestedSecurityToken;
    }

    /**
     * Sets the value of the requestedSecurityToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedSecurityTokenType }
     *     
     */
    public void setRequestedSecurityToken(RequestedSecurityTokenType value) {
        this.requestedSecurityToken = value;
    }

    /**
     * Gets the value of the lifetime property.
     * 
     * @return
     *     possible object is
     *     {@link LifetimeType }
     *     
     */
    public LifetimeType getLifetime() {
        return lifetime;
    }

    /**
     * Sets the value of the lifetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link LifetimeType }
     *     
     */
    public void setLifetime(LifetimeType value) {
        this.lifetime = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the tokenType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenType() {
        return tokenType;
    }

    /**
     * Sets the value of the tokenType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenType(String value) {
        this.tokenType = value;
    }

    /**
     * Gets the value of the binaryExchange property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryExchangeType }
     *     
     */
    public BinaryExchangeType getBinaryExchange() {
        return binaryExchange;
    }

    /**
     * Sets the value of the binaryExchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryExchangeType }
     *     
     */
    public void setBinaryExchange(BinaryExchangeType value) {
        this.binaryExchange = value;
    }

    /**
     * Gets the value of the renewing property.
     * 
     * @return
     *     possible object is
     *     {@link RenewingType }
     *     
     */
    public RenewingType getRenewing() {
        return renewing;
    }

    /**
     * Sets the value of the renewing property.
     * 
     * @param value
     *     allowed object is
     *     {@link RenewingType }
     *     
     */
    public void setRenewing(RenewingType value) {
        this.renewing = value;
    }

    /**
     * Gets the value of the keyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyType() {
        return keyType;
    }

    /**
     * Sets the value of the keyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyType(String value) {
        this.keyType = value;
    }

    /**
     * Gets the value of the delegatable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelegatable() {
        return delegatable;
    }

    /**
     * Sets the value of the delegatable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelegatable(Boolean value) {
        this.delegatable = value;
    }

    /**
     * Gets the value of the signatureAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    /**
     * Sets the value of the signatureAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureAlgorithm(String value) {
        this.signatureAlgorithm = value;
    }

    /**
     * Gets the value of the adviceSet property.
     * 
     * @return
     *     possible object is
     *     {@link AdviceSetType }
     *     
     */
    public AdviceSetType getAdviceSet() {
        return adviceSet;
    }

    /**
     * Sets the value of the adviceSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdviceSetType }
     *     
     */
    public void setAdviceSet(AdviceSetType value) {
        this.adviceSet = value;
    }

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContext(String value) {
        this.context = value;
    }

}

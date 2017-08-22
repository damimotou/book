
package ua.mega.crm;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CustomerService", targetNamespace = "http://www.mega.ua/crm")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CustomerService {


    /**
     * 
     * @param getCustomerByIdRequest
     * @return
     *     returns ua.mega.crm.GetCustomerByIdResponse
     */
    @WebMethod
    @WebResult(name = "getCustomerByIdResponse", targetNamespace = "http://www.mega.ua/crm", partName = "getCustomerByIdResponse")
    public GetCustomerByIdResponse getCustomerById(
        @WebParam(name = "getCustomerByIdRequest", targetNamespace = "http://www.mega.ua/crm", partName = "getCustomerByIdRequest")
        GetCustomerByIdRequest getCustomerByIdRequest);

}
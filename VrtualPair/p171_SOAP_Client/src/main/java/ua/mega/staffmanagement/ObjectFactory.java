
package ua.mega.staffmanagement;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ua.mega.staffmanagement package. 
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

    private final static QName _Employee_QNAME = new QName("http://staffmanagement.mega.ua/", "employee");
    private final static QName _RegisterEmployeeResponse_QNAME = new QName("http://staffmanagement.mega.ua/", "registerEmployeeResponse");
    private final static QName _SearchBySurname_QNAME = new QName("http://staffmanagement.mega.ua/", "searchBySurname");
    private final static QName _EmployeeNotFoundException_QNAME = new QName("http://staffmanagement.mega.ua/", "EmployeeNotFoundException");
    private final static QName _GetAllEmployees_QNAME = new QName("http://staffmanagement.mega.ua/", "getAllEmployees");
    private final static QName _RegisterEmployee_QNAME = new QName("http://staffmanagement.mega.ua/", "registerEmployee");
    private final static QName _SearchBySurnameResponse_QNAME = new QName("http://staffmanagement.mega.ua/", "searchBySurnameResponse");
    private final static QName _DeleteEmployeeById_QNAME = new QName("http://staffmanagement.mega.ua/", "deleteEmployeeById");
    private final static QName _GetEmployeeById_QNAME = new QName("http://staffmanagement.mega.ua/", "getEmployeeById");
    private final static QName _GetEmployeeByIdResponse_QNAME = new QName("http://staffmanagement.mega.ua/", "getEmployeeByIdResponse");
    private final static QName _DeleteEmployeeByIdResponse_QNAME = new QName("http://staffmanagement.mega.ua/", "deleteEmployeeByIdResponse");
    private final static QName _GetAllEmployeesResponse_QNAME = new QName("http://staffmanagement.mega.ua/", "getAllEmployeesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ua.mega.staffmanagement
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteEmployeeById }
     * 
     */
    public DeleteEmployeeById createDeleteEmployeeById() {
        return new DeleteEmployeeById();
    }

    /**
     * Create an instance of {@link GetEmployeeById }
     * 
     */
    public GetEmployeeById createGetEmployeeById() {
        return new GetEmployeeById();
    }

    /**
     * Create an instance of {@link GetEmployeeByIdResponse }
     * 
     */
    public GetEmployeeByIdResponse createGetEmployeeByIdResponse() {
        return new GetEmployeeByIdResponse();
    }

    /**
     * Create an instance of {@link DeleteEmployeeByIdResponse }
     * 
     */
    public DeleteEmployeeByIdResponse createDeleteEmployeeByIdResponse() {
        return new DeleteEmployeeByIdResponse();
    }

    /**
     * Create an instance of {@link GetAllEmployeesResponse }
     * 
     */
    public GetAllEmployeesResponse createGetAllEmployeesResponse() {
        return new GetAllEmployeesResponse();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link RegisterEmployeeResponse }
     * 
     */
    public RegisterEmployeeResponse createRegisterEmployeeResponse() {
        return new RegisterEmployeeResponse();
    }

    /**
     * Create an instance of {@link SearchBySurname }
     * 
     */
    public SearchBySurname createSearchBySurname() {
        return new SearchBySurname();
    }

    /**
     * Create an instance of {@link EmployeeNotFoundException }
     * 
     */
    public EmployeeNotFoundException createEmployeeNotFoundException() {
        return new EmployeeNotFoundException();
    }

    /**
     * Create an instance of {@link GetAllEmployees }
     * 
     */
    public GetAllEmployees createGetAllEmployees() {
        return new GetAllEmployees();
    }

    /**
     * Create an instance of {@link RegisterEmployee }
     * 
     */
    public RegisterEmployee createRegisterEmployee() {
        return new RegisterEmployee();
    }

    /**
     * Create an instance of {@link SearchBySurnameResponse }
     * 
     */
    public SearchBySurnameResponse createSearchBySurnameResponse() {
        return new SearchBySurnameResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Employee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://staffmanagement.mega.ua/", name = "employee")
    public JAXBElement<Employee> createEmployee(Employee value) {
        return new JAXBElement<Employee>(_Employee_QNAME, Employee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://staffmanagement.mega.ua/", name = "registerEmployeeResponse")
    public JAXBElement<RegisterEmployeeResponse> createRegisterEmployeeResponse(RegisterEmployeeResponse value) {
        return new JAXBElement<RegisterEmployeeResponse>(_RegisterEmployeeResponse_QNAME, RegisterEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBySurname }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://staffmanagement.mega.ua/", name = "searchBySurname")
    public JAXBElement<SearchBySurname> createSearchBySurname(SearchBySurname value) {
        return new JAXBElement<SearchBySurname>(_SearchBySurname_QNAME, SearchBySurname.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://staffmanagement.mega.ua/", name = "EmployeeNotFoundException")
    public JAXBElement<EmployeeNotFoundException> createEmployeeNotFoundException(EmployeeNotFoundException value) {
        return new JAXBElement<EmployeeNotFoundException>(_EmployeeNotFoundException_QNAME, EmployeeNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEmployees }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://staffmanagement.mega.ua/", name = "getAllEmployees")
    public JAXBElement<GetAllEmployees> createGetAllEmployees(GetAllEmployees value) {
        return new JAXBElement<GetAllEmployees>(_GetAllEmployees_QNAME, GetAllEmployees.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://staffmanagement.mega.ua/", name = "registerEmployee")
    public JAXBElement<RegisterEmployee> createRegisterEmployee(RegisterEmployee value) {
        return new JAXBElement<RegisterEmployee>(_RegisterEmployee_QNAME, RegisterEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBySurnameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://staffmanagement.mega.ua/", name = "searchBySurnameResponse")
    public JAXBElement<SearchBySurnameResponse> createSearchBySurnameResponse(SearchBySurnameResponse value) {
        return new JAXBElement<SearchBySurnameResponse>(_SearchBySurnameResponse_QNAME, SearchBySurnameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEmployeeById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://staffmanagement.mega.ua/", name = "deleteEmployeeById")
    public JAXBElement<DeleteEmployeeById> createDeleteEmployeeById(DeleteEmployeeById value) {
        return new JAXBElement<DeleteEmployeeById>(_DeleteEmployeeById_QNAME, DeleteEmployeeById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://staffmanagement.mega.ua/", name = "getEmployeeById")
    public JAXBElement<GetEmployeeById> createGetEmployeeById(GetEmployeeById value) {
        return new JAXBElement<GetEmployeeById>(_GetEmployeeById_QNAME, GetEmployeeById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://staffmanagement.mega.ua/", name = "getEmployeeByIdResponse")
    public JAXBElement<GetEmployeeByIdResponse> createGetEmployeeByIdResponse(GetEmployeeByIdResponse value) {
        return new JAXBElement<GetEmployeeByIdResponse>(_GetEmployeeByIdResponse_QNAME, GetEmployeeByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEmployeeByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://staffmanagement.mega.ua/", name = "deleteEmployeeByIdResponse")
    public JAXBElement<DeleteEmployeeByIdResponse> createDeleteEmployeeByIdResponse(DeleteEmployeeByIdResponse value) {
        return new JAXBElement<DeleteEmployeeByIdResponse>(_DeleteEmployeeByIdResponse_QNAME, DeleteEmployeeByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEmployeesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://staffmanagement.mega.ua/", name = "getAllEmployeesResponse")
    public JAXBElement<GetAllEmployeesResponse> createGetAllEmployeesResponse(GetAllEmployeesResponse value) {
        return new JAXBElement<GetAllEmployeesResponse>(_GetAllEmployeesResponse_QNAME, GetAllEmployeesResponse.class, null, value);
    }

}

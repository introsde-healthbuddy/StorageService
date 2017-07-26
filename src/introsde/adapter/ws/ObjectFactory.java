
package introsde.adapter.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the introsde.adapter.ws package. 
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

    private final static QName _SearchFoodResponse_QNAME = new QName("http://ws.adapter.introsde/", "searchFoodResponse");
    private final static QName _GetFoodResponse_QNAME = new QName("http://ws.adapter.introsde/", "getFoodResponse");
    private final static QName _GetFood_QNAME = new QName("http://ws.adapter.introsde/", "getFood");
    private final static QName _SearchFood_QNAME = new QName("http://ws.adapter.introsde/", "searchFood");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: introsde.adapter.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchFood }
     * 
     */
    public SearchFood createSearchFood() {
        return new SearchFood();
    }

    /**
     * Create an instance of {@link GetFood }
     * 
     */
    public GetFood createGetFood() {
        return new GetFood();
    }

    /**
     * Create an instance of {@link GetFoodResponse }
     * 
     */
    public GetFoodResponse createGetFoodResponse() {
        return new GetFoodResponse();
    }

    /**
     * Create an instance of {@link SearchFoodResponse }
     * 
     */
    public SearchFoodResponse createSearchFoodResponse() {
        return new SearchFoodResponse();
    }

    /**
     * Create an instance of {@link Food }
     * 
     */
    public Food createFood() {
        return new Food();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFoodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.adapter.introsde/", name = "searchFoodResponse")
    public JAXBElement<SearchFoodResponse> createSearchFoodResponse(SearchFoodResponse value) {
        return new JAXBElement<SearchFoodResponse>(_SearchFoodResponse_QNAME, SearchFoodResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFoodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.adapter.introsde/", name = "getFoodResponse")
    public JAXBElement<GetFoodResponse> createGetFoodResponse(GetFoodResponse value) {
        return new JAXBElement<GetFoodResponse>(_GetFoodResponse_QNAME, GetFoodResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFood }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.adapter.introsde/", name = "getFood")
    public JAXBElement<GetFood> createGetFood(GetFood value) {
        return new JAXBElement<GetFood>(_GetFood_QNAME, GetFood.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFood }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.adapter.introsde/", name = "searchFood")
    public JAXBElement<SearchFood> createSearchFood(SearchFood value) {
        return new JAXBElement<SearchFood>(_SearchFood_QNAME, SearchFood.class, null, value);
    }

}

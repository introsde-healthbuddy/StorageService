
package introsde.adapter.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Interface", targetNamespace = "http://ws.adapter.introsde/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Interface {


    /**
     * 
     * @param foodId
     * @return
     *     returns introsde.adapter.ws.Food
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getFood", targetNamespace = "http://ws.adapter.introsde/", className = "introsde.adapter.ws.GetFood")
    @ResponseWrapper(localName = "getFoodResponse", targetNamespace = "http://ws.adapter.introsde/", className = "introsde.adapter.ws.GetFoodResponse")
    @Action(input = "http://ws.adapter.introsde/Interface/getFoodRequest", output = "http://ws.adapter.introsde/Interface/getFoodResponse")
    public Food getFood(
        @WebParam(name = "foodId", targetNamespace = "")
        int foodId);

    /**
     * 
     * @param text
     * @return
     *     returns java.util.List<introsde.adapter.ws.Food>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchFood", targetNamespace = "http://ws.adapter.introsde/", className = "introsde.adapter.ws.SearchFood")
    @ResponseWrapper(localName = "searchFoodResponse", targetNamespace = "http://ws.adapter.introsde/", className = "introsde.adapter.ws.SearchFoodResponse")
    @Action(input = "http://ws.adapter.introsde/Interface/searchFoodRequest", output = "http://ws.adapter.introsde/Interface/searchFoodResponse")
    public List<Food> searchFood(
        @WebParam(name = "text", targetNamespace = "")
        String text);

    /**
     * 
     * @return
     *     returns java.util.List<introsde.adapter.ws.Exercise>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getExercises", targetNamespace = "http://ws.adapter.introsde/", className = "introsde.adapter.ws.GetExercises")
    @ResponseWrapper(localName = "getExercisesResponse", targetNamespace = "http://ws.adapter.introsde/", className = "introsde.adapter.ws.GetExercisesResponse")
    @Action(input = "http://ws.adapter.introsde/Interface/getExercisesRequest", output = "http://ws.adapter.introsde/Interface/getExercisesResponse")
    public List<Exercise> getExercises();

}
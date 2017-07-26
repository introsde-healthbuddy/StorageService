package introsde.storage.ws;


import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import introsde.adapter.ws.Exercise;
import introsde.adapter.ws.Food;
import introsde.adapter.ws.Recipe;
import introsde.localdatabase.soap.Measure;
import introsde.localdatabase.soap.Person;



@WebService
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL) //optional
public interface Storage {
    
	@WebMethod(operationName="createPerson")
	@WebResult(name="person") 
	public Person createPerson(@WebParam(name="person") Person person);
	
    @WebMethod(operationName="getPeopleList")
    @WebResult(name="people")
    public List<Person> getPeople();
    
    @WebMethod(operationName="readPerson")
    @WebResult(name="person") 
    public Person readPerson(@WebParam(name="idPerson") Long id);
    
    @WebMethod(operationName="updatePerson")
    @WebResult(name="person") 
    public Person updatePerson(@WebParam(name="person") Person person);
    
    @WebMethod(operationName="deletePerson")
    @WebResult(name="success") 
    public int deletePerson(@WebParam(name="idPerson") Long id);
    
    @WebMethod(operationName="readPersonHistory")
    @WebResult(name="measure") 
    public List<Measure> readPersonHistory(@WebParam(name="idPerson") Long id, @WebParam(name="measureType") String measureType);
    
    @WebMethod(operationName="readMeasureTypes")
    @WebResult(name="measure") 
    public List<Measure> readMeasureTypes();
    
    @WebMethod(operationName="readPersonMeasure")
    @WebResult(name="measure") 
    public Measure readPersonMeasure(@WebParam(name="idPerson") Long id, @WebParam(name="measureType") String measureType, @WebParam(name="measureId") Long mid);
    
    @WebMethod(operationName="savePersonMeasure")
    @WebResult(name="measure") 
    public Measure savePersonMeasure(@WebParam(name="idPerson") Long id, @WebParam(name="measure") Measure measure);
   
    @WebMethod(operationName="updatePersonMeasure")
    @WebResult(name="measure") 
    public Measure updatePersonMeasure(@WebParam(name="idPerson") Long id, @WebParam(name="measure") Measure measure);

    @WebMethod(operationName="searchFood")
    @WebResult(name="foods") 
    public List<Food> searchFood(@WebParam(name="text") String s);
    
    @WebMethod(operationName="getExercises")
    @WebResult(name="exercises") 
    public List<Exercise> getExercises();
    
}
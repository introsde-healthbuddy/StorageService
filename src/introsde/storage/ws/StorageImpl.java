package introsde.storage.ws;

import java.util.List;

import javax.jws.WebService;
import javax.xml.ws.Holder;

import introsde.storage.ws.Storage;
import introsde.localdatabase.soap.Person;
import introsde.localdatabase.soap.*;

import introsde.adapter.ws.*;

@WebService(endpointInterface = "introsde.storage.ws.Storage",serviceName="StorageService")
public class StorageImpl implements Storage{
	
	AdapterService aService;
	Interface aInterface;
	PeopleService pService;
	People pInterface;
	
	
	public void initialize(){
		aService = new AdapterService();
		aInterface = aService.getImplementationPort();
		pService = new PeopleService();
		pInterface = pService.getPeopleImplPort();
	}


	@Override
	public Person createPerson(Person person) {
		initialize();
		Holder<Person> holder=new Holder<Person>(person);
		pInterface.createPerson(holder);
		person = holder.value;
		
		return person;
	}


	@Override
	public List<Person> getPeople() {
		initialize();
		return pInterface.getPeopleList();
	}


	@Override
	public Person readPerson(Long id) {
		initialize();
		return pInterface.readPerson(id);
	}


	@Override
	public Person updatePerson(Person person) {
		initialize();
		Holder<Person> holder=new Holder<Person>(person);
		pInterface.updatePerson(holder);
		return holder.value;
	}


	@Override
	public int deletePerson(Long id) {
		initialize();
		return pInterface.deletePerson(id);
	}

	
//	HEALTH
	
	
	@Override
	public List<Measure> readPersonHistory(Long id, String measureType) {
		initialize();
		return pInterface.readPersonHistory(id, measureType);
	}


	@Override
	public List<Measure> readMeasureTypes() {
		initialize();
		return pInterface.readMeasureTypes();
	}


	@Override
	public Measure readPersonMeasure(Long id, String measureType, Long mid) {
		initialize();
		return pInterface.readPersonMeasure(id, measureType, mid);
	}


	@Override
	public Measure savePersonMeasure(Long id, Measure measure) {
		initialize();
		Holder<Measure> holder=new Holder<Measure>(measure);
		pInterface.savePersonMeasure(id, holder);
		return holder.value;
	}


	@Override
	public Measure updatePersonMeasure(Long id, Measure measure) {
		return null;
	}
	
//	Activity
	
//	@Override
//	public List<Activity> readActivity(Long id) {
//		initialize();
//		return pInterface.readActivity(id);
//	}
//	
//	@Override
//	public Activity createActivity(Long id, Activity a) {
//		initialize();
//		Holder<Activity> holder = new Holder<Activity>(a);
//		pInterface.createActivity(id, holder);
//		return holder.value;
//	}
//	
//	@Override
//	public Activity updateActivity(Long id, Activity a) {
//		initialize();
//		Holder<Activity> holder=new Holder<Activity>(a);
//		pInterface.updateActivity(id, holder);
//		return holder.value;
//		
//	}
//	
//	@Override 
//	public int deleteActivity(Long id) {
//		initialize();
//		return pInterface.deleteActivity(id);
//	}

//	FOOD
	
	@Override
	public List<Food> searchFood(String s) {
		initialize();
		return aInterface.searchFood(s);
	}
	
	
	@Override
	public Food getFood(int id) {
		initialize();
		return aInterface.getFood(id);
	}
	
//	EXERCISES
	
	@Override
	public List<Exercise> getExercises() {
		initialize();
		return aInterface.getExercises();
	}

}
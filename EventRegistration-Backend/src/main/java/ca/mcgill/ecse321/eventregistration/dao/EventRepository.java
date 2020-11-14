package ca.mcgill.ecse321.eventregistration.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ca.mcgill.ecse321.eventregistration.model.Event;

@RepositoryRestResource(collectionResourceRel = "event_data", path = "event_data")
public interface EventRepository extends CrudRepository<Event, String> {

	Event findEventByName(String name);

}
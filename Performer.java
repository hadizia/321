package ca.mcgill.ecse321.eventregistration.model;

import javax.persistence.Entity;
import java.util.Set;
import javax.persistence.ManyToMany;

@Entity
public class Performer extends PersonRole{
   private Set<Event> event;
   
   @ManyToMany(mappedBy="performer" )
   public Set<Event> getEvent() {
      return this.event;
   }
   
   public void setEvent(Set<Event> events) {
      this.event = events;
   }
   
   }

package ca.mcgill.ecse321.eventregistration.model;
import javax.persistence.OneToMany;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person{
private Set<PersonRole> personRole;
   
   @OneToMany(mappedBy="person" )
   public Set<PersonRole> getPersonRole() {
      return this.personRole;
   }
   
   public void setPersonRole(Set<PersonRole> personRoles) {
      this.personRole = personRoles;
   }
   
private String name;

    public void setName(String value) {
        this.name = value;
    }
    @Id
    public String getName() {
        return this.name;
}
}

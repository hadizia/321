package ca.mcgill.ecse321.eventregistration.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class GooglePay{
   private String id;

public void setId(String value) {
    this.id = value;
}
@Id
public String getId() {
    return this.id;
}
private int amount;

public void setAmount(int value) {
    this.amount = value;
}
public int getAmount() {
    return this.amount;
}
   private Participant participant;
   
   @OneToOne(mappedBy="googlePay" , optional=false)
   public Participant getParticipant() {
      return this.participant;
   }
   
   public void setParticipant(Participant participant) {
      this.participant = participant;
   }
   
   private Registration registration;
   
   @OneToOne(mappedBy="googlePay" , optional=false)
   public Registration getRegistration() {
      return this.registration;
   }
   
   public void setRegistration(Registration registration) {
      this.registration = registration;
   }
   
   }

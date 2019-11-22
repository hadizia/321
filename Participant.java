package ca.mcgill.ecse321.eventregistration.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Participant extends PersonRole{
   private GooglePay googlePay;
   
   @OneToOne(optional=false)
   public GooglePay getGooglePay() {
      return this.googlePay;
   }
   
   public void setGooglePay(GooglePay googlePay) {
      this.googlePay = googlePay;
   }
   
   }

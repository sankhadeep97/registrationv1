 package com.api.payload;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

 //@Getter
// @Setter

 public class RegistrationDto {
    @NotNull
     @Size(min=2,message = "Minimum should be 2 letters")
     private String name;

     @Email
     private String email;

     @Size(min = 10,max = 10,message = "should be 10 digits")
     private String mobile;

     public void setName(String name) {
         this.name = name;
     }

     public void setEmail(String email) {
         this.email = email;
     }

     public void setMobile(String mobile) {
         this.mobile = mobile;
     }

     public String getName() {
         return name;
     }

     public String getEmail() {
         return email;
     }

     public String getMobile() {
         return mobile;
     }
 }






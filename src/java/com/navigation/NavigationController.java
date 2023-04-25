/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.navigation;

import jakarta.faces.annotation.ManagedProperty;
import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.RequestScoped;
import java.io.Serializable;

/**
 *
 * @author Ibrahim
 */
@ManagedBean(name = "navigationController", eager = true)
@RequestScoped

public class NavigationController implements Serializable  {
    
    //this managed property will read value from request parameter pageId
   @ManagedProperty(value = "#{param.pageId}")
   private String pageId;
   
   public String showPage() {
      if(pageId == null) {
         return "home";
      }
      
       return switch (pageId) {
           case "1" -> "admin";
           case "2" -> "contribuable";
           case "3" -> "representant";
           case "4" -> "Payement";
           default -> "home";
       };
   }
}

package com.company;

import java.util.Scanner;

public class Producto {

   private float precio;
   private String nombre;

   public Producto (){

      this.precio = 0;
      this.nombre = "";

   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public void setPrecio(float precio) {
      this.precio = precio;
   }

   public String getNombre (){
      return this.nombre;
   }

   public float getPrecio (){
      return this.precio;
   }

}

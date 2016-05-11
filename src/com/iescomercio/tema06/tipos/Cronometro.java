package com.iescomercio.tema06.tipos;

public class Cronometro {
   private long inicio, fin;
   
   public void star(){
       inicio = System.currentTimeMillis();
   }
   
   public void stop(){
       fin = System.currentTimeMillis();
   }
   
   public void restart(){
       inicio=fin=0;
   }
   
   public long total(){
       long aux;
       
       aux = (fin-inicio);
       
       return aux;
   }
}
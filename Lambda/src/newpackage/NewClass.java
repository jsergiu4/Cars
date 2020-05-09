/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.ArrayList;
import java.util.List;
import lambda.Lambda;
import java.util.stream.*;

/**
 *
 * @author Sergiu
 */
public class NewClass {
    public ArrayList<Lambda>array = new ArrayList<>();
    
    
    public void add()
    {
      
        Lambda bmw = new  Lambda("bmw","x6",2008,2000,"diesel");
        Lambda mercedes = new  Lambda("mercedes","mercedesbenz",2007,2200,"benzina");
        Lambda skoda = new  Lambda("skoda","fabia",2010,3000,"diesel");
        Lambda volkswagen = new  Lambda("volkswagen","polo",2012,1000,"diesel");
        Lambda volvo = new  Lambda("volvo","xc90",2009,2500,"benzina");

   
        array.add(bmw);   
        array.add(mercedes);  
        array.add(skoda);  
        array.add(volkswagen);  
        array.add(volvo);  
    }
 
    
    
    public void sortare(){
        
         List<Lambda>arraysort = new ArrayList<>();
         array.sort((bmw,mercedes)->bmw.getModel().compareTo(mercedes.getModel()));
         array.forEach(index -> arraysort.add(index));
        
         for (Lambda a : arraysort )
         {
          System.out.println("Producator: "+a.getProducator()); 
          System.out.println("Model: "+a.getModel());  
          System.out.println("Anul: "+a.getAn()); 
          System.out.println("Capacitatea motorului: "+a.getMotorcapacity()); 
          System.out.println("Tipul: "+a.getTip());
          System.out.println();
         }
    }
    
    
    public void filtrare()
    {
    
        List<Lambda> arrayfilt = new ArrayList<>();
        
        //arrayfilt.stream().filter((Lambda bmw) ->  bmw.getMotorcapacity() > 1500).collect(Collectors.toList(empList));
        arrayfilt=array.stream().filter((index)->index.getMotorcapacity() > 1500).collect(Collectors.toList());
        System.out.println("    Masinele cu motor mai mare decit 1500.") ;
        System.out.println();
        for(Lambda b : arrayfilt)
        {
          System.out.println("Producator: "+b.getProducator()); 
          System.out.println("Model: "+b.getModel());  
          System.out.println("Anul: "+b.getAn()); 
          System.out.println("Capacitatea motorului: "+b.getMotorcapacity()); 
          System.out.println("Tipul: "+b.getTip());
          System.out.println();
        }
    
    
    }
    
    public void filtrareDupaAn()
    {
        
        int date = 2020;
        List<Lambda> arrayfiltyear = new ArrayList<>();  
        arrayfiltyear=array.stream().filter((index)->index.getAn() > date-10).collect(Collectors.toList());
        System.out.println("      Masinele vechi de 10 ani .") ;
        System.out.println();
        for(Lambda b : arrayfiltyear)
        {  
          System.out.println("Producator: "+b.getProducator()); 
          System.out.println("Model: "+b.getModel());  
          System.out.println("Anul: "+b.getAn()); 
          System.out.println("Capacitatea motorului: "+b.getMotorcapacity()); 
          System.out.println("Tipul: "+b.getTip());
          
        }
        
    }
    
    public void filtrareCombustibilDiesel()
    {
        List<Lambda> arrayfiltcomb = new ArrayList<>();  
        arrayfiltcomb=array.stream().filter((index)->index.getTip() == "diesel").collect(Collectors.toList());
        System.out.println("      Masinele cu combustibil diesel .") ;
        System.out.println();
        for(Lambda b : arrayfiltcomb)
        {  
          System.out.println("Producator: "+b.getProducator()); 
          System.out.println("Model: "+b.getModel());  
          System.out.println("Anul: "+b.getAn()); 
          System.out.println("Capacitatea motorului: "+b.getMotorcapacity()); 
          System.out.println("Tipul: "+b.getTip());
          System.out.println();
          
        }
    }
    
     public void filtrareCombustibilBenzina()
    {
        List<Lambda> arrayfiltcomb = new ArrayList<>();  
        arrayfiltcomb=array.stream().filter((index)->index.getTip() == "benzina").collect(Collectors.toList());
        System.out.println("      Masinele cu combustibil benzina .") ;
        System.out.println();
        for(Lambda b : arrayfiltcomb)
        {  
          System.out.println("Producator: "+b.getProducator()); 
          System.out.println("Model: "+b.getModel());  
          System.out.println("Anul: "+b.getAn()); 
          System.out.println("Capacitatea motorului: "+b.getMotorcapacity()); 
          System.out.println("Tipul: "+b.getTip());
          System.out.println();
          
        }
    }
        
    
}

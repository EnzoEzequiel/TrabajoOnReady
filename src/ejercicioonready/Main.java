
package ejercicioonready;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;


public class Main {

   
    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("#.00");
        
        ArrayList <Autos>listaAutos=new ArrayList();
        
        //voy a crear y a setear cada uno de los campos por separado para mayor claridad de los mismos.
        //Autos auto1=new Autos(relleno campos con respectivos valores);
        Autos auto1=new Autos();
        
        auto1.setMarca("Peugeot");
        auto1.setModelo("206");
        auto1.setPuertas(4);
        auto1.setPrecio(Float.parseFloat("200000.00"));
        
        Autos auto2=new Autos();
        
        auto2.setMarca("Honda");
        auto2.setModelo("Titan");
        auto2.setCilindrada("125cc");
        auto2.setPrecio(Float.parseFloat("60000.00"));
        
        Autos auto3=new Autos();
        
        auto3.setMarca("Peugeot");
        auto3.setModelo("208");
        auto3.setPuertas(5);
        auto3.setPrecio(Float.parseFloat("250000.00"));
        
        Autos auto4=new Autos();
        
        auto4.setMarca("Yamaha");
        auto4.setModelo("YBR");
        auto4.setCilindrada("160cc");
        auto4.setPrecio(Float.parseFloat("80500.50"));
        
        
        listaAutos.add(auto1);
        listaAutos.add(auto2);
        listaAutos.add(auto3);
        listaAutos.add(auto4);
    
        /*for(Autos A:listaAutos){
            System.out.println("Marca=" +A.getMarca()+"//Modelo="+A.getModelo()+"//Puertas="+A.getPuertas()+ "//Cilindrada=" +A.getCilindrada()+" Precio="+df.format(A.getPrecio()));
        }*/
        
        for (int i=0;i<listaAutos.size();i++){
            System.out.println(listaAutos.get(i).toString());
        }
        
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        
        double mayor=auto1.getPrecio();
        String autoMayor=auto1.getMarca()+ "//"+auto1.getModelo();
        
        double menor=auto1.getPrecio();
        String autoMenor=auto1.getMarca()+ "//"+auto1.getModelo();
        
        ArrayList <Autos> letraY=new ArrayList();
        
       	
        for(Autos a:listaAutos){
            
            if(a.getPrecio()<menor){
                menor=a.getPrecio();
                autoMenor=a.getMarca()+ "//"+a.getModelo();
            }
            
            if(a.getPrecio()>mayor){
                mayor=a.getPrecio();
                autoMayor=a.getMarca()+ "//"+a.getModelo();
            }
            
            if(a.getModelo().contains("Y")||a.getModelo().contains("y"))
            {
                letraY.add(a);
            }
            
            
        }
        
        System.out.println("El auto con el mayor precio es:");
        System.out.println(autoMayor);
        System.out.println("con un precio de:");
        System.out.println(mayor);
        System.out.println("El auto con el menor precio es:");
        System.out.println(autoMenor);
        System.out.println("con un precio de:");
        System.out.println(menor);
        
        for(Autos z:letraY){
            
            System.out.println("Autos cuyos modelos contienen la letra Y: "+z.getMarca()+"// Modelo:"+z.getModelo()+"// Precio:"+z.getPrecio()+"");
        }
        
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------------------------");
        
        System.out.println("Lista de autos ordenados de mayor a menor");
        
        Collections.sort(listaAutos);
        for (Autos aux: listaAutos)
        {
            System.out.println(""+aux.getMarca()+" "+aux.getModelo()+" ");
        }
        
        
    }
}
      
      
    
            
            
        
        

        
    



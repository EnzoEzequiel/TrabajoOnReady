package ejercicioonready;

import java.text.DecimalFormat;


public class Autos implements Comparable<Autos>{
    
    DecimalFormat df = new DecimalFormat("#.00");
    
    private String marca;
    private String modelo;
    private int puertas;
    private String cilindrada;
    private float precio;
    

    public Autos() {
    }

    public Autos(String marca, String modelo, int puertas, String cilindrada, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.puertas = puertas;
        this.cilindrada = cilindrada;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    
    public String toString(){
        
        return "Auto [Marca:" +marca+" // Modelo:"+modelo+" // Puertas:"+puertas+ " // Cilindrada:" +cilindrada+" // Precio:"+df.format(precio)+"]";
        
    }
  
    /*METODO ORDENA LAS POSICIONES DEL PRECIO EN EL ARRAYLIST COMPARANDO LOS 
    DATOS PASADOS POR PARAMETORS CON EL QUE YA SE ENCUENTRA EN LA VARIABLE PRECIO*/
    //TAMBIEN SE IMPLEMENTA EN LA CLASE usando implements Comparable<Autos>
    @Override
    public int compareTo(Autos x) {
        if (x.getPrecio()<precio)
        {
            return -1;
        }
        else if (x.getPrecio() <precio)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
    
}

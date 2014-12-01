public class Distribuidor {
    
    //propiedades
    private String nombre;
    private String CIF;
    private Dirección dirección;
    private Contacto personaContacto;
    
    //metodos getter y setter

    //nombre 
    public String getNombre(){
        return nombre;
    }
    public void setNombre(nomdist){
        this.nombre = nomdist
    }
    
    //CIF
    public String getCIF(){
        return CIF;
    }
    public void setCIF(cif){
        this.CIF = cif
    }
    
}
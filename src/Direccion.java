public class Direccion {

    //propiedades
    private String nombreCalle;
    private int numeroPebellon;
    private int codigoPostal;
    private String localidad;
    private String provincia;
    
    public Direccion() {}
    //métodos getter y setter
    
    //nombre de la calle
    public String getNombreCalle(){
        return nombreCalle;
    }
    public void setNombreCalle(String nomcalle){
        this.nombreCalle = nomcalle;
    }
    
    //numero pabellon
    public int getNumeroPabellon(){
        return numeroPebellon;
    }
    public void setNumeroPabellon(int numpab){
        this.numeroPebellon = numpab;
    }
    
    //codigo postal
    public int getCodigoPostal(){
        return codigoPostal;
    }
    public void setCodigoPostal(int codpost){
        this.codigoPostal = codpost;
    }
    
    //localidad
     public String getLocalidad(){
        return localidad;
    }
    public void setLocalidad(String local){
        this.localidad = local;
    }
    
    //provincia
     public String getProvincia(){
        return provincia;
    }
    public void setProvincia(String prov){
        this.provincia = prov;
    }
}
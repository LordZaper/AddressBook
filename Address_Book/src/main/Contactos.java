package main;

public class Contactos 
{
    private String Nombre;
    private String Direccion;
    private String NumeroTlf;
    private String Email;
    
    public Contactos(String Nombre, String Direccion, String NumeroTlf,String Email)
    {
        this.Nombre=Nombre;
        this.Direccion=Direccion;
        this.NumeroTlf=NumeroTlf;
        this.Email=Email;
    }   

    public String getNombre() {
        return Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getNumeroTlf() {
        return NumeroTlf;
    }

    public String getEmail() {
        return Email;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.Direccion = direccion;
    }

    public void setNumeroTlf(String numeroTlf) {
        this.NumeroTlf = numeroTlf;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String toString() 
    {
        String s="Nombre: "+Nombre+"\nDirección: "
                +Direccion+"\nNúmero de Teléfono: "
                +NumeroTlf+"\nDirección de email: "
                +Email;
        return s;   
    }
}

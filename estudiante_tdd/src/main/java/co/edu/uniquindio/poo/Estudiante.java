package co.edu.uniquindio.poo;


public class Estudiante {
    private String nombre;
    private String apellido;
    private String numeroID;
    private String correo;
    private String telefono;
    private int edad;

    public Estudiante( String nombre, String apellido, String numeroID, String correo, String telefono, int edad) {
        assert nombre != null && !nombre.isBlank() : "El nombre es tiene valores invalidos";
        assert numeroID != null && !numeroID.isBlank() : "El numero de Id es invalido";
        assert apellido != null && !apellido.isBlank() : "El apellido es tiene valores invalidos";
        assert correo != null && correo.contains("@") : "El correo ingresado debe tener un @";
        assert telefono != null : "el numero de telefono es invalido";
        assert edad > 0 : "La edad ingresada debe ser positiva y mayor a 0";
        
        this.nombre = nombre;
        this.numeroID = numeroID;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.edad = edad;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroID() {
        return numeroID;
    }

    public void setNumeroID(String numeroID) {
        this.numeroID = numeroID;
    }

    public String getCorreo() {
        return correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
 
@Override
public String toString() {
    return "Estudiante {"+
           "Nombre :'" + nombre + '\'' +
           ", Apellido :'" + apellido + '\'' +
           ", Numero ID :'" + numeroID + '\'' +
           ", Correo :'" + correo + '\'' +
           ", Telefono :'" + telefono + '\'' +
           ", Edad :'" + edad +
        '}';
}






}

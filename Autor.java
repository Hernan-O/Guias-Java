package guia;
import java.util.Scanner;

public class Autor{
    private String nombre;
    private String email;
    private char genero;
    private String apellido;

    public Autor(){
        nombre = "vacio";
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setAutor(){
        System.out.println("Ingresa el nombre del autor");
        Scanner aux = new Scanner(System.in);
        this.setNombre(aux.nextLine());
        System.out.println("Ingrese el apellido del autor");
        this.setApellido(aux.nextLine());
        System.out.println("Ingrese el email del autor");
        this.setEmail(aux.nextLine());
        System.out.println("Ingrese el genero del Autor (M|F)");
        this.setGenero(aux.nextLine().charAt(0));
    }
    public void mostrarAutor(){
        System.out.println("El nombre del autor es:"+this.nombre+"\nEl apellido:"+this.apellido+"\nEl genero del autor es:"+this.genero+"\nSu Email es:"+this.email);
    }

}

package guia;

public class Cliente2 {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    private String nombre;
    private char genero;

    public void mostrarCliente(){
        System.out.println("El nombre del cliente es:"+this.getNombre()+"\nEl genero del cliente es:"+this.getGenero()+"\nEl id del cliente es:"+this.getId());
    }
}

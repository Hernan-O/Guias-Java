package guia;
import java.util.Scanner;

public class Libro{
    private String titulo;
    private int precio;
    private int stock;
    private Autor[] aut = new Autor[10];
    private int cantAutor;

    public Libro(){
        cantAutor = 0;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Autor[] getAut() {
        return aut;
    }

    public void setAut(Autor aut) {
        this.aut[this.cantAutor] = aut;
        this.cantAutor++;
    }
    public int getCant(){
        return cantAutor;
    }
    public void mostrarLibro(){
        System.out.println("Libro:"+this.titulo+"\nPrecio:"+this.precio+"\nStock:"+this.stock);
        int i = 0;
        while(i != this.cantAutor){
            System.out.println("Nombre del autor:"+this.aut[i].getNombre());
            i++;
        }
    }
    public void infoLibro(){
        System.out.print("El libro, "+this.titulo);
        int i = 0;
        while(i != this.cantAutor){
            System.out.print(" de:"+this.aut[i].getNombre());
            i++;
        }
        System.out.print(" Se vende a "+this.precio+" pesos.");
    }
    public void aumentoLibro(int precio){
        this.precio = precio;
    }
    public void aumentoCopias(int stock){
        this.stock = this.stock+stock;
    }
    public void autorPorTitulo(){
        System.out.println("Ingrese el nombre del libro para ver detalles sobre su autor:");
        Scanner busq = new Scanner(System.in);
        int i = 0;
        if(busq.nextLine().equals(this.titulo))
            while(i != this.cantAutor) {
                aut[i].mostrarAutor();
                i++;
            }
        else
            System.out.println("yooooo, no existe");
    }
    public void agregarAutor(){
        System.out.println("Agregar Nuevo autor");
        Autor temp = new Autor();
        temp.setAutor();
        this.setAut(temp);
    }
}

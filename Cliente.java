package guia;
import java.util.UUID;
public class Cliente{
    private UUID id = UUID.randomUUID();
    private String nombre;
    private String email;
    private int porcen;

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

    public int getPorcen() {
        return porcen;
    }

    public void setPorcen(int porcen) {
        this.porcen = porcen;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
    public void mostrarCliente(){
        System.out.println("Id del cliente: "+this.getId()+"\nNombre del cliente: "+this.getNombre()+"\nEmail cliente: "+this.getEmail()+"\nDescuento: "+this.getPorcen()+"%");
    }
}

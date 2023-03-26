package guia;
import java.util.UUID;
import java.time.*;
public class Factura{
    private UUID id = UUID.randomUUID();
    private LocalDate fecha = LocalDate.now();
    private LocalTime hora = LocalTime.now();
    private int total;
    private Cliente cliente = new Cliente();

    public Factura(){
        setId(UUID.randomUUID());
    }
    public UUID getId(){
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public int montoFinal(){
        this.total = this.total-((this.total*this.getCliente().getPorcen())/100);
        return this.total;
    }
    public void muestraFactura(){
        System.out.println("ID de la factura"+this.getId()+"\nHora de la facturacion:"+this.getHora()+"\nFecha de la facturacion:"+this.getFecha()+"\nMonto pre-descuento:"+this.getTotal()+"\nMonto post-descuento:"+this.montoFinal());
        this.getCliente().mostrarCliente();
    }
}

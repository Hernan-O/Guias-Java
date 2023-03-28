package guia;

public class Cuenta {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Cliente2 getCli() {
        return cli;
    }

    public void setCli(Cliente2 cli) {
        this.cli = cli;
    }

    private int balance;
    private Cliente2 cli = new Cliente2();

    public void retirar(int retirar){
        int base = this.getBalance();
        this.setBalance(this.getBalance()-retirar);
        int flag = chequeoNegativo();
        if(flag == 1){
            this.setBalance(base);
            System.out.println("no puede retirar esa cantidad");
        }
        else{
           System.out.println("El cliente "+this.cli.getNombre()+" retiró:"+retirar+"$");
        }
    }
    public void ingresar(int ingresar){
        this.setBalance(this.getBalance()+ingresar);
        System.out.println("El cliente "+this.cli.getNombre()+" ingresó "+ingresar+"$");
    }
    public int chequeoNegativo(){
        int flag = 0;
        if(this.getBalance()<-2000){
            flag = 1;
        }
        return flag;
    }
    public void mostrarCuenta(){
        System.out.println("El cliente: "+this.cli.getNombre()+"\nTiene un saldo de:"+this.getBalance()+"\nsu id es:"+this.getId());
    }
}


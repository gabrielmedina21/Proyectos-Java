package Clases;

public class Cuenta {
    private int id;
    private String nombre;
    private double balance;
    private boolean habilitadoCuenta;

    public Cuenta() {

    }

    public Cuenta(String nombre, double balance, boolean habilitadoCuenta) {
        this.nombre = nombre;
        this.balance = balance;
        this.habilitadoCuenta = habilitadoCuenta;
    }

    public Cuenta(int id, String nombre, double balance, boolean habilitadoCuenta) {
        this.id = id;
        this.nombre = nombre;
        this.balance = balance;
        this.habilitadoCuenta = habilitadoCuenta;
    }

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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isHabilitadoCuenta() {
        return habilitadoCuenta;
    }

    public void setHabilitadoCuenta(boolean habilitadoCuenta) {
        this.habilitadoCuenta = habilitadoCuenta;
    }

    public double credito(double deposito) {
        balance += deposito;

        return balance;
    }

    public double debito(double montoExtaccion) {
        balance -= montoExtaccion;

        return balance;
    }

    public void mostrarDatosCuentaConID() {
        System.out.println("\nID Cuenta: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.printf("Balance: $%.2f" , getBalance());
    }

    public void mostrarDatosCuentaSinID() {
        System.out.println("Nombre: " + getNombre());
        System.out.printf("Balance: $%.2f" , getBalance());
    }
}

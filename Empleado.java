public abstract class Empleado {
    private String primerNombre, primerApellido, NSS; 

    public Empleado(String primerNombre, String primerApellido, String NSS) {
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.NSS = NSS;
    }

    public String getNSS() {
        return NSS;
    }

    public void setNSS(String NSS) {
        this.NSS = NSS;
    }

    public abstract double ObtenerSalario();
}
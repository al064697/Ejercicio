public class EmpleadoBaseMasComision extends EmpleadoPorComision{
    private double salarioBase;

    public EmpleadoBaseMasComision(String primerNombre, String primerApellido, String NSS, double tarifaPorComision, double ventasBrutas, double salarioBase) {
        super(primerNombre, primerApellido, NSS, tarifaPorComision, ventasBrutas);
        this.salarioBase = salarioBase;
    }

    @Override 
    public double ObtenerSalario() {
        return salarioBase + (getTarifaPorComision() + ventasBrutas);
    } 
}

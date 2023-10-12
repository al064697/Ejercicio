public class EmpleadoAsalariado extends Empleado {
    private double salarioSemanal;

    public EmpleadoAsalariado(String primerNombre, String primerApellido, String NSS, double salarioSemanal) {
        super(primerNombre, primerApellido, NSS);
        this.salarioSemanal = salarioSemanal;
    }


    public void salarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }
    
    public double ObtenerSalario() {
        return 0;
    }
}

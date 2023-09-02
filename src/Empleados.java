public class Empleados {
    private String nombre;
    private String apellido;

    private int salario;

    private int tiempoContrato;

    private int diasVacaciones;

    private boolean hasVacaciones;

    public void informacion() {
        System.out.println("Nombre: ");
        System.out.println("apellido: ");
        System.out.println("salario:");
        System.out.println("tiempoContrato:");
        System.out.println("diasVacaciones:");
        System.out.println("hasVacaciones:");

    }
    public int pagarFiniquito(int salario,int tiempoContrato){
        int finiquito;
        finiquito = salario * tiempoContrato;
        return finiquito;

    }
    public int darVacaciones(int tiempoContrato){
        this.tiempoContrato = tiempoContrato;
        int vacaciones;
        vacaciones = tiempoContrato * 2;
        return vacaciones;



    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getTiempoContrato() {
        return tiempoContrato;
    }

    public void setTiempoContrato(int tiempoContrato) {
        this.tiempoContrato = tiempoContrato;
    }

    public int getDiasVacaciones() {
        return diasVacaciones;
    }

    public void setDiasVacaciones(int diasVacaciones) {
        this.diasVacaciones = diasVacaciones;
    }

    public boolean isHasVacaciones() {
        return hasVacaciones;
    }

    public void setHasVacaciones(boolean hasVacaciones) {
        this.hasVacaciones = hasVacaciones;
    }
}

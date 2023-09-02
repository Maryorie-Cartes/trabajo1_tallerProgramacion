public class EmpleadoTemporal extends Empleados {
        private boolean isRenovado;

    public boolean isRenovado() {
        return isRenovado;
    }

    public void setRenovado(boolean renovado) {
        isRenovado = renovado;
    }

    public EmpleadoTemporal(boolean isRenovado) {
        this.isRenovado = false;
        this.setHasVacaciones(false);
    }
    public void ectenderContrato(int meses){
        this.setRenovado(true);
        this.setTiempoContrato(this.getTiempoContrato() + meses);
        if(this.getTiempoContrato() > 6){
            this.setHasVacaciones(true);
        }
    }

    @Override
    public int darVacaciones(int tiempoContrato) {
       // return super.darVacaciones(tiempoContrato);
        int vacaciones = 0;
        if(this.isHasVacaciones()){
            vacaciones = tiempoContrato * 2;

        }
        return vacaciones;
    }
}

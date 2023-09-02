public class EmpleadoIndefinido extends Empleados {

    public EmpleadoIndefinido(int tiempoContrato) {
        if (tiempoContrato > 6) {
//            Set es para dar el valor a la variable
//            Get es para obtener el valor de la variable
//            Override es para "sobreescribir" el método de la clase padre
            this.setHasVacaciones(true);
        }
       ;
    }

    @Override
    public int pagarFiniquito(int salario, int tiempoContrato) {
        //return super.pagarFiniquito(salario, tiempoContrato);
        int  finiquito = 0;
        if (tiempoContrato > 12){
            finiquito = salario * tiempoContrato + 50000;
        } else if (tiempoContrato < 0) {
            throw new Error("La cantidad de meses no puede ser menor a 0");
        } else {
            finiquito = salario * tiempoContrato;
        }
        System.out.println("El monto de su finiquito es: " + finiquito + ".");
        return finiquito;

    }

    @Override
    public int darVacaciones(int tiempoContrato) {
       // return super.darVacaciones(tiempoContrato);
        int vacaciones = 0;

        if(this.isHasVacaciones()){
            vacaciones = tiempoContrato * 2;


        }

        System.out.println("Las vacaciones del empleado son de : " + vacaciones + " dias.");
        return vacaciones;

    }
}

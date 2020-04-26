package ar.com.schmngmnt;

/**
 * Esta clase es responsable por llevar registro de los docentes de la escuela.
 */
public class Teacher {

    private int id;
    private String name;
    private double salary;
    private double salaryEarned;

    /**
     * Este constructor es responsable de crear un docente nuevo
     * @param id es el identificador del docente
     * @param name es el nombre del docente
     * @param salary es el sueldo del docente
     */
    public Teacher(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }

    /**
     *
     * @return devuelve el número de identificación del docente
     */
    public int getId(){
        return id;
    }

    /**
     *
     * @return devuelve el nombre del docente
     */
    public String getName(){
        return name;
    }

    /**
     *
     * @return devuelve el saldo del docente
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Actualiza el sueldo del docente
     * @param salary es el nuevo sueldo del docente.
     */
    public void setSalary(double salary){
        this.salary=salary;
    }

    /**
     * Agrega el sueldo al docente
     * Quita ese dinero al total ganado por la escuela
     * @param salary es el sueldo del docente
     */
    public void recieveSalary(double salary){
        salaryEarned+=salary;
        School.updateMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "El nombre del docente es: "+name+". " +
                "Total ganado hasta ahora: $"+ salaryEarned;
    }
}


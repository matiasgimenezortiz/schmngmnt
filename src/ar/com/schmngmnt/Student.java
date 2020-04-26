package ar.com.schmngmnt;

public class Student {
    private int id;
    private String name;
    private float grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * Crear un nuevo estudiante e inicializar parámetros
     * Fees para cada estudiante es $30K
     * Fees pagado inicialmente es $0K
     * @param id es el identificador del alumno, es un valor único;
     * @param name es el nombre del alumno;
     * @param grade es la calificación del alumno;
     */
    public Student(int id, String name, float grade){
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id=id;
        this.name=name;
        this.grade=grade;
    }

    //No será posible cambiar el nombre del estudiante ni su identificador
    //Si se podrá cambiar las calificaciones

    /**
     * Usado para actualizar la calificación del estudiante
     * @param grade es la nueva calificación del estudiante
     */
    public void setGrade(float grade){
        this.grade=grade;
    }

    /**
     * La escuela va a recibir el dinero, y lo va asignar al estudiante.
     * Actualizará el dinero pagado por el estudiante.
     * @param fees es el dinero recibido
     */
    public void updateFeesPaid(int fees){
        this.feesPaid+=fees;
        School.updateTotalMoneyEarned(fees);
    }

    /**
     *
     * @return devolverá el número de identificación del estudiante
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return devolverá el nombre del estudiante
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return devolverá la calificación del estudiante
     */
    public float getGrade() {
        return grade;
    }

    /**
     *
     * @return devolverá cuánto ha pagado el estudiante hasta el momento.
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return devolverá cuánto debería pagar el estudiante en total.
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     * Devuelve la cantidad de dinero que aún se debe pagar
     * @return
     */
    public int getRemainingFess(){
        return (feesTotal - feesPaid);
    }

    @Override
    public String toString() {
        return "Student's name: "+name+ ". Total pagado hasta ahora: $"+feesPaid+
                " y le resta por pagar: $" + (feesTotal-feesPaid);
    }
}

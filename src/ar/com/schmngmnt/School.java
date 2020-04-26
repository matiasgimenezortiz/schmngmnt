package ar.com.schmngmnt;

import java.util.List;

public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * Nuevo objeto escuela se crea.
     * @param teachers es la lista de profesores en la escuela.
     * @param students es la lista de alumnos en la escuela.
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    /**
     * Devuelve la lista de docentes de la lista
     * @return
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Agrega un docente a la escuela
     * @param teacher es el docente que será agregado
     */
    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * Devuelve la lista de estudiantes e la escuela.
     * @return
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Agrega estudiantes a la lista.
     * @param student es el alumno que será agregado
     */
    public void addStudents(Student student) {
        students.add(student);
    }

    /**
     * Devuelve el total de dinero ganado por la escuela.
     * @return
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Actualiza la cantidad de dinero ganado por la escuela.
     * @param moneyEarned
     */
    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    /**
     * Devuelve el total del dinero ganado por la escuela.
     * @return
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * Actualiza el dinero gastado por la escuela, que es el
     * dinero pagado a los docentes por la escuela.
     * @param moneySpent
     */
    public static void updateMoneySpent(double moneySpent) {
        totalMoneyEarned -= moneySpent;
    }
}

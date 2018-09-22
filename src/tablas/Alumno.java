package tablas;

public class Alumno {
    private int num_control;
    private String nombre;
    private String apellidos;
    private String telefono;

    public Alumno() {
    }

    public Alumno(int num_control, String nombre, String apellidos, String telefono) {
        this.num_control = num_control;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }

    /**
     * @return the num_control
     */
    public int getNum_control() {
        return num_control;
    }

    /**
     * @param num_control the num_control to set
     */
    public void setNum_control(int num_control) {
        this.num_control = num_control;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
}

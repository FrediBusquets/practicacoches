/**
 * Created by USER on 17/10/2016.
 */
/**
 * Created by USER on 19/09/2016.
 */
public class Persona {
    public String Dni;
    public String numSS;
    public String nombre;
    public String apellidos;
    public int edad;

    public Persona(String Dni, String numSS, String nombre, String apellidos, int edad) {
        this.Dni = Dni;
        this.numSS = numSS;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getDNI() {
        return Dni;
    }

    public void setDNI(String DNI) {
        this.Dni = DNI;
    }

    public String getNumSS() {
        return numSS;
    }

    public void setNumSS(String numSS) {
        this.numSS = numSS;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persona persona = (Persona) o;

        if (edad != persona.edad) return false;
        if (Dni != null ? !Dni.equals(persona.Dni) : persona.Dni != null) return false;
        if (numSS != null ? !numSS.equals(persona.numSS) : persona.numSS != null) return false;
        if (nombre != null ? !nombre.equals(persona.nombre) : persona.nombre != null) return false;
        return apellidos != null ? apellidos.equals(persona.apellidos) : persona.apellidos == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = Dni != null ? Dni.hashCode() : 0;
        result = 31 * result + (numSS != null ? numSS.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (apellidos != null ? apellidos.hashCode() : 0);
        result = 31 * result + edad;
        return result;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "DNI='" + Dni + '\'' +
                ", numSS='" + numSS + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                '}' + System.lineSeparator();
    }
}

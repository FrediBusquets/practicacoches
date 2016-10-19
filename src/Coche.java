/**
 * Created by USER on 17/10/2016.
 */
public class Coche {

    private String matricula;
    private String marca;
    private String modelo;
    private double precio;

    public Coche(String matricula, String marca, String modelo, double precio) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                '}' + System.lineSeparator();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coche coche = (Coche) o;

        if (precio != coche.precio) return false;
        if (matricula != null ? !matricula.equals(coche.matricula) : coche.matricula != null) return false;
        if (marca != null ? !marca.equals(coche.marca) : coche.marca != null) return false;
        return modelo != null ? modelo.equals(coche.modelo) : coche.modelo == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = matricula.hashCode();
        result = 31 * result + marca.hashCode();
        result = 31 * result + modelo.hashCode();
        temp = Double.doubleToLongBits(precio);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}

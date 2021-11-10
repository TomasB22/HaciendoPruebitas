public class Computador {
    private String marca;
    private String modelo;
    private Ram ram;

    public Computador(String marca, String modelo, Ram ram) {
        this.marca = marca;
        this.modelo = modelo;
        this.ram = ram;
    }
        //askjidbvasijdbasduioasbnd iuyav 1nm23 12hj3123
    ///asoidjasiodansdoiad

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

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ram=" + ram +
                '}';
    }

}

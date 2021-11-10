public class Ram {
    private String marcaRam;
    private int GB;
    private int MHz;

    public Ram(String marcaRam, int GB, int MHz) {
        this.marcaRam = marcaRam;
        this.GB = GB;
        this.MHz = MHz;
    }

    public String getMarcaRam() {
        return marcaRam;
    }

    public void setMarcaRam(String marcaRam) {
        this.marcaRam = marcaRam;
    }

    public int getGB() {
        return GB;
    }

    public void setGB(int GB) {
        this.GB = GB;
    }

    public int getMHz() {
        return MHz;
    }

    public void setMHz(int MHz) {
        this.MHz = MHz;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "marcaRam='" + marcaRam + '\'' +
                ", GB=" + GB +
                ", MHz=" + MHz +
                '}';
    }
}

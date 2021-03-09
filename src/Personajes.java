public class Personajes {

    private int ataque;
    private int armadura;
    private int vida;
    private String nombre;
    private boolean esHeroe;

    public Personajes(int ataque, int armadura, int vida, String nombre, boolean esHeroe) {
        this.ataque = ataque;
        this.armadura = armadura;
        this.vida = vida;
        this.nombre = nombre;
        this.esHeroe = esHeroe;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEsHeroe() {
        return esHeroe;
    }

    public void setEsHeroe(boolean esHeroe) {
        this.esHeroe = esHeroe;
    }
}

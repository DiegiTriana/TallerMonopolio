package Classes;


public class Inmobiliario {
    
    private Jugador owner;
    private String type;

    public Inmobiliario(Jugador owner, String type) {
        this.owner = owner;
        this.type = type;
    }

    public Inmobiliario() {
    }

    public Jugador getOwner() {
        return owner;
    }

    public void setOwner(Jugador owner) {
        this.owner = owner;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

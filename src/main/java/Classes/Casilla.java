package Classes;


public class Casilla {
    
    private String color;
    private String name;
    private String Id;
    private int effect;
    private int price;
    private Jugador owner;
    private int rent;
    private int house1;
    private int house2;
    private int house3;
    private int house4;
    private int hotel;
    private int houseCost;
    private int numHouses = 0;

    public Casilla() {
    }

    public Casilla(String color, String name, String Id, int effect, int price) {
        this.color = color;
        this.name = name;
        this.Id = Id;
        this.effect = effect;
        this.price = price;
    }
    
    public void setRentas(int rent, int house1, int house2, int house3, int house4, int hotel, int houseCost){
        this.rent = rent;
        this.house1 = house1;
        this.house2 = house2;
        this.house3 = house3;
        this.house4 = house4;
        this.hotel = hotel;
        this.houseCost = houseCost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEffect() {
        return effect;
    }

    public void setEffect(int effect) {
        this.effect = effect;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Jugador getOwner() {
        return owner;
    }

    public void setOwner(Jugador owner) {
        this.owner = owner;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public int getHouse1() {
        return house1;
    }

    public void setHouse1(int house1) {
        this.house1 = house1;
    }

    public int getHouse2() {
        return house2;
    }

    public void setHouse2(int house2) {
        this.house2 = house2;
    }

    public int getHouse3() {
        return house3;
    }

    public void setHouse3(int house3) {
        this.house3 = house3;
    }

    public int getHouse4() {
        return house4;
    }

    public void setHouse4(int house4) {
        this.house4 = house4;
    }

    public int getHotel() {
        return hotel;
    }

    public void setHotel(int hotel) {
        this.hotel = hotel;
    }

    public int getHouseCost() {
        return houseCost;
    }

    public void setHouseCost(int houseCost) {
        this.houseCost = houseCost;
    }

    public int getNumHouses() {
        return numHouses;
    }

    public void setNumHouses(int numHouses) {
        this.numHouses = numHouses;
    }
    
}

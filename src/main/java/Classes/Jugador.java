package Classes;


public class Jugador {
    
    private String Name;
    private float money;
    private boolean jailPass;
    private boolean isJailed;
    private int position = 0;

    public Jugador(String Name) {
        this.Name = Name;
        this.money = 2000;
        this.jailPass = false;
        this.isJailed = false;
    }

    public Jugador() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }
    
    public boolean getIsJailed() {
        return jailPass;
    }

    public void setIsJailed(boolean isJailed) {
        this.jailPass = isJailed;
    }
    
    public float calcularDinero(float money, String var){
        if(var == "+"){
            return this.money=+money;
        }else{
            return this.money=-money;
        }
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean isJailPass() {
        return jailPass;
    }

    public void setJailPass(boolean jailPass) {
        this.jailPass = jailPass;
    }
    
    
    
}

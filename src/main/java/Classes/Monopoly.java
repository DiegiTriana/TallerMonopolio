package Classes;

import Interface.Tablero;
import java.awt.Container;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Monopoly {

    private Jugador [] myPlayers;
    private static Casilla [] myBoard = new Casilla[40];
    private Tarjetas[] Chance = new Tarjetas[8];
    private Tarjetas[] Community = new Tarjetas[8];
    private int taxes = 0;
    public int dice1 = 0;
    public int dice2 = 0;
    public static int nTurno = 0;
    public static Jugador miTurno;
    private int repeticion=0;

    public static int miPosicion(){
        return miTurno.getPosition();
    }

    public int getnTurno() {
        return nTurno;
    }
    
    public static Casilla infoPropiedad(){
        Casilla propiedad = new Casilla();
        for(int i=0;i<myBoard.length;i++){
            if(Monopoly.miPosicion() == i){
                propiedad = myBoard[i];
            }
        }
        return propiedad;
    }
    
    public Monopoly() {
    }
    
    public void inicializarTablero(int numPlayers){
        myPlayers = new Jugador[8];
        for(int i=0;i<8;i++){
            myPlayers[i] = new Jugador("P"+(i+1));
        }
        miTurno = myPlayers[0];
        myBoard[0] = new Casilla("Blanco","Start","Start",1,0);
        myBoard[1] = new Casilla("Marron","Mediterranean Avenue","Brown1",0,60);
        myBoard[1].setRentas(2,10, 30,90,160,250,50);
        myBoard[2] = new Casilla("Blanco","Community Chest","Cchest",2,0);
        myBoard[3] = new Casilla("Marron","Baltic Avenue","Brown2",0,60);
        myBoard[3].setRentas(4,20, 60,180,320,450,50);
        myBoard[4] = new Casilla("Blanco","Impuesto sobre la renta","IncomeTax",4,0);
        myBoard[5] = new Casilla("Tren","Reading Railroad","Station1",0,200);
        myBoard[5].setRentas(0,25, 50,100,200,0,0);
        myBoard[6] = new Casilla("AzulClaro","Oriental Avenue","SkyBlue1",0,100);
        myBoard[6].setRentas(6,30, 90,270,400,550,50);
        myBoard[7] = new Casilla("Blanco","Chance Slot","ChanceSlot",3,0);
        myBoard[8] = new Casilla("AzulClaro","Vermont Avenue","SkyBlue2",0,100);
        myBoard[8].setRentas(6,30, 90,270,400,550,50);
        myBoard[9] = new Casilla("AzulClaro","Connecticut Avenue","SkyBlue3",0,120);
        myBoard[9].setRentas(8,40, 100,300,450,600,50);
        myBoard[10] = new Casilla("Blanco","La Carcel","Jail",0,0);
        myBoard[11] = new Casilla("Morado","St Charles Place","Purple1",0,140);
        myBoard[11].setRentas(10,50, 150,450,625,750,100);
        myBoard[12] = new Casilla("Service","Electric Company","ElectricService",0,150);
        myBoard[13] = new Casilla("Morado","States Avenue","Purple2",0,140);
        myBoard[13].setRentas(10,50, 150,450,625,750,100);
        myBoard[14] = new Casilla("Morado","Virginia Avenue","Purple3",0,160);
        myBoard[14].setRentas(12,60, 180,500,700,900,100);
        myBoard[15] = new Casilla("Tren","Pennsylvania Railroad","Station2",0,200);
        myBoard[15].setRentas(0,25, 50,100,200,0,0);
        myBoard[16] = new Casilla("Naranja","St James Place","Orange1",0,180);
        myBoard[16].setRentas(14,70, 200,550,700,900,100);
        myBoard[17] = myBoard[2];
        myBoard[18] = new Casilla("Naranja","Tennessee Avenue","Orange2",0,180);
        myBoard[18].setRentas(14,70, 200,550,700,950,100);
        myBoard[19] = new Casilla("Naranja","New York Avenue","Orange3",0,200);
        myBoard[19].setRentas(16,80, 220,600,800,1000,100);
        myBoard[20] = new Casilla("Blanco","Parking Lot","ParkingLot",5,0);
        myBoard[21] = new Casilla("Rojo","Kentucky Avenue","Red1",0,220);
        myBoard[21].setRentas(18,90, 250,700,875,1050,150);
        myBoard[22] = myBoard[7];
        myBoard[23] = new Casilla("Rojo","Indiana Avenue","Red2",0,220);
        myBoard[23].setRentas(18,90, 250,700,875,1050,150);
        myBoard[24] = new Casilla("Rojo","Illinois Avenue","Red3",0,240);
        myBoard[24].setRentas(20,100, 300,750,925,1100,150);
        myBoard[25] = new Casilla("Tren","B&O Railroad","Station3",0,200);
        myBoard[25].setRentas(0,25, 50,100,200,0,0);
        myBoard[26] = new Casilla("Amarillo","Atlantic Avenue","Yellow1",0,260);
        myBoard[26].setRentas(22,110, 330,800,975,1150,150);
        myBoard[27] = new Casilla("Amarillo","Ventnor Avenue","Yellow2",0,260);
        myBoard[27].setRentas(22,110, 330,800,975,1150,150);
        myBoard[28] = new Casilla("Service","Water Works","WaterService",0,150);
        myBoard[29] = new Casilla("Amarillo","Marvin Avenue","Yellow3",0,280);
        myBoard[29].setRentas(24,120, 360,850,1050,1200,150);
        myBoard[30] = new Casilla("Blanco","Vaya a la Carcel","GotoJail",6,0);
        myBoard[31] = new Casilla("Verde","Pacific Avenue","Green1",0,300);
        myBoard[31].setRentas(26,130, 390,900,1100,1275,200);
        myBoard[32] = new Casilla("Verde","North Carolina Avenue","Green2",0,300);
        myBoard[32].setRentas(26,130, 390,900,1100,1275,200);
        myBoard[33] = myBoard[2];
        myBoard[34] = new Casilla("Verde","Pennsylvania Avenue","Green3",0,320);
        myBoard[34].setRentas(28,150, 450,1000,1200,1400,200);
        myBoard[35] = new Casilla("Tren","Short Line","Station4",0,200);
        myBoard[35].setRentas(0,25, 50,100,200,0,0);
        myBoard[36] = myBoard[7];
        myBoard[37] = new Casilla("Azul","Park Place","Blue1",0,350);
        myBoard[37].setRentas(35,175, 500,1100,1300,1500,200);
        myBoard[38] = new Casilla("Blanco","Impuesto de Lujo","LuxuryTax",4,0);
        myBoard[39] = new Casilla("Azul","Boardwalk","Blue2",0,400);
        myBoard[39].setRentas(50,200, 800,1400,1700,2000,200);
    }
    
    public void inicializarCartas(){
        Chance[0] = new Tarjetas("Casualidad","Usted a sido elegido Presidente del consejo, Pague $50 a cada uno de los jugadores");
        Chance[1] = new Tarjetas("Casualidad","Paguese para los pobres un impuesto de $15");
        Chance[2] = new Tarjetas("Casualidad","Vayase directamente a la carcel, no pasa por Start ni se cobra los $200");
        Chance[3] = new Tarjetas("Casualidad","Avance hasta la estacion de tren mas cercana. si no tiene dueño, la puede comprar, si tiene propietario, pague a su dueño la cantidad correspondiente");
        Chance[4] = new Tarjetas("Casualidad","El banco le pagara un dividendo de $50");
        Chance[5] = new Tarjetas("Casualidad","Mueve su ficha hasta el servicio mas cercano. Si no tiene dueño, la puede comprar. Si tiene propietario lance los dados y pague al propietario diez veces la suma lanzada.");
        Chance[6] = new Tarjetas("Casualidad","Se vende el plazo de su inversion en la caja de ahorros. Cóbrese $150 al banco");
        Chance[7] = new Tarjetas("Casualidad","Adelantese la Kentucky Avenue. Si pasa por Start cóbrese $200");
        Community[0] = new Tarjetas("Arca Comunal","Avance hasta Start, cóbrese $200");
        Community[1] = new Tarjetas("Arca Comunal","Ha ganado el segundo lugar en un certamen de belleza, cobre $10");
        Community[2] = new Tarjetas("Arca Comunal","Apertura de la opera, cobre $50 de cada jugador para pagar por sus butacas de apertura");
        Community[3] = new Tarjetas("Arca Comunal","El banco le pagará $45 procedente de las ventas de sus acciones");
        Community[4] = new Tarjetas("Arca Comunal","Le toca un reembolso a cuenta de sus contribuciones sobre sus ingresos, cobre 20$ al banco");
        Community[5] = new Tarjetas("Arca Comunal","Su hospital le exige un pago de $100");
        Community[6] = new Tarjetas("Arca Comunal","Error del banco a favor de usted, cobrar $200");
        Community[7] = new Tarjetas("Arca Comunal","Suerte!!, Tiene un pase libre para salir de la carcel, se activara cuando sea enviado alla");
    }
    
    public void casualidad(int number, Jugador player, Jugador[] myPlayers){
        int money;
        switch(number){
            case 1:
                money = 50;
                int numPlayers = myPlayers.length-1;
                player.calcularDinero(money*numPlayers, "-");
                for(Jugador x: myPlayers){
                    if(!x.getName().equals(player.getName())){
                        x.calcularDinero(money, "+");
                    }
                }
                break;
            case 2:
                money = 15;
                player.calcularDinero(money, "-");
                break;
            case 3:
                player.setPosition(10);
                player.setIsJailed(true);
                break;
            case 4:
                boolean isTrain = false;
                int position = player.getPosition()+1;
                while(!isTrain){
                    if(myBoard[position].getColor().equals("Tren")){
                       isTrain = true; 
                    }else{
                        position++;
                    }
                }
                player.setPosition(position);
                //Falta por hacer
                break;
            case 5:
                money = 50;
                player.calcularDinero(money, "+");
                break;
            case 6:
                boolean isService = false;
                int pos = player.getPosition()+1;
                while(!isService){
                    if(myBoard[pos].getColor().equals("Service")){
                       isService = true; 
                    }else{
                        pos++;
                    }
                }
                player.setPosition(pos);
                //Falta por hacer
                break;
            case 7:
                money = 150;
                player.calcularDinero(money, "+");
                break;
            case 8:
                boolean isKentucky = false;
                int posi = player.getPosition()+1;
                while(!isKentucky){
                    if(myBoard[posi].getId().equals("Red1")){
                       isKentucky = true; 
                    }else{
                        posi++;
                    }
                }
                player.setPosition(posi);
                //Falta por hacer
                break;
        }
    }
    
    public void tirarDado(){
        Random random = new Random();
        dice1 = random.nextInt(6) + 1;
        dice2 = random.nextInt(6) + 1;
    }
    
    public void setDado(JLabel label1, JLabel label2, JLabel label3){
        label1.setText(String.valueOf(dice1));
        label1.setFont(new java.awt.Font("Consolas", 0, 48));
        label2.setText(String.valueOf(dice2));
        label1.setFont(new java.awt.Font("Consolas", 0, 48));
        label3.setText(String.valueOf(dice1+dice2));
        label1.setFont(new java.awt.Font("Consolas", 0, 48));
    }
    
    public void nextTurno(){
        this.nTurno++;
        if(this.nTurno>myPlayers.length-1){
            this.nTurno=0;
        }
        miTurno = myPlayers[nTurno];
    }
    
    public int calcularYUbicarDestino(){
        int nDestino = miTurno.getPosition()+this.dice1+this.dice2;
        if(nDestino>39){nDestino = nDestino-40;}
        miTurno.setPosition(nDestino);
        return nDestino;
    }
    
    public void moverFicha(JPanel origen, JPanel destino, JLabel ficha){
       destino.add(ficha);
       origen.remove(ficha);
    }
    
    public void comprarPropiedad(Casilla slot){
        int price = slot.getPrice();
        miTurno.calcularDinero(price, "-");
        slot.setOwner(miTurno);
    }
    
    public void pagarRenta(Jugador owner, Jugador payer, Casilla slot){
        int rent = slot.getRent();
        payer.calcularDinero(rent,"-");
        owner.calcularDinero(rent, "+");
    }
    
    public void comprarCasa(int number, Casilla slot, Jugador owner){
        int houses = slot.getNumHouses()+number;
        int cost = 0;
        switch(number){
            case 1:
                cost = slot.getHouse1();
                break;
            case 2:
                cost = slot.getHouse2();
                break;
            case 3:
                cost = slot.getHouse3();
                break;
            case 4:
                cost = slot.getHouse4();
                break;
            case 5:
                cost = slot.getHotel();
                break;
        }
        owner.calcularDinero(cost, "-");
        slot.setNumHouses(houses);
    }
    
    
}

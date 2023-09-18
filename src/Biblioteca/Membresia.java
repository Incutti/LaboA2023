package Biblioteca;

public enum Membresia {
    BRONCE(5), PLATA(15), ORO(50);

   private int cantDispo;

   private Membresia(int cantDispo){
       this.cantDispo=cantDispo;
   }

    public int getCantDispo() {
        return cantDispo;
    }

    public void setCantDispo(int cantDispo) {
        this.cantDispo = cantDispo;
    }
}

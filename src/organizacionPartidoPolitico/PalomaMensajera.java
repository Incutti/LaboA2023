package organizacionPartidoPolitico;

import Enums.Color;

public class PalomaMensajera extends Ave implements Mensajeria{
    private Boolean conoceMapa;

    public PalomaMensajera(String nombre, String especie, Color color, Boolean conoceMapa) {
        super(nombre, especie, color);
        this.conoceMapa = conoceMapa;
    }

    public Boolean getConoceMapa() {
        return conoceMapa;
    }

    public void setConoceMapa(Boolean conoceMapa) {
        this.conoceMapa = conoceMapa;
    }


    @Override
    public void mensajeApoyo(PartidoPolitico partido) {
        if(conoceMapa){
            System.out.println("Lanzando un papelito que dice: ¡Pio pio! voten por "+partido.getNombre());
        } else {
            System.out.println("No se volar :(");
        }
    }
}

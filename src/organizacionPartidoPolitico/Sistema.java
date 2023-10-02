package organizacionPartidoPolitico;

import Enums.Color;
import com.sun.xml.internal.ws.util.QNameMap;
import tiempo.Fecha;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Map;

public class Sistema {
    private HashSet<PartidoPolitico>partidoPoliticos;

    public Sistema() {
        partidoPoliticos = new HashSet<>();
    }
    public Sistema(HashSet<PartidoPolitico> partidoPoliticos) {
        this.partidoPoliticos = partidoPoliticos;
    }

    public HashSet<PartidoPolitico> getPartidoPoliticos() {
        return partidoPoliticos;
    }

    public void setPartidoPoliticos(HashSet<PartidoPolitico> partidoPoliticos) {
        this.partidoPoliticos = partidoPoliticos;
    }

    public static void main(String[] args){
        PartidoPolitico partido1=new PartidoPolitico("partido1", "direccion1",1,new HashSet<>());
        PartidoPolitico partido2=new PartidoPolitico("partido2", "direccion2",2,new HashSet<>());
        PartidoPolitico partido3=new PartidoPolitico("partido3", "direccion3",3,new HashSet<>());

        PalomaMensajera palo1=new PalomaMensajera("paloma1","especie1", Color.ROJO,true);
        PalomaMensajera palo2=new PalomaMensajera("paloma2","especie2", Color.ROJO,true);
        PalomaMensajera palo3=new PalomaMensajera("paloma3","especie3", Color.ROJO,false);

        TelefonoMovil tele1=new TelefonoMovil(1,"f1","m1",Compania.CLARO,111,true,true);
        TelefonoMovil tele2=new TelefonoMovil(2,"f2","m2",Compania.PERSONAL,222,false,true);
        TelefonoMovil tele3=new TelefonoMovil(3,"f3","m3",Compania.MOVISTAR,333,true,false);

        Trabajador traba1=new Trabajador("n1","a1",1,new Fecha(),1,1,"direc1", LocalTime.of(14,0,0),LocalTime.of(16,0,0));
        Trabajador traba2=new Trabajador("n2","a2",2,new Fecha(),2,2,"direc2", LocalTime.of(8,0,0),LocalTime.of(16,0,0));
        Trabajador traba3=new Trabajador("n3","a3",3,new Fecha(),3,3,"direc3", LocalTime.of(8,0,0),LocalTime.of(16,0,0));

        partido1.getEnviadoresMensajes().add(palo1);
        partido1.getEnviadoresMensajes().add(tele1);
        partido1.getEnviadoresMensajes().add(traba1);

        partido2.getEnviadoresMensajes().add(palo2);
        partido2.getEnviadoresMensajes().add(tele2);
        partido2.getEnviadoresMensajes().add(traba2);

        partido3.getEnviadoresMensajes().add(palo3);
        partido3.getEnviadoresMensajes().add(tele3);
        partido3.getEnviadoresMensajes().add(traba3);

        Sistema s1=new Sistema();
        s1.getPartidoPoliticos().add(partido1);
        s1.getPartidoPoliticos().add(partido2);
        s1.getPartidoPoliticos().add(partido3);

        for(PartidoPolitico partidoPolitico : s1.getPartidoPoliticos()){
            partidoPolitico.getNombre();
            partidoPolitico.hacerPolitica(partidoPolitico);
            System.out.println();
        }

    }
}

package perone.lautaro;

public class PeroneLautaro {


    public static void main(String[] args) {
        Publicaciones publi=new Publicaciones(5);
        TrayectoriaDocente trayec=new TrayectoriaDocente(5);
        
        Postulado p1=new Postulado("Lautaro",20,45);
        publi.agregarPostulante(p1);
        Postulado p2=new Postulado("Clara",10,33);                 //postulantes para la premiación de publicaciones
        publi.agregarPostulante(p2);
        Postulado p3=new Postulado("Lorenzo",30,51);
        publi.agregarPostulante(p3);
        
        Postulado p4=new Postulado("Victor", 5,43);
        trayec.agregarPostulante(p4);
        Postulado p5=new Postulado("Roberto", 5,32);                //postulantes para la premiación de trayectoria docente
        trayec.agregarPostulante(p5);
        Postulado p6=new Postulado("Claudia", 30,60);
        trayec.agregarPostulante(p6);
        
        System.out.println("Los postulantes que ganaron la premiación con más de 15 publicaciones son : "+publi.otorgarPremio(15)); //imprimo publicaciones
        
        System.out.println("Los postulantes que ganaron la premiación con más de 40 años son : "+trayec.otorgarPremio(40));         //imprimo trayectoria
    }
    
}

{9. Implemente un programa que invoque a un módulo que genere un árbol binario de
búsqueda con nombres de personas que se leen desde teclado. La lectura finaliza con el
nombre ‘ZZZ’ que no debe procesarse. También debe invocar a otro módulo que reciba el
árbol generado y un nombre, y retorne verdadero si existe dicho nombre en el árbol o falso
en caso contrario.}

program ejercicio9;
type
  cadena20=string[20];

  arbol=^nodo;

  nodo=record
     dato:cadena20;
     HI:arbol;
     HD:arbol;
  end;

  procedure crearArbol(var a:arbol);
       procedure agregarArbol(var a:arbol; nom:cadena20);
       begin
          if(a=nil)then begin
             new(a);
             a^.dato:=nom;
             a^.HI:=nil;
             a^.HD:=nil;
          end else
             if(nom<a^.dato)then agregarArbol(a^.HI,nom)
                            else agregarArbol(a^.HD,nom);
         end;
  var
    nom:cadena20;
  begin
     a:=nil;
     write('Ingrese un nombre');
     read(nom);
     while(nom<>'ZZZ')do begin
            agregarArbol(a,nom);
            write('Ingrese un nombre');
            read(nom);
     end;
  end;

  procedure buscarNombre(a:arbol; nombre:cadena20;var encontre:boolean);
  begin
      if(a=nil)then
               encontre:=false
      else if (nombre=a^.dato)then
               encontre:=true
           else
                if(nombre<a^.dato)then
                          buscarNombre(a^.HI,nombre,encontre)
                else
                          buscarNombre(a^.HD,nombre,encontre);

  end;

var
  a:arbol;
  nombre:cadena20;
  encontre:boolean;
begin
  crearArbol(a);
  write('Ingrese un nombre');
  read(nombre);
  encontre:=false;
  buscarNombre(a,nombre,encontre);
  if(encontre)then
          write('El nombre ingresado existe')
  else    write('El nombre ingresado no existe');
end.


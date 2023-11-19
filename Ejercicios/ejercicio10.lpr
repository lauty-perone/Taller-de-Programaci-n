{10. Implementar un programa que contenga:
a. Un módulo que lea información de alumnos de Taller de Programación y almacene
en una estructura de datos sólo a aquellos alumnos que posean año de ingreso posterior
al 2010. Esta estructura debe estar ordenada por legajo y debe ser eficiente para la
búsqueda por dicho criterio. De cada alumno se lee legajo, apellido, nombre, DNI y año de
ingreso.
b. Un módulo que reciba la nueva estructura e informe el nombre y apellido de
aquellos alumnos cuyo legajo sea inferior a 15853.
c. Un módulo que reciba la nueva estructura e informe el nombre y apellido de
aquellos alumnos cuyo legajo esté comprendido entre 1258 y 7692.}

program ejercicio10;

type
   cadena20=string[20];
   rango=1900..2021;

   alumno=record
       legajo:integer;
       apellido:cadena20;
       nombre:cadena20;
       DNI:integer;
       ingreso:rango;
   end;

   arbol=^nodo;

   nodo=record
        dato:alumno;
        HI:arbol;
        HD:arbol;
   end;
 procedure generarArbol(var a:arbol);

     procedure cargarArbol(var a:arbol; d:alumno);
     begin
       if(a=nil)then begin
           new(a);
           a^.dato:=d;
           a^.HI:=nil;
           a^.HD:=nil;
       end else
           if(d.legajo<a^.dato.legajo)then  cargarArbol(a^.HI,d)
                                     else cargarArbol(a^.HD,d);
     end;
   var
     d:alumno;
   begin
       a:=nil;

   end;

 var
   a:arbol;
 begin
   generarArbol(a);
   incisoB(a);
   incisoC(a);
 end;












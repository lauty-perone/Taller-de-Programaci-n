{8. Escribir un programa que:
a. Implemente un módulo que lea números enteros y los almacene en un árbol
binario de búsqueda. La lectura finaliza con el valor 0.
b. Una vez generado el árbol, realice módulos independientes para:
i. Obtener el número más grande.
ii. Obtener el número más chico.
iii. Obtener la cantidad de elementos.
iv. Informar los números en orden creciente.
v. Informar los números pares en orden decreciente.}

program ejercicio8;
type
  arbol=^nodo;

  nodo=record
     dato:integer;
     HI:arbol;
     HD:arbol;
  end;

  procedure crearArbol(var a:arbol);
      procedure agregarArbol(var a:arbol; num:integer);
      begin
           if(a=nil) then begin
                new(a); a^.dato:=num; a^.HI:=nil;a^.HD:=nil;;
           end else
               if(num<a^.dato)then agregarArbol(a^.HI,num);
                              else agregarArbol(a^.HD,num);

      end;

  var num:integer;
  begin
      read(num);
      while(num<>0)do begin
         agregarArbol(a,num);
         read(num);
      end;
  end;

  procedure maximo(a:arbol;var max:integer);
  begin
       if(a=nil)then
           max:=-1;
       else begin
            if (a^.HD = nil) then
			 max:= a^.dato
		   else
			 maximo(a^.HD,max);
       end;
  end;

 procedure minimo(a:arbol;var min:integer);
 begin
      if(a=nil)then
           min:=99999;
      else begin
           if(a^.HI=nil)then
                   min:=a^.dato;
           else
                   minimo(a^.HI,min);
      end;
 end;

 procedure cantidad(a:arbol;var cant:integer);
 begin
    if(a<>nil)then begin
         cantidad(a^.HI,cant);
         cant:=cant+1;
         cantidad(a^.HD,cant);
         cant:=cant+1;
    end;
 end;

 procedure creciente(a:arbol);
 begin
     if(a<>nil)then begin
           creciente(a^.HI);
           write(a^.dato);
           creciente(a^.HD);
   end;
 end;

 procedure paresDecreciente(a:arbol);
 begin
     if(a<>nil)then begin
            paresDecreceinte(a^.HD);
            if(a^.dato mod 2=0)then
                    write(a^.dato);
            paresDecreciente(a^.HI);
     end;
 end;

var
  a:arbol;max,min,cant:integer;
begin
    max:=-1;min:=99999; cant:=0;
  crearArbol(a);
  maximo(a,max);
  minimo(a,min);
  cantidad(a,cant);
  creciente(a);
  paresDecreciente(a);
  write(max);
  write(min);
  write(cant);
end;


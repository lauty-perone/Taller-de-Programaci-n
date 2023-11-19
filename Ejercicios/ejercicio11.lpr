{11. Un cine posee la lista de películas que proyectará durante el mes de octubre. De cada
película se conoce: código de película, código de género (1: acción, 2: aventura, 3: drama,
4: suspenso, 5: comedia, 6: bélica, 7: documental y 8: terror) y puntaje promedio otorgado
por las críticas.
Implementar un programa que contenga:
a. Un módulo que lea los datos de películas y los almacene ordenados por código de
película y agrupados por código de género, en una estructura de datos adecuada. La
lectura finaliza cuando se lee el código de película -1.
b. Un módulo que reciba la estructura generada en el punto a y retorne una
estructura de datos donde estén todas las películas almacenadas ordenadas por código de
película.}

program ejercicio11;

const
  dimF=8;
type
  rango=1..dimF;
  peli=record;
     cod:integer;
     genero:rango;
     prom:real;
  end;

  lista=^nodo;

  nodo=record;
     dato:peli;
     sig:lista;
  end;

  vector=array[1..dimF]of lista;

  procedure cargarVector(var v:vector);

       procedure leerDatos(var p:peli);
       begin
         with p do begin
              read(cod);read(genero); read(prom);
         end;
       end;

       procedure agregarLista(var l:lista;p:peli);
       var
          ant,nue,act:lista;
       begin
         new(nue); nue^.dato:=p;
         act:=l;
         ant:=l;
         while(act<>nil)and(act^.dato.cod<p.cod)do begin
               ant:=act;
               act:=act^.sig;
         end;
         if(ant=act)then l:=nue
                    else ant^.sig:=nue;
         nue^.sig:=act;
       end;

       var
          i:integer;
          p:peli;
       begin
         for i:=1 to dimF do begin
                v[i]:=nil;
                leerDatos(p);
                while(p<>-1)do begin
                       agregarLista(v[i],p);
                       leerDatos(p);
                end;
         end;
       end;

  procedure merge(var l:lista;v:vector);

     procedure minimo(v:vector; var min:peli);
     var
        i,posMin:integer;
     begin
        min.cod:=99999;
        for i:=1 to dimF do begin
               if(v[i]<>nil)and(v[i]^.dato.cod<min)then begin
                          min:=v[i]^.dato.cod;
                          posMin:=i;
               end;
        end;
        if(min.cod <> 9999)then
		 v[posMin] := v[posMin]^.sig;
     end;

  var
     min:peli;
  begin
    l:=nil;
    minimo(v,min);
    while(min.cod<>99999)do begin
           agregarAtras(l,ult,min);
           minimo(l,min);
    end;
  end;


var
  l:lista;v:vector;
begin
  cargarVector(v);
  merge(l,v);
end.



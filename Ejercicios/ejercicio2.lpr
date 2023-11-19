{2. Netflix ha publicado la lista de películas que estarán disponibles durante el mes de
diciembre de 2021. De cada película se conoce: código de película, código de género (1:
acción, 2: aventura, 3: drama, 4: suspenso, 5: comedia, 6: bélica, 7: documental y 8: terror)
y puntaje promedio otorgado por las críticas.
Implementar un programa modularizado que:
a. Lea los datos de películas y los almacene por orden de llegada y agrupados por
código de género, en una estructura de datos adecuada. La lectura finaliza cuando se lee
el código de la película -1.
b. Una vez almacenada la información, genere un vector que guarde, para cada
género, el código de película con mayor puntaje obtenido entre todas las críticas.
c. Ordene los elementos del vector generado en b) por puntaje utilizando alguno de
los dos métodos vistos en la teoría.
d. Luego de ordenar el vector, muestre el código de película con mayor puntaje y el
código de película con menor puntaje.}

program ejercicio2;

const

type
   rango=1..7;

   peli=record
      cod:integer;
      genero:rango;
      promedio:real;
   end;

   vector=array[rango]of real;

   lista=^nodo;

   nodo=record
      dato:peli;
      sig:lista;
   end;

   procedure cargarLista(var l:lista);

         procedure leerPeli(var p:peli);
         begin
           with p do begin
                read(cod);read(genero);read(promedio);
           end;
         end;

         procedure agregarAtras(var l,ult:lista;p:peli);
         var
           nue:lista;
         begin
           new(nue);
           nue^.dato:=p;
           nue^.sig:=nil;
           if(l<>nil)then
                     ult^.sig:=nue;
           else
                     l:=nue;
           ult:=nue;
         end;

   var
     p:peli;ult:lista;
   begin
     l:=nil;
     leerPeli(p);
     while(p.cod<>-1)do begin
           agregarAtras(l,ult,p);
           leerPeli(p);
     end;
   end;

   procedure generarVector(var v:vector; l:lista);

       procedure inicializar(var v:vector);
       var
          h:rango;
       begin
            for h:= rango do
                 v[h]:=-1;
       end;

   begin
        inicializar(v);
        while(l<>nil)do begin
              if(l^.dato.promedio>v[l^.dato.genero])then
                       v[l^.dato.genero]:=l^.dato.promedio;
              l:=l^.sig;
        end;
   end;

   procedure ordenarVector(var v:vector);
   var
      i,j,p:rango; item:real;
   begin
      for i:=1 to dimL-1 do begin
             p:=i;
             for j:=i+1 to dimL do
                  if (v[j]>v[p])then
                            p:=j;
             item:=v[p];
             v[p]:=v[i];
             v[i]:=item;
      end;
   end;

   procedure MayorPuntaje(v:vector);
   var
      pos:rango;max:real;
   begin
     max:=-1;
     for pos:=rango do
          if(v[pos]>max)then
                    max:=v[pos];
     writr(max);

   end;

var
  l:lista;
  v:vector;
begin
  cargarLista(l);
  generarVector(v,l);
  ordenarVector(v);
  MayorPuntaje(v);
end;


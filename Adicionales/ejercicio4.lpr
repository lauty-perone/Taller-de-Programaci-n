{4. Una agencia dedicada a la venta de autos ha organizado su stock y, dispone en papel de la
información de los autos en venta.
Implementar un programa que:
a. Genere un árbol binario de búsqueda ordenado por patente identificatoria del auto en
venta. Cada nodo del árbol debe contener patente, año de fabricación (2010..2018), la
marca y el modelo.
b. Contenga un módulo que recibe el árbol generado en a) y una marca y devuelva la
cantidad de autos de dicha marca que posee la agencia. Mostrar el resultado.
c. Contenga un módulo que reciba el árbol generado en a) y retorne una estructura con la
información de los autos agrupados por año de fabricación.
d. Contenga un módulo que reciba el árbol generado en a) y una patente y devuelva el
año de fabricación del auto con dicha patente. Mostrar el resultado.}

program ejercicio4;
const
  dimF=8;
type
  cadena10=string[10];
  subRango=2010..2018;

  auto=record
    patente:cadena10;
    año:subRango;
    marca:cadena10;
    modelo:cadena10;
  end;

  arbol=^nodo;

  nodo=record
    dato:auto;
    HI:arbol;
    HD:arbol;
  end;

  lista=^nodoLista;

  nodoLista=record
    dato:auto;
    sig:lista;
  end;

  vector=array[1..dimF]of lista;

procedure cargarArbol(var a:arbol);
  procedure leerDatos(var aut:auto);
  begin
    writeln('Escriba la patente, el año de fabricacion, la marca y el modelo del auto');
    readln(aut.patente); readln(aut.año); readln(aut.marca); readln(aut.modelo);
  end;

  procedure crearArbol(var a:arbol; aut:auto);
  begin
    if(a=nil)then begin
      new(a);
      a^.HI:=nil;
      a^.HD:=nil;
    end
    else
      if (aut.patente< a^.dato.patente)then crearArbol(a^.HI,aut);
                                     else crearArbol(a^.HD,aut);
  end;
var
  aut:auto;
begin
  a:=nil;
  leerDatos(aut);
  while(aut.patente<>'ZZZ')do begin
     crearArbol(a,aut);
     leerDatos(aut);
  end;
end;

procedure cantidadMarca(a:arbol; marcaI:cadena10; var cantA:integer);
begin
  if(a<>nil)then
    if(a^.dato.marca=marcaI)then
      cantA:=cantA+1;
  cantidadMarca(a^.HI, marcaI,cantA);
  cantidadMarca(a^.HD,marcaI,cantA);
end;

procedure cargarVector(a:arbol; var v:vector);
  procedure inicializar(var v:vector);
    var
      i:integer;
    begin
      for i:=1 to dimF do
         v[i]:=nil;
    end;

  procedure recorrerArbol(a:arbol; var v:vector);
  begin
    if(a<>nil)then begin
      cargarVector(a^.HI,v);
      v[a^.dato.año]:=a^.dato;
      cargarVector(a^.HD,v);
    end;
  end;
begin
  inicializar(v);{pone en nil las 8 listas del vector}
  recorrerArbol(a,v);
end;

procedure buscarPatente(a:arbol; patenteI:cadena10; var añoFabri:subRango);
begin
  if(a<>nil)then
    if(a^.dato.patente=patenteI)then añoFabri:=a^.dato.año;
                                else
                                  if(patenteI<a^.dato.patente)then
                                      buscarPatente(a^.HI,patenteI,añoFabri);
                                  else
                                    buscarPatente(a^.HD,patente,añoFabri);
end;

var
  a:arbol;
  marcaI:cadena10;
  cantA,patenteI:integer;
  v:vector;
  añoFabri:subRango;
begin
  cargarArbol(a);
  writeln('Escriba una marca');
  readln(marcaI);
  cantA:=0;
  cantidadMarca(a,marcaI,cantA);
  write('La cantidad de autos que son de la marca ingresada es de: ', cantA);
  cargarVector(a,v);
  writeln('Escriba la patente de un auto');
  readln(patenteI);
  buscarPatente(a,patenteI,añoFabri);
  write('El año de farbicacion del auto de la patente ingresada es: ',añoFabri);
end.




{5. Una cadena de gimnasios que tiene 5 sucursales necesita procesar las asistencias de los
clientes. Implementar un programa con:
a. Un módulo que lea la información de las asistencias realizadas en las sucursales y
genere una estructura con código de cliente, dni de cliente, fecha y cantidad de
minutos que asistió a la sucursal, agrupados por sucursal. Para cada sucursal, los
clientes deben estar ordenados por código de cliente. De cada asistencia se lee: código
de sucursal (1..5), dni del cliente, código del cliente, fecha y cantidad de minutos que
asistió. La lectura finaliza con el código de cliente -1, el cual no se procesa.
b. Un módulo que reciba la estructura generada en a) y utilizando la técnica de merge o
merge acumulador genere un árbol ordenado por dni que contenga el dni de cliente y
la cantidad total de veces que asistió a las sucursales del gimnasio.}

program ejercicio5;
const
  dimF=5;
type
  cadena20=String[20];

  subRango=1..dimF;

  asistencia=record
    codSucursal:subRango;
    codigo:integer;
    dni:integer;
    fecha:cadena20;
    cantM:integer;
  end;

  lista=^nodo;

  nodo=record
    dato:asistencia;
    sig:lista;
  end;

  vector=array[1..dimF]of lista;

  cliente=record
    dni:integer;
    cantA:integer;
  end;

  arbol=^nodoArbol;

  nodoArbol=record
    dato:cliente;
    HI:arbol;
    HD:arbol;
  end;

procedure cargarVector(var v:vector);
  procedure inicializar(var v:vector);
  var
    i:integer;
  begin
    for i:=1 to dimF do
      v[i]:=nil;
  end;

  procedure insertarOrdenado(var l:lista; a:asistencia);
  var
    nue,act,ant:lista;
  begin
    new(nue);
    nue^.dato:=a;
    act:=l;
    ant:=l;
    while(act<>nil)and(act^.dato.codigo<a.codigo)do begin
      ant:=act;
      act:=act^.sig;
    end;
    if(act=nil)then l:=nue;
               else ant^.sig:=nue;
    nue^.sig:=act;
  end;

  procedure leerDatos(var a:asistencia);
  begin
    writeln('Escriba el codSucursal, codCliente,su dni,fecha y la cantidad de minutos que asistio');
    readln(a.codSucursal); readln(a.codigo); readln(a.dni);readln(a.fecha); readln(a.cantM);
  end;
var
  a:asistencia;
begin
  inicializar(v);
  leerDatos(a);
  while(a.codigo<>-1)do begin
    insertarOrdenado(v[a.codSucursal], a);
    leerDatos(a);
  end;
end;

procedure crearArbol(var a:arbol; v:vector);

  procedure minimo(var v:vector;var dniMin:integer);
  var
    indiceMin,i:integer;
  begin
    indiceMin:=-1;
    dniMin:=9999999;
    for i:=1 to dimF do
      if(v[i]<>nil)then
        if(v[i]^.dato.dni<=dniMin)then begin
          indiceMin:=i;
          dniMin:=v[i]^.dato.dni;
        end;
    if(indiceMin<>-1)then begin
      dniMin:=v[indiceMin]^.dato.min;
      v[indiceMin]:=v[indiceMin]^.sig;
    end;
  end;

  procedure recorrerArbol(var a:arbol; dniMin:integer);
  begin
    if(a^.dato.dni=dniMin)then
           a^.dato.cantA:=a^.dato.cantA+1;
      else
        if(a=nil)then begin
          new(a);
          a^.dato.dni:=dniMin;
          a^.dato.cantA:=1;
          a^.HI:=nil; a^.HD:=nil;
        end else
            if(dniMin<a^.dato.dni)then recorrerArbol(a^.HI,dniMin);
                                  else recorrerArbol(a^.HD,dniMin);
   end;
var
  dniMin:integer;
begin
  a:=nil;
  minimo(v,dniMin);
  while(dniMin<>9999999)do begin
    recorrerArbol(a,dniMin);
    minimo(a,dniMin);
  end;
end;

var
  v:vector;
  a:arbol;
begin
  cargarVector(v);
  crearArbol(a,v);
end;



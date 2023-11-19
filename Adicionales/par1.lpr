{Se lee información acerca de las ventas de productos realizadas en las 5 sucursales de una empresa.
Cada sucursal realizó a lo sumo 200 ventas. De cada venta se conoce el código de producto, cantidad
vendida y monto total de la venta. Las ventas de cada sucursal se leen de manera consecutiva y
ordenadas por código de producto. La lectura por cada sucursal finaliza al completar las 200 ventas o
cuando se lee el código de producto -1, el cual no se procesa. Implementar un programa para que a
partir de la información leida, resuelva los siguientes ítems:

a) Utilizando la técnica de merge o merge acumulador según corresponda, generar una lista que
contenga la cantidad total vendida para cada código de producto, ordenada por código de
producto.

b) Realizar un módulo recursivo que reciba la lista generada en el punto a y retorne la cantidad de
productos para los cuales la cantidad total vendida supera las 500 unidades.}

program par1;
const
  dimF=200;

type
  venta=record
    cod:integer;
    cantV:integer;
    montoVenta:real;
  end;

  sucursal=array[1..dimF]of venta;

  vector=array[1..5]of sucursal;

  dimensiones=array[1..5]of integer;

  producto=record
    cantVendida:integer;
    codP:integer;
  end;

  lista=^nodo;

  nodo=record
     dato:producto;
     sig:lista;
  end;

 procedure inicializarD(var d:dimensiones);
  var
    i:integer;
  begin
    for i:=1 to 5 do
      d[i]:=0;
  end;

procedure cargarVector(var v:vector; var d:dimensiones);
  procedure leerDatos(var ven:venta);
  begin
    writeln('Escriba cod de producto,la cant vendida y el monto de la venta');
    readln(ven.cod);
    if(ven.cod<>-1)then begin
      readln(ven.cantV);readln(ven.montoVenta);
    end;
  end;

var
  i,j:integer;ven:venta;
begin
  for i:=1 to 5 do begin
    leerDatos(ven);
    while(ven.cod<>-1)and(d[i]<200)do begin
      d[i]:=d[i]+1;
      j:=d[i];
      v[i][j]:=ven;
      leerDatos(ven);
    end;
  end;
end;

procedure cargarLista(var l:lista; v:vector; d:dimensiones);

  procedure agregarAtras(var l,ult:lista; total,codAct:integer);
  var
    nue:lista;
  begin
    new(nue);
    nue^.dato.cantVendida:=total;
    nue^.dato.codP:=codAct;
    nue^.sig:=nil;
    if(l<>nil)then ult^.sig:=nue
              else l:=nue;
    ult:=nue;
  end;

  procedure minimo(v:vector;d:dimensiones;var cant,codMin:integer; var pos:dimensiones);
  var
    j,i,indiceMin:integer;
  begin
    codMin:=999999;
    indiceMin:=-1;
    for i:=1 to 5 do   {recorro 5 vectores}
      if(pos[i]<=d[i])then begin
         pos[i]:=pos[i]+1;
         j:=pos[i];
         if(v[i][j].cod<=codMin)then begin
           indiceMin:=i;
           codMin:=v[i][j].cod;
        end;
      end;
    if(indiceMin<>-1)then begin
      codMin:=v[indiceMin][j].cod;
      cant:=v[indiceMin][j].cantV;
    end;
  end;

var
  ult:lista;
  pos:dimensiones;   {la uso para avanzar en los vectores}
  total,cant,codAct,codMin,i:integer;
begin
  l:=nil;ult:=nil;
  inicializarD(pos);
  minimo(v,d,cant,codMin,pos);
  while(codMin<>999999)do begin
    codAct:=codMin;
    total:=0;
    while(codMin<>999999)and(codMin=codAct)do begin
      total:=total+cant;
      minimo(v,d,cant,codMin,pos);
    end;
    agregarAtras(l,ult,total,codAct);
  end;
end;

procedure recursivo(l:lista; var cantProductos:integer);
begin
  if(l<>nil)then
    if(l^.dato.cantVendida<500)then
      cantProductos:=cantProductos+1;
    recursivo(l^.sig,cantProductos);
end;

var
  d:dimensiones;
  v:vector;
  l:lista;
  cantProductos:integer;
begin
  cargarVector(v,d);
  cargarLista(l,v,d);
  cantProductos:=0;
  recursivo(l,cantProductos);
  writeln('La cantidad de productos que la cantidad vendida supera los 500 productos es: ',cantProductos);
  readln();
end.


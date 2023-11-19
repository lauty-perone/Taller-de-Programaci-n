{21) Se lee información acerca de las ventas de productos realizadas en las 5 sucursales
de una empresa. Cada sucursal realizó a lo sumo 200 ventas. De cada venta se conoce el
código de producto, cantidad vendida y monto total de la venta. Las ventas de cada
sucursal se leen de manera consecutiva y ordenadas por código de producto. La lectura
por cada sucursal finaliza al completar las 200 ventas o cuando se lee el código de
producto -1, el cual no se procesa. Implementar un programa para que a partir de la
información leída, resuelva los siguientes ítems:
a)Utilizando la técnica de merge o merge acumulador según corresponda, generar una
lista que contenga la cantidad total vendida para cada código de producto, ordenada por
código de producto. }
program VENTAS;
const
  dimF = 200;
  cantSuc = 5;

type

  venta = record
    cod: integer;
    cantVen : integer;
    montoTotal : real;
  end;

  vectorVentas = array [1..dimF] of venta;

  vectorSuc = array [1..cantSuc] of vectorVentas;
  vectorDimL = array [1.. cantSuc] of integer;

  productoLista = record
    cod : integer;
    totalVendido : integer;
  end;

  lista = ^nodo;

  nodo = record
    dato : productoLista;
    sig : lista;
  end;

procedure leerVenta(v:venta);
begin
  writeln('Ingrese código de producto, la cantidad vendida y el monto total');
  readln(v.cod);
  readln(v.cantVen);
  readln(v.montoTotal);
end;

procedure inicializarDimL(var vDimL: vectorDimL);
var
  i : integer;
begin
  for i:= 1 to cantSuc do
      vDimL [i] := 0;
end;

procedure cargarVector(var v: vectorSuc; var vDimL: vectorDimL);
var
  i: integer;
  ven : venta;
begin

end;

procedure agregarAtras(var l,ult : lista; p : productoLista);
var
  nue : lista;
begin
  new(nue);
  nue^.dato := p;
  nue^.sig := nil;
  if (l<> nil) then ult^.sig := nue;
               else l := nue;
  ult := nue;
end;

procedure minimo(v:vectorSuc, vDimL: vectorDimL ; var cantV, codMin : integer);
var
  indiceMin,i,j: integer;
begin
  indiceMin := -1;
  j:= 1;
  codMin := 9999;
  for i:= 1 to cantSuc do
      while ( j <=  vDimL[i])and (v[i][j].cod <=  codMin) do begin
                  indiceMin := j;
                  codMin := v[i][j].cod;
               end;
  if (indiceMin<>-1)then begin
        cantV := v[i][indiceMin].cantVen;
  end;
end;


procedure mergeAcumulador (v: vectorSuc ; vDimL : vectorDimL; var l:lista);
var
  ult:lista;
  p : productoLista;
  cantVendido,codAct, codMin : integer;
begin
  ult := nil;
  l := nil;
  minimo(v,vDimL,cantVendido,codMin);
  while(codMin <> -1)do begin
    codAct := codMin;
    p.totalVendido := 0;
    while (codAct = codMin)do begin
           p.totalVendido := p.totalVendido + cantVendido;
           minimo(v,vDimL,cantVendido,codMin);
    end;
    p.cod := codAct;
    agregarAtras(l,ult,p);
  end;
end;

var
  v : vectorSuc;
  vDimL : vectorDimL;
  l : lista;

begin
  inicializarDimL(vDimL);
  cargarVector(v, vDimL);
  mergeAcumulador(v, vDimL,l);
end.


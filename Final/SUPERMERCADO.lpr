program SUPERMERCADO;
const
  dias = 5;

type
  producto = record
    cod: integer;
    cantV: integer;
    codCliente : integer;
  end;

  lista =^nodo;

  nodo = record
    dato : producto;
    sig: lista;
  end;

  vector = array [1..dias] of lista;

  nuevoProducto = record
    cod: integer;
    cantTotal : integer;
  end;

  listaNueva = ^nodoNuevo;

  nodoNuevo = record
    dato : nuevoProducto;
    sig: listaNueva;
  end;

procedure leerProducto(var p:producto);
begin
  writeln('Ingrese Código de producto, la cantidad vendida y el codigo de cliente');
  readln(p.cod);
  readln(p.cantV);
  readln(p.codCliente);
end;

procedure insertarOrdenado(var l:lista, p:producto);
var
  ant,nue,act: lista;
begin
  new (nue);
  nue^.dato := p;
  act := l;
  ant := l;
  while(act<>nil)and (act^.dato.cod < p.cod)do begin
      ant :=act;
      act :=act^.sig;
  end;
  if (ant = act )then l:=nue;
                else ant^.sig:=nue;
  nue^.sig :=act;
end;

procedure cargarVector (var v:vector);
var
  i: integer;
  p:producto;
begin
  for i:= 1 to dias do
      v[i] := nil;
  for i:= 1 to dias do begin
      leerProducto(p);
      while (p.cod <> -1)do begin
          insertarOrdenado(v[i], p);
          leerProducto(p);
      end;
  end;
end;

procedure minimo(v:vector; var codMin,cant: integer);
var
  indiceMin, i : integer;
begin
  indiceMin := -1;
  codMin := 9999;
  for i:= 1 to dias do
      if (v[i]<> nil)then
         if (v[i]^.dato.cod<= codMin)then begin
                              indiceMin := i;
                              codMin := v[i]^.dato.cod;
         end;
  if (indiceMin<>-1)then begin
                       cant := v[indiceMin]^.dato.cantV;
                       codMin := v[indiceMin]^.dato.nombre;
                       v[indiceMin] := v[indiceMin]^.sig;
  end;
end;

procedure mergeAcumulador(v:vector; var lN: listaNueva);
var
  cant,codAct,codMin : integer;
  nP : nuevoProducto;
begin
  lN := nil;
  minimo(v,codMin,cant);
  while (codMin <> -1)do begin
      codAct = codMin;
      nP.cantTotal := 0;
      while (codAct = codMin)do begin
          nP.cantTotal := nP.cantTotal + cant;
          minimo(v,codMin, cant);
      end;
      nP.cod := codAct;
      insertarOrdenado(lN,nP);
  end;
end;

procedure maxPord(lN: listaNueva; var codMax: integer);
begin
  if (lN<>nil)then begin
     if (lN^.dato.cod > codMax) then
        codMax := lN^.dato.cod;
     maxPord(lN^.sig, codMax);
  end;
end;


end;
var
  v:vector;
  lN: listaNueva;
  codMax: integer;
begin
     cargarVector(v);
     mergeAcumulador(v,lN);
     codMax := -1;
     maxProd(lN, codMax);
end.


program feriaMuncipal;
const
  dimF=20;
type
puesto=1..dimF;
cadena10=String[10];

compra=record
  codCliente:integer;
  dni:integer;
  fecha:cadena10;
  monto:real;
end;

lista=^nodo;

nodo=record
  dato:compra;
  sig:lista;
end;

puestos=array[1..dimF]do lista;

clienteArbol=record
  cod:integer;
  fecha:cadena10;
  montoMax:real;
end;

arbol=^nodoArbol;

nodoArbol=record
  dato:clienteArbol;
  HI:arbol;
  HD:arbol;
end;

procedure Compras(p);
begin
end;

procedure crearArbol(p:puestos;var a:arbol);
  procedure maximo(var p:puestos; var maxMonto:real; var codMax:integer; var fechaMax:cadena10);
  var
    indiceMax,i:puesto;
  begin
    indiceMax:=-1;
    maxMonto:=-1;
    for i:=1 to dimF do
      if(p[i]<>nil)then
        if(p[i]^.dato.monto=>maxMonto)then begin
           indiceMax:=i;
           maxMonto:=p[i]^.dato.monto;
        end;
    if(indiceMax<>-1)then begin
       codMax:=p[indiceMax]^.dato.cod;
       maxMonto:=p[indiceMax]^.dato.monto;
       fechaMax:=p[indiceMax]^.dato.fecha;
       p[indiceMax]:=p[indiceMax]^.sig;
    end;
  end;

  procedure agregarArbol(var a:arbol; codMax:integer; maxMonto:real; fechaMax:cadena10);
  begin
    if(a=nil)then begin
       new(a);
       a^.dato.cod:=codMax;
       a^.dato.fecha:=fechaMax;
       a^.dato.montoMax:=maxMonto;
       a^.HI:=nil;
       a^.HD:=nil;
    end
    else
      if(codMax<a^.dato.cod)then
          agregarArbol(a^.HI,codMax,maxMonto,fechaMax);
      else
        agregarArbol(a^.HD,codMax,maxMonto,fecha);
  end;
var
  actual,dniMax,codMax:integer;
  maxMonto,monto:real;
  fechaMax:cadena10;
begin
  a:=nil;
  maximo(p,maxMonto,dniMax,fechaMax);
  while(dniMax<>-1)do begin
    actual:=dniMax;
    while(dniMax<>-1)and(dniMax=actual)do begin
      maximo(p,maxMonto,codMax,fechaMax);
    end;
    agregarArbol(a,codMax,maxMonto,fechaMax);
end;
var
  p:puestos;
  a:arbol;
begin
  Compras(p); {se dispone}
  crarArbol(p,a);
end.



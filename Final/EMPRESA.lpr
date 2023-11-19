program EMPRESA;
const
  totalH = 8;
type

  registro = record
    num: integer;
    dia: 1..31;
    mes: 1..12;
    horas: 1..totalH;
  end;

  arbol = ^nodo;

  nodo = record
    dato: registro;
    HI: arbol;
    HD: arbol;
  end;

  lista = ^nodoLista;

  nodoLista = record
    dato : registro;
    sig: lista;
  end;

procedure leerRegistro(var r:registro);
begin
  r.num:=Random(101);
  if (r.num <> 0 )then begin
    r.num:=500 + r.num;
    r.dia:=1 + Random(31);
    r.mes:= 1 + Random(12);
    r.horas:=1 + Random(8);
  end;
end;

procedure crearArbol(var a:arbol; r:registro);
begin
  if (a = nil)then begin
    new(a);
    a^.dato := r;
    a^.HI :=nil;
    a^.HD := nil;
  end;
  else if (r.num < a^.dato.num)then crearArbol(a^.HI, r);
                               else crearArbol(a^.HD,r);

end;

procedure cargarArbol(var a:arbol);
var
  r:registro;
begin
  a:= nil;
  leerRegistro(r);
  while (r.dia <> 0)do begin
    crearArbol(a,r);
    leerRegistro(r);
  end;
end;

procedure agregarAdelante(var l:lista; r:registro);
var
  nue:lista;
begin
  new(nue);
  nue^.dato:= r;
  nue^.sig:= l;
  l:= nue;
end;

procedure devolverEmpleados(a:arbol; X,Y: integer; var l:lista);
var
  r:registro;
begin
  if (a<> nil)then begin
     if (a^.dato.num >= X) and (a^.dato.num <= Y)then
        agregarAdelante(l,a^.dato);
     if (a^.dato.num>=X) and (a^.dato.num <= Y)then devolverEmpleados(a^.HI,X,Y,l);
                                               else devolverEmpleados(a^.HD,X,Y,l);

  end;
end;

procedure totalDeHoras(a:arbol; var cantH: integer);
begin
  if (a<>nil)then begin
     cantH:= cantH + a^.dato.horas;
     totalDeHoras(a^.HI,cantH);
     totalDeHoras(a^.HD,cantH);
  end;
end;

var
  a:arbol;
  X,Y, cantHoras: integer;
  l:lista;

begin
  cargarArbol(a);
  writeln('Escriba dos números de empleados el primero menor que el segundo');
  readln(X); readln(Y);
  l := nil;
  devolverEmpleados(a,X,Y,l);
  cantHoras:=0;
  totalDeHoras(a,cantHoras);
  writeln('La cantidad de horas trabajadas en total es de: ', cantHoras);
end.


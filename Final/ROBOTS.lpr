program ROBOTS;
const
  mensajes = 100;
  cantidad = 10;
  ides = 5;
type
     esquina = record
       calle : 1..mensajes;
       av: 1..mensajes;
     end;

     robot = record
       id : 1..ides;
       flores:1..cantidad;
       papeles: 1..cantidad;
       e : esquina;
     end;

     vector = array [1..mensajes]of robot;

     msj = record
       num: integer;
       cantFP: integer;           {reutilizo este registro para la lista y el arbol}
       cantEsq : integer;
     end;

     lista = ^nodo;

     nodo = record
        dato : msj;
        sig: lista;

     end;

     arbol = ^nodoArbol;

     nodoArbol = record
       HI : arbol;
       HD : arbol;
       dato : msj;
     end;

procedure leerRobot(var r:robot);
begin
  writeln('Escriba la id del robot,la cant de flores y
           'papeles que recolecto e indique en que avenida y calle');
  readln(r.id);
  readln(r.flores);
  readln(r.papeles);
  readln(r.e.av);
  readln(r.e.ca);
end;

procedure seleccion(var v:vector);
var
   i,j,p: integer; elem:robot;
begin
     for i:= 1 to 100-1 do begin
         p:=i;
         for j:=i+1 to 100 do
            if(v[j].e.calle< v[p].e.calle)then p:=j;
         elem:= v[p];
         v[i] := v[p];
         v[i] := elem;
     end;
end;

procedure cargarVector(var v:vector);
var
  i: integer;
  r:robot;
begin
   for i:= 1 to mensajes do begin
       leerRobot(r);
       v[i]:=r;
   end;
   seleccion(v);
end;

procedure agregarAdelante(var l:lista; m:msj);
var
   nue:lista;
begin
   new(nue);
   nue^.dato := m;
   nue^.sig:= l;
   l:= nue;
end;

procedure cargarLista(var l:lista; v:vector);
var
   i,act:integer;
   m : msj;
begin
     i :=1;
     l:=nil;
     while (i<mensajes)do begin
        act := v[i].e.calle;
        m.cantEsq:=0;
        m.cantFP := 0;
        while (act = v[i].e.calle)do begin
              if (v[i].flores = 0)then begin
                 m.cantEsq := m.cantEsq +1 ;
                 m.num:= v[i].calle;
                 m.cantFP:= m.cantFP + v[i].flores;
              end;
              i:= i+1;
        end;
        agregarAdelante(l,m);
     end;
end;

procedure cargarArbol(var a:arbol; v:vector; pos:integer);
begin
     if (pos < mensajes)then begin
        if (a = nil)then begin
           new(a);
           a^.HI:=nil;
           a^.HD := nil;
           a^.dato.
        end;
     end;

end;

var
  v:vector;
  a:arbol;
  l:lista;
  pos:integer;
begin
  cargarVector(v);
  cargarLista(l,v);
  pos:= 1;
  cargarArbol(a,v);
  imprimirInfo(a);
end.


{1. Una aerolínea dispone de un árbol binario de búsqueda con la información de sus
empleados. De cada empleado se conoce: Número de legajo, Dni, Categoría (1..20) y año de
ingreso a la empresa. El árbol se encuentra ordenado por número de legajo. Se solicita:

a. Implementar un módulo que reciba el árbol de empleados, número de legajo “A”,
número de legajo “B” y un número de categoría, y retorne un vector ordenado por
número de legajo. El vector debe contener el número de legajo y Dni de aquellos
empleados cuyo número de legajo se encuentra comprendido entre los números de
legajo recibidos (“A” y “B”, siendo “A” menor que “B”) y la categoría se corresponda con
la recibida por parámetro. Por norma de la empresa, cada categoría puede contar con
a lo sumo 250 empleados.

b. Implementar un módulo recursivo que reciba la información generada en “b” y retorne
el promedio de los números de Dni.}

program adicional1;
const
  dimF=250;
type


empleado=record
  legajo:integer;
  dni:integer;
  cat:1..20;
  ingreso:integer;
end;

arbol=^nodo;

nodo=record
  dato:empleado;
  HI:arbol;
  HD:arbol;
end;

nuevoDato=record
  numLeg:integer;
  numDni:integer;
end;

vector=array[1..dimF]of nuevoDato;

procedure vectorOrdenado(a: arbol;legA,legB,cat:integer; var v:vector; var dimL:integer);
   procedure agregarVector(var v:vector; var dimL:integer; leg,dni:integer);
   begin
     vector[dimL].numDni:=dni;
     vector[dimL].numLeg:=leg;
   end;

var

begin
  dimL:=0;
  if(a<>nil)then
     if(a^.dato.legajo>legA)then
        if(a^.dato.legajo<legB) then begin
         if(a^.dato.cat=cat)and(dimL<dimF)then begin
             dimL:=dimL+1;
             agregarVector(v,dimL,a^.dato.legajo,a^.dato.dni);
         end;
         vectorOrdenado(a^.HI,legA,legB,cat,v,dimL);
         vectorOrdenado(a^.HD,legA,legB,cat,v,dimL);
     end
  else
    vectorOrdenado(a^.HI,legA,legB,cat,v,dimL);
  else
  vectorOrdenado(a^.HD,legA,legB,cat,v,dimL);
end;

function promedio(v:vector,dimL:integer;var pos,suma:integer);
begin
  if(pos<dimL)then begin
    pos:=pos+1;
    suma:=suma+v[pos].dni;
    promedio(v,dimL,pos,suma);
  else
    promedio:=suma/dimL;
  end;
end;

var
  a:arbol;
  v:vector;
  legA,legB,dimL,pos,suma,cat:integer;
begin
  cargarArbol(a);{se dispone}
  writeln('Escriba un numero de legajo');
  readln(legA);
  writeln('Escriba un numero de legajo mayor al anterior');
  readln(legB);
  writeln('Escriba un numero de categoria entre 1 y 20');
  readln(cat);
  vectorOrdenado(a,legA,legB,cat,v,dimL);
  suma:=0;
  pos:=0;
  writeln('El promedio de todos los legajos que se encuentrar entre los dos ingresados es: ', promedio(v,dimL,prom,i,suma));
end;





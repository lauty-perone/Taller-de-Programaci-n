{1) Una obra social dispone de un árbol binario de búsqueda con la información de sus
afiliados. De cada afiliado se conoce: Número de afiliado, Nro de DNI, Plan (1..5) y año de
anio af la obra social. El árbol se encuentra ordenado por número de afiliado. Se
solicita:
Implementar un módulo que reciba el árbol de afiliados, Nro de DNI Num1, Nro de DNI
Num2 y un número de Plan, y retorne un vector ordenado por Nro de DNI del afiliado. El
vector debe contener el número de afiliado y DNI de aquellos afiliados cuyo Nro de DNI se
encuentra comprendido entre Num1 y Num2 (siendo Num1 menor que Num2) y el Plan se
corresponda con el recibido por parámetro. Por norma de la obra social, cada Plan puede
contar con af lo sumo 500 afiliados. }
program AFILIADOS;
const
  dimF = 500;
  NroPlan = 5
type

  planSubRango = 1..NroPlan;

  afiliado = record
    num :integer;
    dni : integer;
    plan : planSubRango;
    anio : integer;
  end;

  arbol = ^nodo;

  nodo = record
    hi : arbol;
    hd : arbol;
    dato : afiliado;
  end;

  afiliadoVector = record
    num : integer;
    dni: integer;
    plan : planSubRango;
  end;

  vector = array [1..dimF]of afiliadoVector;

procedure cargarArbol(var a:arbol);
var
begin
end;

procedure seleccion(var v:vector; var dimL: integer);
var
  i,j,p: integer; item: afiliadoVector;
begin
  for i:= 1 to dimL-1 do begin
    p:=i;
    for j:= i+1 to dimL do
        if v[j] < v[p] then p:=j;
    item := v[p];
    v[p] := v[i];
    v[i] := item;
  end;
end;

procedure crearVectorOrdenado(a:arbol; Num1,Num2: integer; numPlan: planSubRango; var v:vector; var dimL:integer);
var
  a : afiliadoVector;
  i: integer;
begin
  if (a <> nil) and (dimL<dimF) then begin
    crearVectorOrdenado(a^.hi, Num1,Num2,numPlan,v,dimL);
    if (a^.dato.dni => Num1) and  (a^.dato.dni <= Num2) and (a^.dato.plan = numPlan)then begin
      a.num := a^.dato.num;
      a.dni := a^.dato.dni;
      dimL:= dimL +1;
      v[dimL] := a;
    end;
    crearVectorOrdenado(a^.hd, Num1,Num2,numPlan,v,dimL);
  end else
      seleccion(v,dimL);

end;

var
  a:arbol;
  Num1,Num2, numPlan, dimL: integer;
  v:vector;
begin
  cargarArbol(a); {se dispone}
  writeln ('Ingrese dos dni, el segundo mayor al ingresado posteriormente');
  readln(Num1, Num2);
  writeln('Ingrese un número de plan');
  readln(numPlan);
  dimL:= 0;
  crearVectorOrdenado(a,Num1,Num2,numPlan,v);
end.


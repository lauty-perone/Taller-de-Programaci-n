program OBRASOCIAL;
const
  planes = 15;
  cantAfiliados = 300;

type

   afiliado = record
     num : integer;
     dni: integer;
     plan : 1..planes;
     anio : integer;
   end;

   afiliadoVector = record
     num: integer;
     dni: integer;
   end;

   arbol =^nodo;

   nodo = record
     HI : arbol;
     HD : arbol;
     dato : afiliado;
   end;

   vector = array [1..planes] of afiliadoVector;

procedure recursion(a:arbol; var v:vector; num1,num2,numPlan: integer; var dimL: integer);
begin
  if (a<> nil)then begin
    if (a^.dato.dni > num1)and (a^.dato.dni < num2) and (a^.dato.plan = numPlan)then
       dimL :=dimL +1;
       v[dimL].dni:= a^.dato.dni;
       v[dimL].num:=a^.dato.num;
  end;
  recursion(a^.HI,v,num1,num2,numPlan,dimL);
  recursion(a^.HD,v,num1,num2,numPlan,dimL);
end;

procedure seleccion(var v:vector; dimL:integer);
var
  i,j,p:integer; elemento:afiliadoVector;
begin
  for i:=1 to dimL - 1 do begin
    p := i;
    for j:= i+1 to dimlL do
        if(v[j]< v[p])then p:=j;
    elemento := v[p];
    v[p]:=v[i];
    v[i]:=elemento;
  end;
end;


procedure procesarArbol(a:arbol; var v:vector; num1,num2,numPlan: integer; var dimL:integer);
begin
  dimL := 0;
  recursion(a,v,num1,num2,numPlan,dimL);
  seleccion(v,dimL);
end;

var
  a:arbol;
  num1,num2,numPlan:; dimL:integer;
  v:vector;

begin
  cargarArbol(a);  {se dispone}
  writeln('Escriba dos números de dni');
  readln(num1); readln(num2);
  writeln('Escriba el número de plan')
  readln(numPlan);
  procesarArbol(a,v,num1,num2,numPlan,dimL);

end.


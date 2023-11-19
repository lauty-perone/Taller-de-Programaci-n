{3. El administrador de un edificio de oficinas, cuenta en papel, con la información del pago de
las expensas de dichas oficinas.
Implementar un programa que:
a. Genere un vector, sin orden, con a lo sumo las 300 oficinas que administra. De cada
oficina se ingresa código de identificación, DNI del propietario y valor de la expensa. La
lectura finaliza cuando llega el código de identificación -1.
b. Ordene el vector, aplicando alguno de los métodos vistos en la teoría, para obtener el
vector ordenado por código de identificación de la oficina.
c. Realice una búsqueda dicotómica que recibe el vector generado en b) y un código de
identificación de oficina y retorne si dicho código está en el vector. En el caso de
encontrarlo, se debe informar el DNI del propietario y en caso contrario informar que
el código buscado no existe.}
program ejercicio3;
const
  dimF=300;

type

  oficina=record
    cod:integer;
    dni:integer;
    valor:real;
  end;

  vector=array[1..dimF]of oficina;
procedure cargarVector(var v:vector; var dimL:integer);
  procedure leerDatos(var o:oficina);
  begin
    write('Escriba el codigo de identificacion de la oficina, el dni del propietari y el valor de la expensa');
    readln(o.cod); readln(o.dni); readln(o.valor);
  end;

var
  o:oficina;
begin
  dimL:=0;
  leerDatos(o);
  while(o.cod<>-1)and(dimL<dimF)do begin
    dimL:=dimL+1;
    v[dimL]:=o;
    leerDatos(0);
  end;
end;

procedure ordenarVector(var v:vector; dimL:integer);
var
  item:oficina;
  j,i,p:integer;
begin
  for i:=1 to dimL-1 do begin
    p:=i;
    for j:=i+1 to dimL do
      if(v[j].cod<v[i].cod)then
         p:=j;
      item:=v[p];
      v[p]:=v[i];
      v[i]:=item;
    end;
  end;

procedure buscarCod(v:vector; dimL:integer;codI:integer; var dniI:integer; var existe:boolean);
var
  i,pri,ult,medio:integer;
begin
  existe:=false;
  i:=0;
  pri:=1;
  ult:=dimL;
  medio:=(pri+ult)div 2;
  while(pri<=ult)and(codI<>v[medio])do begin
     if(codI<v[medio])then ult:=medio-1;
                      else pri:=medio+1;
     medio:=(pri+ult)div 2;
  end;
  if(pri<=ult)then i:=medio;
  if(v[i]=codI)then existe:=true;
end;

var
  v:vector;
  dimL,codI,dniI:integer;
begin
  cargarVector(v,dimL);
  ordenarVector(v,dimL);
  writeln('Ingrese el codigo de un propietario');
  readln(codI);
  buscarCod(v,dimL,codI,dniI,existe);
  if(existe)then
    write('El codigo ingresado existe y el dni del propietario es: ', dniI);
  else
    write('El codigo ingresado no existe');
  readln();
end.


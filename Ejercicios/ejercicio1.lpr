{1. El administrador de un edificio de oficinas cuenta, en papel, con la información del pago de
las expensas de dichas oficinas.
Implementar un programa modularizado que:
a. Genere un vector, sin orden, con a lo sumo las 300 oficinas que administra. De
cada oficina se ingresa el código de identificación, DNI del propietario y valor de la
expensa. La lectura finaliza cuando se ingresa el código de identificación -1, el cual no se
procesa.
b. Ordene el vector, aplicando el método de inserción, por código de identificación
de la oficina.
c. Ordene el vector aplicando el método de selección, por código de identificación
de la oficina.
}

program ejercicio1;
const
  dimF=300;

type

  datos=record
     cod:integer;
     DNI:integer;
     valor:real;
  end;

  vector=array[1..dimF]of datos;

procedure cargarVector(var v:vector; var dimL:integer);
      procedure leerDatos(var d:datos);
      begin
         with d do begin
            read(cod); read(DNI); read(valor);
         end;
      end;
var
   d:datos;
begin
  dimL:=1;
  leerDatos(d);
  while(d.DNI<>-1)and (dimL<dimF)do begin
      v[dimL]:=d;
      dimL:=dimL+1;
  end;
end;

procedure seleccion(var v:vector; dimL:integer);
var
   i,j,p:integer; item:datos;
 begin
         for i:=1 to dimL-1 do begin
              p:=i;
              for j:=i+1 to dimL do
                    if (v[j].cod<v[p].cod)then
                            p:=j;
              item:=v[p];
              v[p]:=v[i];
              v[i]:=item;
         end;
 end;

procedure insercion(var v:vector; dimL:integer);
var
   i,j,p:integer;actual:datos;
begin
      for i:=2 to dimnL do begin
           actual:=v[i];
           j:=i-1;
           while(j>0)and (v[j].cod>actual.cod)do begin
                 v[j+1]:=v[j];
                 j:=j-1;
           end;
           v[j+1]:=actual;
      end;
end;

var
  v:vector;
  dimL:integer;



begin
   cargarVector(v,dimL);
   insercion(v,dimL);
   seleccion(v,dimL);
end;


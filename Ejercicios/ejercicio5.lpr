{5. Escribir un programa que:
a. Implemente un módulo que genere un vector de 20 números enteros.
b. Implemente un módulo recursivo que devuelva el máximo valor del vector.
c. Implementar un módulo recursivo que devuelva la suma de los valores contenidos
en el vector.
}

program ejercicio5;
const
  dimF=20;

type
  vector=array[1..dimF]of integer;

procedure cargarVector(var v:vector);
var
  i,num:integer;
begin
  for i:=1 to dimF do begin
      read(num);
      v[i]:=num;
  end;
end;

procedure maximoRecursivo(v:vector; var max:integer;pos:integer);
begin
  if(pos<dimF)then begin
       if(v[pos]>max)then
           max:=v[pos];
       pos:=pos+1;
       maximoRecursivo(v,max,pos);
  end;
end;

procedure totalRecursivo(v:vector; var suma:integer; pos:integer);
begin
     if(pos<dimF)then begin
          suma:=suma+v[pos];
          pos:=pos+1;
          totalRecursivo(v,suma,pos);
     end;
end;

var
  v:vector;
  maximo,suma,pos:integer;
begin
  max:=-1;
  suma:=0;
  cargarVector(v);
  pos:=1;
  maximoRecursivo(v,max,pos);
  totalRecursivo(v,suma,pos);
  write(max,suma);
end;

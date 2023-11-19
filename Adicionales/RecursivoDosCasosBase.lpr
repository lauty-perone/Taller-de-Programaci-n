{Plantee una solucion recursiva donde tiene 50 pesos y quiere llenar una botella de 10 litro con botellas de agua de 1 litro donde cada botella
sale 10 pesos ,
e indique si la botella se lleno o se quedo sin plata}
program RecursivoDosCasosBase;

procedure calcular(var plata:integer;tam:integer;var act:integer);
begin
  if(act<>tam)and(plata>0)then begin
      act:=act+ 1;
      plata:=plata-10;
      calcular(plata,tam,act);
  end;
end;

var
  act:integer;
  tam,plata:integer;

begin
  act:=0;
  writeln ('Escriba la plata que posee y el tamaño de la botella en litros');
  readln(plata);readln(tam);
  calcular(plata,tam,act);
  if(act=tam)then
    write('La botella se lleno correctamente')
    else
      write('La botella no se lleno porque se quedo sin plata, la botella se lleno hasta: ', act , ' litros');
  readln();
End.

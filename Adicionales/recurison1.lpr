program recurison1;

procedure calcularFacSum(var num,fac,tot:integer);
begin
  if(num<>0)then begin
    fac:=fac * num;
    tot:=tot+num;
    num:=num-1;
    calcularFacSum(num,fac,tot);
  end;
end;

var
  num, tot,fac:integer;
begin
  writeln ('Escriba un numero y a continuacion se mostrara su factorial y la suma de todos sus anteriores inclusive');
  readln(num);
  fac:=1;
  tot:=0;
  calcularFacSum(num,fac,tot);
  writeln('Su factorial es: ',fac);
  writeln('La suma de todos sus anteriores es: ', tot);
  readln();
End.

procedure seleccion(var v:vector; dimL:integer);
var
  i,p,j:integer;
  item:elemento;
begin
  for i:= 1 to dimL-1 do begin
    p:=i;
    for j:=i+1 to dimL do
        if(v[j]<v[p])then  p:=j;
    item:=v[p];
    v[p]:=v[i];
    v[i]:=item;
  end;
end;

procedure insercion(var v:vector; dimL:integer);
var
  i,j:integer;
  item:elemento;
begin
  for i:= 2 to dimL do begin
    item:=v[i];
    j:=i-1;
    while(j>0)and(v[j]>item)do begin
      v[j+1]:=v[j];
      j:=j-1;
    end;
    v[j+1]:=item;
  end;
end;




















program final;

procedure agregarLista(num:integer; var l:lista);
var
  nue:lista;
begin
  new(nue);
  nue^.dato:=num;
  nue^.sig:=l;
  l:=nue;
end;

procedure devolverLista(var v:vector; var l:lista);
var
  i:integer;
begin
  l:=nil;
  for i:=1 to 1000 do begin
    agregarLista(v[i],l);
  end;
end;

procedure borrarOcurrencias(var v:vector; num:integer;var exito:boolean;var dimL:integer);
var
  i,j:integer;

begin
  exito:=false;
  i:=1;
  while(i<=dimL)and(num<>v[i])do begin
     i:=i+1;
  end;
  if(v[i]=num)then
      while(num=v[i])do begin
         for j:=(1 to i+1) do begin
            v[j-1]:=v[j];
         end;
         i:=i+1;
         dimL:=dimL-1;
      end;
 end;

procedure insertarOrdenado(var l:lista; num:integer);
var
  ant,nue,act:lista;
begin
  new(nue);
  nue^.dato:=num;
  act:=l; ant:=l;
  while(act<>nil)and(act^.dato>num)do begin
     ant:=act;
     act:=act^.sig;

  end;
  if(ant=act)then l:=nue;
             else ant^.sig:=nue;
  nue^.sig:=act;
end;

procedure listaAscendente(var l:lista; v:vector);
var
  num,i:integer;
begin
   l:=nil;
   for i:=1 to 100 do begin
      if(v[i]mod 2<> 0)then
          insertarOrdenado(l,v[i]);
   end;
end;

procedure vectorModificado(var v:vector;var dimL:integer; l:lista);
var
  i:integer;
begin
  i:=1;
  while(l<>nil)do begin
      if(l^.dato mod 3=0)and(dimL<dimF)then begin
          v[dimL]:=l^.dato;
          dimL:=dimL+1;
      end;
      l:=l^.sig;
  end;
end;

procedure vectorImpar(var vImpar:vector; v:vector);
var
  i:integer;
begin
  for i:=1 to 100 do begin
     if(i mod 2<> 0)then
         vImpar[i]:=v[i];
  end;
end;




































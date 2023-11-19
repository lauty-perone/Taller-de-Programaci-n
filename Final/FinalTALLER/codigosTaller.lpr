procedure ordenar(var v:vector; dimL: indice);
var
  i,j,p:indice;
  item: integer;
begin
  for i:=1 to dimL-1 do begin
    p:=i;
    for j:= i+1 to dimL do
    if (v[j]< v[p])then p:=j;
    item := v[p];
    v[p]:= v[i];
    v[i]:=item;
  end;
end;

procedure insertionSort(var v:vector; dimL: indice);
var
  i,j:indice;
  item:integer;
begin
  for i:=2 to dimL do begin
    item := v[i];
    j:= i-1;
    while (j>0)and (v[j]>item)do begin
      v[j+1] := v[j];
      j :=j-1;
    end;
    v[j+1]:= item;
  end;
end;

{MERGE CON DOS}
procedure agregarAtras(var enuevo,ult:lista; min: string);
var
  nue: lista;
begin
  new(nue);
  nue^.datos := min;
  nue^.sig:= nil;
  if (enuevo<>nil)then ult^.sig := nue;
                       else
                           enuevo := nue;
end;

procedure merge(e1,e2:lista; var enuevo:lista);
var
  min:string;
begin
  enuevo := nil;
  minimo(e1,e1,min);
  while(min<>'ZZZ')do begin
    agregarAtras(enuevo,min);
    minimo(e1,e2,min);
  end;
end;

procedure minimo(e1,e2:lista; var min:string);
begin
  min := 'ZZZ';
  if(e1<>nil)and (e2<>nil)then
                 if (e1^.dato <= e2^.dato)then begin
                   min:= e1^.dato;
                   e1:=e1^.sig;
                 end;
                 else begin
                   min:= e2^.dato;
                   e2:= e2^.sig;
                 end
  else
      if (e1<>nil)and (e2 = nil)then begin
         min := e1^.dato;
         e1:= e1^.sig;
      end else
          if (e1 = nil)and (e2 = nil)then begin
             min := e2^.dato;
             e2:= e2^.sig;
          end;
end;

{MERGE CON 2 O MAS}

procedure merge(todos: estantes; var enuevo:lista);
var
  actual:string;
  minNombre: string;
  monto, montoTotal: real;
begin
     enuevo :=lista;
     minimo(todos, minNombre, monto);
     while(minNombre<>'ZZZ') do begin
       actual := minNombre;
       montoTotal := 0;
       while (minNombre<>'ZZZ')and (minNombre = actual) do begin
             montoTotal := montoTotal + monto;
             minimo(todos, minNombre, monto);
       end;
       agregarAtras(enuevo, actual,montoTotal);
     end;
end;

procedure minimo(var todos: estantes; var nomMin: string; var monto: real);
var
  indiceMin,i:integer;
begin
  indiceMin := -1;
  nomMin := 'ZZZ';
  for i:= 1 to cantEstantes do
      if (todos[i]<>nil)then
                     if (todos[i]^.dato.nombre<= nomMin)do begin
                                                 indiceMin :=i;
                                                 nomMin := todos[i]^.dato.nombre;
                     end;
  if (indiceMin<>-1)then begin
                         nomMin := todos[indiceMin]^.dato.nombre;
                         monto := todos[indiceMin]^.dato.monto;
                         todos[indiceMin]:= todos[indiceMin]^.sig;
  end;
end;



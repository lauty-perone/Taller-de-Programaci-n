program project1;
type
  productoPedido=record
    cod:integer;
    cant:integer;
  end;

  lista=^nodo;

  nodo=record
    dato:productoPedido;
    sig:lista;
  end;

  pedido=record
    codP:integer;
    DNI:integer;
    listaProd:lista;
  end;

  listaPedidos=^nodoPedido;

  nodoPedido=record
    dato:pedido;
    sig:listaPedidos;
  end;

  arbol=^nodoArbol;

  nodoArbol=record
    dato:productoPedido;
    HI:arbol;
    HD:arbol;
  end;

  listaNue=^nodoNue;

  nodoNue=record
    cod:integer;
    sig:listaNue;
  end;
procedure cargarLista(var l:listaPedidos);
begin

end;

procedure cargarArbol(var a:arbol);
begin

end;

procedure actualizarStock(l:listaPedidos;var a:arbol);
  procedure agregarArbol(var a:arbol; p:productoPedido);
  begin
    if(a=nil)then begin
      new(a);
      nue^.dato.cod:=p.cod;
      nue^.dato.cant:=0;
      nue^.HD:=nil;
      nue^.HI:=nil;
    end
    else
         if(p.cod=a^.dato.cod)then
               a^.dato.cant:=a^.dato.cant-p.cant;
         else
            if(p.cod<a^.dato.cod)then
                agregarArbol(a^.HI,p)
         else
           agregarArbol(a^.HD,p);

  end;
  var
    lprod:lista;
  begin
    if(l<>nil)then begin
        lprod:=l^.dato.listaProd;
        while(lprod<>nil)do begin
          agregarArbol(a,lprod^.dato);
          lprod:=lprod^.sig;
        end;
        actualizarStock(l^.sig,a);

    end;
  end;

procedure devolverLista(var lisNue:listaNue; a:arbol; cod1,cod2:integer);
  procedure agregarLista(var lisNue,num:integer);
  var
    nue:listaNue;
  begin
    new(nue);
    nue^.cod:=num;
    nue^.sig:=lisNue;
    lisNue:=nue;
  end;

begin
  if(a<>nil)then
      if(a^.dato.cod=>cod1)then begin
          if(a^.dato.cod<=cod2)then begin
                if(a^.dato.cant=0)then
                   agregarLista(lisNue,a^.dato.cod);
         devolverLista(lisNue,a^.HI,cod1,cod2);
         devolverLista(lisNue,a^.HD,cod1,cod2);
         end
         else
            devolverLista(lisNue,a^.HI,cod1,cod2);
     end
     else
        devolverLista(lisNue,a^.HD,cod1,cod2);
end;

var
  l:listaPedidos;
  a:arbol;
  cod1,cod2:integer;
  lisNue:listaNue;
begin
  cargarLista(l); {se dispone}
  cargarArbol(a); {se dispone}

  actualizarStock(l,a);

  writeln('Escriba dos códigos de producto');

  readln(cod1); readln(cod2);
  lisNue:=nil;
  devolverLista(lisNue,a,cod1,cod2);



end;


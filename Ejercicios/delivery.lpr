{Un delivery dispone de una lista de los pedidos realizados. De cada pedido se tiene código
del pedido, DNI del cliente y la lista de los combos pedidos (código de combo y cantidad).
Además se dispone de un árbol de combos. De cada combo se tiene código, descripción y
stock. El árbol está ordenado por código de combo.
Implemente un programa con:
a) Un módulo recursivo que recorra la lista de pedidos actualizando el stock de los
combos. En el caso que el código de combo no exista, debe incorporarse al árbol
con stock en cero.
b) Un módulo que reciba el árbol de combos y un código de combo y retorne una lista
con los códigos de los combos con stock 10 para los códigos mayores al código
recibido}

program delivery;
type
  combo=record
    cod:integer;
    cant:integer;
  end;

  listaCombo=^nodoCombo;

  nodoCombo=record
    dato:combo;
    sig:listaCombo;
  end;

  pedido=record
    cod:integer;
    dni:integer;
    lCombo:listaCombo;
  end;

  listaPedidos=^nodo;

  nodo=record
    dato:pedido;
    sig:listaPedidos;
  end;

  cadena10=String[10];

  comboArbol=record
    cod:integer;
    descripcion:cadena10;
    stock:integer;
  end;

  arbol=^nodoArbol;

  nodoArbol=record
    dato:comboArbol;
    HI:arbol;
    HD:arbol;
  end;

  listaCodigos=^nodoCodigos;

  nodoCodigos=record
    cod:integer;
    sig:listaCodigos;
  end;

procedure cargarLista(l);
begin

end;

procedure cargarArbol(a);
begin

end;

procedure actualizarStock(var a:arbol; l:listaPedidos);
  procedure agregarArbol(var a:arbol; c:combo);
  begin
    if(a=nil)then begin
      new(a);
      a^.dato.cod:=c.cod;
      a^.dato.descripcion:='';
      a^.dato.stock:=0;
      a^.HI:=nil;
      a^.HD:=nil;
    end
    else
      if(a^.dato.cod=c.cod)then
          a^.dato.stock:=a^.dato.stock-c.cant;
      else
        if(a^.dato.cod>c.cod)then
            agregarArbol(a^.HI,c);
        else
          agregarArbol(a^.HD,c);
    end;
var
  lCom:=listaCombo;
begin
  if(l<>nil)then begin
    lCom:=l^.dato.lCombo;
    while(lCom<>nil)do begin
      agregarArbol(a,lCom^.dato);
      lCom:=lCom^.sig;
    end;
    actualizarStock(a,l^.sig);
  end;
end;

procedure retornarListaCodigos(a:arbol; cod:integer; var lCodigo:listaCodigos);
  procedure agregarAdelante(var lCodigo:listaCodigos;cod:integer);
  var
    nue:listaCodigos;
  begin
    new(nue);
    nue^.cod:=cod;
    nue^.sig:=lCodigo;
    lCodigo:=nue;
  end;
  begin
    if(a<>nil)then
      if(a^.dato.cod =>cod)then begin
        if(a^.dato.stock=10)then
          agregarAdelante(lCodigo,a^.dato.cod);
        retornarListaCodigos(a^.HI,cod,lCodigo);
        retornarListaCodigos(a^.HD,cod,lCodigo);
      end
      else
        retornarListaCodigos(a^.HD,cod,lCodigo);
  end;

var
  l:listaPedidos;
  a:arbol;
  cod:integer;
  lCodigo:listaCodigos;
begin
  cargarLista(l);{se dispone}
  cargarArbol(a); {se dispone}

  actualizarStock(a,l);

  writeln('Escriba un código de combo');
  readln(cod);
  lCodigo:=nil;
  retornarListaCodigos(a,cod,lCodigo);
end.



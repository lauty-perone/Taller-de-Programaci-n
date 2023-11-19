program PIZZERIA;
type
  cadena10 = string[10];

  listaPedido = record
    fecha: cadena10;
    monto: real;
  end;

  lista =^nodo;

  nodo = record
    dato : listaPedido;
    sig : lista;
  end;

  pedido = record
    dni: integer;
    nombre: cadena10;
    l : lista;
  end;

  arbol = ^nodoArbol;

  nodoArbol = record
    dato : pedido;
    HI : arbol;
    HD : arbol;
  end;

procedure crearArbol(var a:arbol; p:pedido);
begin
  if (a= nil)then begin
    a^.dato := p;
    a^.HI := nil;
    a^.HD := nil;
  end;
  else
      if (p.dni< a^.dato.dni)then crearArbol(a^.HI, p);
                             else crearArbol(a^.HD, p);

end;

procedure agregarAdelante(var l:lista; p:listaPedido);
var
  nue:lista;
begin
  new(nue);
  nue^.dato :=p;
  nue^.sig:=l;
  l:=nue;
end;

procedure leerPedido(var p:pedido);
var
  infoP: listaPedido;

begin
  writeln('Ingrese el DNI del cliente y su nombre');
  readln(p.dni);
  readln(p.nombre);
  p.l:=nil;
  writeln('Ingrese el monto de un pedido y la fecha');
  readln(infoP.monto);
  while (monto <> 0)do begin
     readln(infoP.fecha);
     agregarAdelante(p.l, infoP);
     writeln('Ingrese el monto de un pedido y la fecha');
     readln(infoP.monto);
  end;
  writeln('Ha finalizado el ingreso de datos del cliente con dni: ',p.nombre,p.dni);
end;

procedure cargarArbol(var a:arbol);
var
  p:pedido;
begin
  a:= nil;
  leerPedido(p);
  while (p.l^.dato.monto <> 0) do begin
    crearArbol(a,p);
    leerPedido(p);
  end;
end;

function recorrerLista(l:lista, fecha):boolean;
begin
     while (l<>nil)do begin
       if (l^.dato.fecha = fecha)then
          recorrerLista:= true;
       l:=l^.sig;
     end;
     recorrerLista := false;
end;

procedure totalFecha(a:arbol; var cantCli: integer; fecha:cadena10);
begin
  if (a<>nil)then begin
    if (recorrerLista(a^.dato.l,fecha))
       cantCli:=cantCli +1;
    totalFecha(a^.HI,cantCli,fecha);
    totalFecha(a^.HD,cantCli,fecha);
  end;
end;

procedure recorrerLista2(l:lista; var totalAbonado: real; var totalPedidos: integer);
begin
     while (l<>nil)do begin
       totalPedidos:=totalPedidos+1;
       totalAbonado:= totalAbonado + l^.dato.monto;
       l:= l^.sig;
     end;
end;

procedure totalCliente(a:arbol; var totalAbonado: real; var totalPedidos: integer; dni:integer);
begin
  if(a<>nil)then begin
         if (dni = a^.dato.dni)then
              recorrerLista2(a^.dato.l, totalAbonado, totalPedidos);
         else
             if (dni < a^.dato.dni)then totalCliente(a^.HI, totalAbonado, totalPedidos,dni);
                                   else totalCliente(a^.HD, totalAbonado, totalPedidos,dni)
  end;
end;
var
  cantCli, totalPedidos, dni : integer;
  totalAbonado: real;
  fecha: cadena10;
  a:arbol;

begin
  cargarArbol(a);
  writeln('Ingrese una fecha');
  readln(fecha);
  cantCli:=0;
  totalFecha (a,cantCli,fecha);
  writeln('La cantidad de clientes que realizaron pedidos en la fecha ingresada fueron: ', cantCli);
  writeln('Ingrese un DNI');
  readln(dni);
  totalAbonado :=0;
  totalPedidos :=0;
  totalCliente(a,totalAbonado,totalPedidos,dni);
  writeln('El total abonado y el total de pedidos del cliente del dni ingresado es: ', totalAbonado, totalPedidos);
  writeln();
end.


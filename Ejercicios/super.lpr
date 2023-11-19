{Una cadena de supermercados necesita procesar su facturacion para enviar un regalo de fin de año a sus mejores
clientes.
Entregara para el mes de octubre un premio diario al cliente que hizo la compra de mayor monto.

Se dispone de una estructura que almacena las ventas de octubre agrupadas por numero de sucursal(de 1 a 20).
Para cada sucursal, las ventas se
encuentran ordenadas por dia del mes. Por cada venta se conoce el dia,numero de factura, dni del cliente y monto.

Ademas se dispone de un vector desordenado con la informacion personal de 5000 clientes.De cada cliente se
conoce el dni,el email y telefono

Implemente un program que:

Ordene por dni, los elementos del vector de clientes que se dispone.Este ordenamiento es necesario para
obtener informacion del cliente
en el siguiente inciso con mayor eficiencia.

Reciba la estructura con las ventas y, usando la tecnica de merge, imprima en pantalla para cada dia del
mes, el numero de factura ganadora,
el dni y el telefono del cliente correspondiente.Por cada dia,la factura ganadora es aquella con mayor monto.
La busqueda del cliente en el vector de informacion personal debe implementarse de formar recursiva.
Si el clinte no esta en el vector se debera informar el dia y "Premio vacante"

NOTA: En cada sucursal se pueden haber realizado mas de una venta en el mismo dia}

program super;
const
  sucursales=20;
  dimF=5000;
type
  cadena20=String[20];

  venta=record
    dia:integer;
    num:integer;
    dni:integer;
    monto:real;
  end;

  lista=^nodo;

  nodo=record
    dato:venta;
    sig:lista;
  end;

  vectorSucursales=array[1..sucursales]of lista;

  cliente=record
    dni:integer;
    mail:cadena20;
    telefono:integer;
  end;

  vectorClientes=array[1..dimF]of cliente;

procedure cargarSucursales(var vSuc:vectorSucursales);
begin

end;

procedure cargarClientes(var vCli:vectorClientes);
begin

end;

procedure ordenarClientes(var vCli:vectorClientes);
var
  i,p,j:integer;
  item:cliente;
begin
  for i:=1 to 5000-1 do begin
    p:=i;
    for j:=i+1 to 5000 do
        if(v[j].dni<v[p].dni)then p:=j;
    item:=v[p];
    v[p]:=v[i];
    v[i]:=item;
  end;
end;

procedure merge(vSuc:vectorSucursales; vCli:vectorClientes);

  procedure maximo(var vSuc:vectorSucursales; var maxDia,dni,numFac:integer; var montoVenta:real);
  var
    i,indiceMax,actual,diaLista:integer;
    totalMonto,maxMonto:real;
  begin
    maxDia:=-1;
    indiceMax:=-1;
    maxMonto:=-1;
    for i:=1 to sucursales do begin
      totalMonto:=0;                                   {falta por resolver}
      diaLista:=vSuc[i]^.dato.dia;
      if(vSuc[i]^.dato.dia=diaLista)then begin
        while(vSuc[i]<>nil)and(vSuc[i]^.dato.dia=actualDia)do begin
          totalMonto:=totalMonto+ vSuc[i]^.dato.monto;
          vSuc[i]:=vSuc[i]^.sig;                     {recorro la lista sumando los montos}
        end;
        if(vSuc[i]<>nil)then
           if(maxMonto>totalMonto)then begin
               indiceMax:=i;                                {calculo el maximo}
               totalMonto:=maxMonto;
              diaLista:=vSuc[i]^.dato.dia;
           end;
      end;
    end;
    if(indiceMax<>-1)then begin
       maxDia:=vSuc[indiceMax]^.dato.dia;
       dni:=vSuc[inidiceMax]^.dato.dni;
       numFac:=vSuc[indiceMax]^.dato.num;
       vSuc[indiceMax]:=vSuc[indiceMax]^.sig;
    end;
  end;

  procedure imprimirClientes(vCli:vectorClientes;dni,pos,tel:integer);
  begin
    if(pos<=dimF)and (dni=>vCli[pos].dni)then begin
      if(vCli[pos].dni=dni)then
          tel:=vCli[pos].telefono;
      imprimirClientes(vCli,dni,pos+1,tel);
    end;
  end;

var
  actual,maxDia,numFac,dni,telefono,pos:integer;

begin
  maximo(vSuc,maxDia,dni,numFac);
  while(maxDia<>-1)do begin
    totalVenta:=0;
    actual:=maxDia;
    while(maxDia<>-1)and(maxDia=actual)do begin
      maximo(vSuc,maxDia,dni,numFac);
    end;
    pos:=1;
    imprimirClientes(vCli,dni,pos,telefono,encontre);
    if(encontre)then
      write('Ganador del dia: ',actual,'es el cliente con núm de factura: ',numfac,'Dni y telefono: ',dni,telefono);
      else
         write('Premio vacante del dia: ',actual);
  end;
end;

var
  vSuc:vectorSucursales;
  vCli:vectorClientes;
begin
  cargarSucursales(vSuc);{se dispone}
  cargarClientes(vCli); {se dispone}

  ordenarClientes(vCli); {por selección}

  merge(vSuc,vCli);
end.

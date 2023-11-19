{2. Un teatro tiene funciones los 7 días de la semana. Para cada día se tiene una lista con las
entradas vendidas.
Se desea procesar la información de una semana. Se pide:
a. Generar 7 listas con las entradas vendidas para cada día. De cada entrada se lee día (de
1 a 7), código de la obra, asiento, monto. La lectura finaliza con el código de obra igual
a 0. Las listas deben estar ordenadas por código de obra de forma ascendente.
b. Generar una nueva lista que totalice la cantidad de entradas vendidas por obra. Esta
lista debe estar ordenada por código de obra de forma ascendente.
c. Realice un módulo recursivo que informe el contenido de la lista generada en b)
}

program ejeercicio1;
const
  dimF=7;
type
  subRango=1..7;
  entrada=record
    dia:subRango;
    cod:integer;
    asiento:integer;
    monto:real;
  end;

  lista=^nodo;
  nodo=record
    datos:entrada;
    sig:lista;
  end;

  vector=array[1..dimF]of lista;

  totalObra=record
    cantEntradas:integer;
    codObra:integer;
  end;

  listaTotal=^nuevoNodo;

  nuevoNodo=record
    dato:totalObra;
    sig:listaTotal;
  end;

procedure cargarDias(var dias:vector);
   procedure leerDatos(var e:entrada);
   begin
     write('Escriba los datos de la entrada');
     read(e.dia); read(e.cod); read(e.asiento); read(e.monto);
   end;

var
  e:entrada;
  i:integer;
begin

end;

var
  dias:vector;
  lT:listaTotal;
begin
  cargarDias(dias);
  cargarTotalLista(lT);
  informarTotalLista(lT);
end;


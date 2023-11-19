program aerolinea;
const
  cate=20;
  dimF=250;
type

  categoria=1..cate;

  empleado=record
    num:integer;
    dni:integer;
    cat:categoria;
    ingreso:integer;
  end;

  arbol=^nodoArbol;

  nodoArbol=record
    dato:empleado;
    HI:arbol;
    HD:arbol;
  end;

  empleadoVector=record
    numLeg:integer;
    dni:integer;
  end;

  vectorEmpleados=array[1..dimF]of empleadoVector;

  vectorCategorias=array[1..cate]of vectorEmpleados;

  vectorDimL=array[1..cate]of integer;

procedure cargarArbol(var a:arbol);
begin

end;

procedure crearVector(a:arbol; legA,legB:integer; numCat:categoria; var vCat:vectorCategorias; var vDimL:vectorDimL);
  procedure inicializarDimL(var vDimL:vectorDimL);
  var
    i:integer;
  begin
    for i:=1 to cate do
      vDimL[i]:=0;
  end;
begin
  if(a<>nil)then
    if(a^.dato.num=>legA)then begin
       if(a^.dato.num<=legB)then begin
          if(a^.dato.cat=numCat)then begin
             vCat[a^.dato.cat][vDimL[a^.dato.cat]].dni:=a^.dato.dni;
             vCat[a^.dato.cat][vDimL[a^.dato.cat]].numLeg:=a^.dato.num;
             vDimL[a^.dato.cat]:= vDimL[a^.dato.cat]+1;
          end;
          crearVector(a^.HI,legA,legB,numCat,vCat,vDimL);
          crearVector(a^.HD,legA,legB,numCat,vCat,vDimL);
      end
      else
         crearVector(a^.HI,legA,legB,numCat,vCat,vDimL);
    end
    else
         crearVector(a^.HD,legA,legB,numCat,vCat,vDimL);
end;

procedure promedioDni(vCat:vectorCategorias;vDimL:vectorDimL; var total,cant,pos:integer);
var
 i:integer;
begin
  if(pos<=cate)then begin
     pos:=pos+1;
     for i:=1 to vDimL[pos] do begin
        cant:=cant+1;
        total:=total+vCat[pos][vDimL[a^.dato.cat]].dni;
     end;
  end;
  promedioDni(vCat,vDimL,total,cant,pos+1);
end;

var
  a:arbol;
  vDimL:vectorDimL;
  vCat:vectorCategorias;
  legA,legB:integer;
  numCat:categoria;
  prom,pos,total,cant:integer;
begin
  cargarArbol(a);{se dispone}
  write('Escriba dos números de legajos y un número de categoría');
  readln(legA); readln(legB); readln(numCat);

  crearVector(a,legA,legB,numCat,vCat,vDimL);

  pos:=0;
  cant:=0;
  total:=0;
  promedioDni(vCat,vDimL,total,cant,pos);
  prom:=total DIV cant;
  writeln('El promedio de los números de Dni es: ', prom);

end;


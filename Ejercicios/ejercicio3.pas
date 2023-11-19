{
* Una librería requiere el procesamiento de la información de sus productos. De cada
producto se conoce el código del producto, código de rubro (del 1 al 8) y precio.
Implementar un programa modularizado que:

a. Lea los datos de los productos y los almacene ordenados por código de producto y
agrupados por rubro, en una estructura de datos adecuada. El ingreso de los productos
finaliza cuando se lee el precio 0.
Una vez almacenados, muestre los códigos de los productos pertenecientes a cada rubro.

b. Genere un vector (de a lo sumo 30 elementos) con los productos del rubro 3.
Considerar que puede haber más o menos de 30 productos del rubro 3. Si la cantidad de
productos del rubro 3 es mayor a 30, almacenar los primeros 30 que están en la lista e
ignore el resto.

c. Ordene, por precio, los elementos del vector generado en b) utilizando alguno de
los dos métodos vistos en la teoría.

d. Muestre los precios del vector ordenado.
* }

Program ejercicio3;
Const 
	RUBRO=3;
	DIMF8=8;
	DIMF30=30;
Type
	sub8=1..8;
	
	producto=record
			codigo_producto:integer;
			codigo_rubro:sub8;
			precio:real;
	end;
	
	lista = ^nodo;
	nodo= record
		dato:producto;
		sig:lista;
	end;
	
	vector_productos =  array [sub8] of lista;
	
	vec_elementos_rubro =  array [1..DIMF30] of producto;

Procedure Leer(var p:producto);
begin
	writeln('Ingrese PRECIO:');
	read(p.precio);
	
	if(p.precio <>0)then begin
		writeln('Ingrese codigo de producto:');
		read(p.codigo_producto);
		
		writeln('Ingrese codigo de rubro:');
		read(p.codigo_rubro);
	end;
		
end;

Procedure InsertarOrdenado (var l: lista; p:producto);
var 
ant, nue, act: lista;
begin
  new (nue);
  nue^.dato := p;
  
  act := l;
  ant := l;

  while ((act<>NIL) and (act^.dato.codigo_producto < p.codigo_producto)) do begin
      ant := act;
      act := act^.sig ;
  end;
  if (ant = act)  then 
	  l:= nue   {el dato va al principio}
  else  
	ant^.sig  := nue; {va entre otros dos o al final}
  nue^.sig := act ;
end;

Procedure InicializarVectorListas(var v_productos:vector_productos);
var 
	i:integer;
begin
	for i:=1 to DIMF8 do
		v_productos[i]:=nil;
end;

Procedure CargarVectorListas(var v_productos:vector_productos);
var 
	p:producto;
begin
	Leer(p);
	while(p.precio <>0) do begin
		InsertarOrdenado(v_productos[p.codigo_rubro],p);
		Leer(p);
	end;

end;

Procedure MostrarVectorListas(v_productos:vector_productos);
var
	i:integer;
begin
	for i:=1 to DIMF8 do begin
		if(v_productos[i] <> nil)then begin
			writeln('-----------CODIGO DE RUBRO(',i,')-----------');
			while(v_productos[i] <> nil) do begin
					writeln('-----------');
					writeln('Codigo de producto: ', v_productos[i]^.dato.codigo_producto);
					writeln('Precio del producto: $', v_productos[i]^.dato.precio);
					writeln('-----------');
					
					v_productos[i]:=v_productos[i]^.sig;
			end;
			
		end;
	end;	
end;

Procedure GenerarVectorRubro(var v_elementos_rubro:vec_elementos_rubro; var dml:integer;lista_rubros:lista);
begin
	if(lista_rubros<>nil)then begin
		
		while((lista_rubros<> nil) and (dml<30))do begin
			dml:=dml+1;
			v_elementos_rubro[dml]:=lista_rubros^.dato;
			lista_rubros:=lista_rubros^.sig;
		end;
		
	end;
end;

Procedure OrdenarVectorRubro(var v_elementos_rubro:vec_elementos_rubro; dml:integer);
var 
	i,j : integer;
	actual: producto;
begin
	for i:= 2 to dml do begin
	    actual := v_elementos_rubro[i];{guardo el elemento a ordenar}
        j:= i-1;	    
        
        while((j>0) and (v_elementos_rubro[j].precio > actual.precio)) do begin
            v_elementos_rubro[j+1] := v_elementos_rubro[j];
            j:= j-1;        
        end;
        
        v_elementos_rubro[j+1]:= actual; {guarda el elemento en el lugar}
	end;
end;

Procedure MostrarVectorRubro(v_elementos_rubro:vec_elementos_rubro; dml:integer);
var
	i:integer;
begin
	writeln('-----------------PRODUCTOS RUBRO(',RUBRO,')-----------------');
	for i:=1 to dml do begin
		writeln('Codigo Producto: ',v_elementos_rubro[i].codigo_producto);
		writeln('Precio Producto: ',v_elementos_rubro[i].precio);
		writeln('');
	end;
end;

{--------------PROGRAMA PRINCIPAL--------------}
var
	v_productos:vector_productos;
	v_elementos_rubro:vec_elementos_rubro;
	dml:integer;
begin
	dml:=0;
	InicializarVectorListas(v_productos);
	CargarVectorListas(v_productos);
	writeln('---------------VECTOR DE RUBROS---------------');
	MostrarVectorListas(v_productos);
	
	GenerarVectorRubro(v_elementos_rubro,dml,v_productos[RUBRO]);
	OrdenarVectorRubro(v_elementos_rubro,dml);
	
	writeln('---------------VECTOR DE PRODUCTOS DEL RUBRO: ',RUBRO,'---------------');
	MostrarVectorRubro(v_elementos_rubro,dml) ;
end.

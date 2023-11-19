{4. Escribir un programa que:
a. Implemente un módulo que genere una lista a partir de la lectura de números
enteros. La lectura finaliza con el número -1.
b. Implemente un módulo recursivo que devuelva el mínimo valor de la lista.
c. Implemente un módulo recursivo que devuelva el máximo valor de la lista.
d. Implemente un módulo recursivo que devuelva verdadero si un valor determinado
se encuentra en la lista o falso en caso contrario.
}

a) procedure generarLista(var l:lista);
      procedure agregarAdelante(var l:lista; num:integer);
      var nue:lista;
      begin
         new(nue);
         nue^.dato:=num;
         nue^.sig:=l;
         l:=nue;
      end;

   var
     num:integer;
   begin
      l:=nil;
      read(num);
      while(num<>-1)do begin
        agregarAdelante(l,num);
        read(num);
      end;
   end;

b) procedure minimo(l:lista; var min:integer);
   begin
      if(l<>nil)then
           if(l^.dato<min)then begin
                  min:=l^.dato;
                  l:=l^.sig;
                  minimo(l,min);
           end;
   end;

c) procedure maximo(l:lista; var max:integer);
   begin
      if(l<>nil)then
            if(l^.dato>max)then begin
                   max:=l^.dato;
                   l:=l^.sig;
                   maximo(l,max);
            end;
   end;

d)  function buscar (l:lista; x:integer):boolean;
begin
	 if (l <> nil) then begin
		 if(l^.dato <> x )then
			 buscar:= buscar(l^.sig,x)
		 else
			 buscar:= true;
	 end;
	 if (l = nil) then
		 buscar:= false;
end;






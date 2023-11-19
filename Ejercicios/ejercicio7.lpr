{7. Realizar un programa que lea números y que utilice un procedimiento recursivo que
escriba el equivalente en binario de un número decimal. El programa termina cuando el
usuario ingresa el número 0 (cero).
Ayuda: Analizando las posibilidades encontramos que: Binario (N) es N si el valor es
menor a 2. ¿Cómo obtenemos los dígitos que componen al número? ¿Cómo achicamos
el número para la próxima llamada recursiva? Ejemplo: si se ingresa 23, el programa
debe mostrar: 10111.}

program ejercicio7;

procedure binario (x:integer);
begin
	 if (x < 2)then
		 write(x)
	 else begin
		 binario(x div 2);
		 write(x mod 2);
	 end;
end;
var
 x:integer;
begin
  write('INGRESE UN NUMERO');
  read(x);
  while(x<>0)do begin
       binario(x);
       write('INGRESE UN NUMERO');
       read(x);
  end;
end.

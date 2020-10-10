Algoritmo ejercicio2
	Definir x,invertido,resto Como entero ;
	Escribir "Introduzca un número entero positivo"
	leer x;
	invertido=0;
	
	Mientras x<>0 hacer 
		resto = x % 10;
		invertido = invertido *10 +resto;
		Escribir "El" invertido;
		 
		x =x/10;
	finmientras
	Escribir "si" x;
	//numeroInvertido=10;
	Escribir "El numero resultado es:" invertido;
FinAlgoritmo

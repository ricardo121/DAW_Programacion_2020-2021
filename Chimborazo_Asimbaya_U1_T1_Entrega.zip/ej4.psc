Algoritmo eje4
	contador1=0;
	max=0;
	min=1;
	

	Repetir
		Escribir "Introduzca un número entero positivo"
		Leer x;
		contador2=0;
		contador1=contador1+1;
		
		Para  i<-1 Hasta x Hacer
			si x%i=0 Entonces
				contador2=contador2+1;
			FinSi
			
		FinPara
		si max< x y contador2<>2
			max=x;
		FinSi
		si min>x
			min=x;
		FinSi
		si contador2<>2
			media=media+x;
			resultado= media/contador1
		FinSi

	Hasta Que contador2=2
	Escribir "Cantidad de numero no primos:" contador1-1;
	Escribir "Max:" max;
	Escribir "Mim:" min;
	Escribir "media:" resultado;
FinAlgoritmo


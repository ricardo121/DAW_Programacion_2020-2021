Algoritmo sin_titulo
	
	Definir unidades, i Como Entero
	Escribir '¿Cuántas unidades solicita?'
	Leer unidades
	Si unidades<=100 Entonces
		Escribir 'El sueldo es de ', unidades*5.23
	SiNo
		Si unidades>=101 y unidades<=1000 Entonces
			Escribir 'El Precio es de: ', (100*5.23)+((unidades-100)*4.16)
		SiNo
			Si unidades>1000 Entonces
				Escribir 'El Precio es: ', (100*5)+((unidades-100)*4)
			FinSi
			
		FinSi
		
	FinSi
	
FinAlgoritmo

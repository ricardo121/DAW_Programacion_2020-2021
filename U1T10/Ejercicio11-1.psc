Algoritmo Ejercicio1
	
	numero_1 = Azar(100)		
	Escribir "Escribe un numero entre el 1 y el 100"
	Escribir "¿?"
	contador = 0	
	Repetir 
		Leer numero_2
		contador = contador + 1
			Si numero_1 < numero_2  Entonces
			
				Escribir "Se ha pasado"
				
			SiNo
				Si numero_1 > numero_2  Entonces
				
					Escribir "Se ha quedado corto"
					
				Fin Si
				
			Fin Si
		Hasta Que contador = 7 o numero_1 = numero_2
		
		Si numero_1 = numero_2 Entonces
			Escribir "Es el Numero Correcto"
		SiNo
			Escribir "Numero de Fallos Maximo"
		Fin Si
		

FinAlgoritmo

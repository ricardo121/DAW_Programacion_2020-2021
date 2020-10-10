Algoritmo Ejercicio2 
			
	Escribir "Numero para hacer su Raiz Cuadrada"
	
	Repetir 
		Leer numero_1
		
		Si numero_1 < 0  Entonces
			Escribir "No se puede escribir numeros negativos"
			Escribir "Dame un Numero"
			
		SiNo
			Si numero_1 > 0  Entonces
				Escribir rc(numero_1)
				Escribir "Dame un Numero"
			Fin Si
			
		Fin Si
		
	Hasta Que numero_1 = 0 
	
FinAlgoritmo
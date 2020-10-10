Algoritmo Ejercicio3
	
	numero1 <- Azar(101)		
	Escribir numero1
	numero2 <- Azar(101)		
	Escribir numero2
	resultado = numero1 + numero2
	
	Repetir	
		
		Leer numero3
        Si resultado<>numero3 Entonces
            Escribir "Numero Incorrecto"
        FinSi
		
    Hasta Que numero3=resultado
	
    Escribir "Numero Correcto"
	
FinAlgoritmo

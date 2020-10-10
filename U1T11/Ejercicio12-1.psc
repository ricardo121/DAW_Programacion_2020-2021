Algoritmo Ejercicio1
	
    Escribir "Dime tu nombre"
    Leer texto
	
    Escribir "Con espacios adicionales, quedaría:"
    Para x <- Longitud(texto) Hasta 1 Hacer
        Escribir Sin Saltar Subcadena(texto, x, x)
        Escribir Sin Saltar " "
    FinPara
	
    Escribir ""  
	
FinAlgoritmo

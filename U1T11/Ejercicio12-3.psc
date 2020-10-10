Algoritmo Ejercicio3
	
	Definir text Como Caracter
	definir num,z,u como entero
	Escribir " Dime una Frase "
	leer text
	num<-1
	z<- Longitud(text)-1
	
	para u<-0 hasta z
		si subcadena(text,u,u)= " "
			num<-num+1
		FinSi
	FinPara
	
	Escribir " Hay " num " palabras "
	
FinAlgoritmo

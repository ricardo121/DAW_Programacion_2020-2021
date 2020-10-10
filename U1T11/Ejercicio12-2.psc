Algoritmo Ejercicio2
	
	definir num,text como caracter
	definir x como entero
	Escribir "Dame un Nombre"
	leer text
	num<-""
	x=0
	
	para x<-0 hasta longitud(text)
		si x%2 =0
			num<-Concatenar(num, Mayusculas(Subcadena(text,x,x)))
		SiNo
			num<-Concatenar(num, Minusculas(Subcadena(text,x,x)))
		FinSi
	FinPara
	
	Escribir "Tu nombre en Mayusculas y Minusculas es " num
	
FinAlgoritmo

Algoritmo Ejercicio1
	
	
	Repetir	
		Escribir  "Dame Un Numero:"
		Leer  numero1
		cont= cont +1
        Si numero1 % 2 == 0 y numero1 <> -1 Entonces
            cont1= cont1 +1
			si numero1>pare
				pare=numero1
			FinSi
		SiNo
			Si numero1 % 2 <> 0 y numero1 <> -1 Entonces
			cont2= cont2 +1
			impa= impa+numero1
			FinSi
        FinSi
		
    Hasta Que numero1<0
	resultado = cont -1
	pares= cont1
	impares = cont2
	Escribir "Total:",resultado
	Escribir "Media Impares:",impa/impares
	Escribir "Max par:",pare
FinAlgoritmo

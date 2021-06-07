Algoritmo pseudocodigoEjercicio5
	Definir n, hombre, mujer Como Entero
	hombre=0
	mujer=0
	Definir sexo Como entero;
	Escribir "Ingrese cuantas personas va a ingresar"
	leer personas;
	Para i=1 hasta personas Con Paso  1 Hacer
		Escribir i,". Ingrese edad"
		Leer edad;
		Escribir i,". Ingrese 1 si es mujer y 2 si es hombre"
		Leer sexo;
		si edad>17 y sexo=1 Entonces
			mujer=mujer+1
		SiNo
			si edad<18 y sexo=2 Entonces
				hombre=hombre+1
			FinSi
			
		FinSi
	FinPara;
	EScribir "Hay " ,hombre," menores de edad";
	Escribir "Hay " ,mujer," mayores de edad";
	
	
FinAlgoritmo

/*
   COMENTARIOS MULTILINEA
   
   	JAVA es CASESENSITIVE 
  
  	-----------VARIABLES y TIPOS DE DATOS-------------
  	Variable - Lugar en memoria donde se almacenan datos
  
  	Java tiene dos TIPOS DE VARIABLE:
  		1. Primitivas
  		2. Por REFERENCIA
  		
  	8 TIPOS DE DATOS PRIMITIVOS:
  		ENTERO
  			1. byte
  			2. short
  			3. int
  			4. long
  		REAL
  			1. float
  			2. double
  		
  		CARACTERES
  			1. char ->  '6', 'u', '+'......
  			
  		BOOLEANO
  			1. boolean  (true/false)
  			
  	 TIPO DE DATO POR REFERENCIA:
  	 
  	 	1. String --> Cadena de caracteres, por ejemplo 
  	 					"", "6", "Y", "hola", "Luke Skywalker", ....
 
 
 	DECLARACION DE VARIABLES EN JAVA
 	
 		Tipado ESTATICO y FUERTEMENTE TIPADO
 
 		Sintaxis:
 			
 			tipo_de_dato  identificador;
 		
 		Ejemplos:
 				
 			byte edad;
 			double temperatura;
 			
 			
 	OPERADORES ARITMETICOS
 		+  Suma
 		-  REsta
 		* Multiplicacion
 		/ Division
 		% Residuo de la division (MODULO)
 
 */
public class Ejemplo1 {
	
	public static void main(String args[]) {
		// Todo el codigo aqui, NADA fuera de estas llaves
		
		System.out.println("Magia magia con JAVA");
		System.out.println("Mi primera vez");
		System.out.println("Casi soy Ingeniera/o INMORTAL");
		System.out.print("Fundamentos");
		System.out.print("de Programacion");
		System.out.println("al/ksdfhaksdhfkjahsdkjfhdskljhfakjz");
		
		//Ejemplo declaracion de variables
		/*
		 * REGLAS PARA INDENTIFICADORES
		 * 		Variables
		 * 			1. NO iniciar con numeros
		 * 			2. NO iniciar con caracateres especiales (excepto $ y _)
		 * 			3. NO espacios
		 */
		byte edadPersona;
		short variableShort;
		int variableInt;
		long kjashfdlkjahdslfhasdkjfs;
		
		float peso = 0.0f;
		double temperatura;
		
		char letra;
		
		boolean sensorActivo;
		
		
		//Declaracion e INICIALIZACION 
		
		byte calificacion1 = 0;  //127
		
		byte edad1=50, edad2, edad3=0;
		

		System.out.println("Hola Luke, tu edad es: " + edad1);
		
		System.out.println("FIN DEL CODIGO?");
		
	}
}







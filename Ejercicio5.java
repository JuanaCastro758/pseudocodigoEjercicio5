import java.util.*;
public class Ejercicio5{
	public static void main(String[] args){
		Scanner scanner= new Scanner(System.in);
    String genero;
    int edad, mayor=0,menor=0,op=1;
    while (op!=0){
        System.out.println("1. Ingresar datos");
        System.out.println("0. Salir");
        op=scanner.nextInt();
        if (op==1){
         System.out.println("Escribir genero");
         genero=scanner.nextLine();
         System.out.println("Escribir edad");
         edad=scanner.nextInt();
         if (genero=="femenino" && edad>=18){
            mayor++;
         }
         if (genero=="masculino" && edad<18){
            menor++;
         }
      }
    }
    System.out.println(mayor+" mujeres mayores de edad");
    System.out.println(menor+" hombres menores de edad");
	}
}
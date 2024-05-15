package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Adress_BookMain 
{
    static Scanner UsInput = new Scanner(System.in);
    static ArrayList<Contactos> cnts =new ArrayList<Contactos>();
    public static void main(String[] args)
    {
        //TODO Añadir una manera de añadir Nombre, Dirección, Números de Teléfono e emails
        int SC;
        
            do {
                System.out.println("Introduzca un número para elegir que hacer: ");
                System.out.println("");
                System.out.println("1 - [Ver todos los contactos] ");
                System.out.println("2 - [Buscar contacto por nombre] ");
                System.out.println("3 - [Añadir nuevo contacto] ");
                System.out.println("4 - [Borrar contacto] ");
                System.out.println("5 - [Salir de la aplicación] ");
                SC=UsInput.nextInt();
                switch (SC) {
                case 1:
                    MostrarContactos();
                    break;
                case 2:
                    BuscarContactos();
                    break;
                case 3:
                    AnadirContacto();
                    break;
                case 4:
                    BorrarContacto();
                    break;
                case 5:
                    System.out.println("Saliendo de la aplicación");
                    break;
                default:
                    System.out.println("Esa no es una opción válida");
                }
                
            } while (SC!=5);
        }
    
    public static void MostrarContactos()
    {
        if(cnts.size()==0) {System.out.println("No hay ningún contacto disponible");return;}
        
        for(int i=0;i<cnts.size();i++)
        {
            System.out.println("Contacto número "+(i+1)+":");
            System.out.println(cnts.get(i));
        }
        
    }   
    public static void BuscarContactos() 
    {
        System.out.println("Introduce un nombre para buscarlo en la lista: ");
        String nombre=UsInput.next();
        boolean x=false;
            for (Contactos c : cnts) {

                if (nombre != null && c.getNombre().equals(nombre)) {
                    System.out.println("El nombre del contacto es: ");
                    System.out.println(c);
                    x = true;
                    break;
                }
            }
            if (!x) {
                System.out.println("No existe ese contacto. ");
            } 
        
        
    }
    public static void AnadirContacto()
    {
        System.out.println("Introduce el nombre del contacto a añadir: ");
        String NomInput = UsInput.next();
        System.out.println("Introduce la dirección del contacto a añadir: ");
        String DireccInput=UsInput.next();
        System.out.println("Introduce el número de telefono del contacto a añadir: ");
        String NumerInput=UsInput.next();
        System.out.println("Introduce el correo electrónico del contacto a elegir: ");
        String EmailInput=UsInput.next();
        
        Contactos x=new Contactos(NomInput,DireccInput,NumerInput,EmailInput);
        cnts.add(x);
        System.out.println("Contacto añadido con éxito :).");
    }
    public static void BorrarContacto()
    {
        if(cnts.isEmpty()) {System.out.println("El listado de contactos está vacío.");}
        System.out.println("Introduce el nombre del contacto a borrar: ");
        String nombre=UsInput.next();
        boolean x=false;
        for(Contactos c:cnts)
        {
            if(c.getNombre().equals(nombre))
            {
                cnts.remove(c);
                System.out.println("Contacto borrado con éxito :).");
                x=true;
                break;
            }
        }
        if(!x)
        {
            System.out.println("El contacto no fue encontrado.");
        }
    }
}


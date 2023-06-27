import java.io.*;
public class Principal {
    public static void main(String[] args) throws IOException{
        //declaracion de objetos
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        Estudiantes objeto =new Estudiantes();
        String opcion;
        boolean estado=true;
        boolean v=false;
        float prom;
        while(estado){
            //MENU
            System.out.println("--------Menu--------");
            System.out.println("1-Usuario Nuevo\n2-Actualizar contraseña\n3-Imprimir Notas y ver promedio\n4-Ver Estudiantes\nSalir");
            System.out.println("--------------------");
            System.out.print("introduzca la Opcion: ");
            opcion=read.readLine();
            //FIN DEL MENU
            switch(opcion){
            case "1":// crear usuario nuevo
                if(objeto.puntero<objeto.n){
                    objeto.nombre[objeto.puntero]=objeto.NuevoE();//FUNCION ESTUDIANTE NUEVO
                    objeto.contrasenas[objeto.puntero]=objeto.NuevoC();//FUNCION CONTRASEÑA NUEVA
                    objeto.NuevoN(); //FUNCION NOTAS NUEVAS
                    objeto.puntero=objeto.puntero+1;
                    System.out.println("Estudiante creado exitosamente");
                }else{
                    System.out.println("Estudiantes llenos");
                }
            break;

            case "2"://actualizar contraseña
                if(objeto.puntero>0){
                    v=objeto.Verificacion();
                    if(v==true){
                        objeto.Contrasena();
                        System.out.println("Contraseña actualizada exitosamente");
                        objeto.puntero=objeto.temp;
                    }else{
                        System.out.println("Usuario y contraseña incorrecta");
                    }
                }else{
                    System.out.println("No hay estudiantes en el sistema");
                }
            break;

            case "3"://notas y promedio
                if(objeto.puntero>0){
                    v=objeto.Verificacion();
                    if(v==true){
                        System.out.println("Las notas del estudiante son: ");
                        objeto.ImprimirN();
                        System.out.println("El promedio es: "+(prom=objeto.Promedio()));
                        
                        objeto.puntero=objeto.temp;
                    }else{
                        System.out.println("Usuario y contraseña incorrecta");
                        }
                }else{
                    System.out.println("No hay estudiantes en el sistema");
                }
                
                
            break;
            
            case "4"://imprimir estudiantes
                if(objeto.puntero>0){
                    objeto.ImprimirE();
                }else{
                    System.out.println("No hay estudiantes en el sistema");
                }
            break;
            case "Salir":
                estado=false;
            break;
            case "salir":
                estado=false;
            break;

            default:
                System.out.println("introduzca una opcion disponible mostrada");
            
            break;
            }
        }
    }
    
}//fin de la clase

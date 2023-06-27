import java.io.*;
public class Estudiantes {
    static BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
        
    //declaracion de variables o atributos del usuario
    static int n=5;
    static String[] nombre=new String[n];
    static String[] contrasenas= new String[n];
    static float[][] notas= new float[n][n];
    static int puntero=0;
    int temp;

    void ImprimirN(){
        for(int i=0;i<n;i++){
            System.out.println(notas[puntero][i]);
        }
    }

    float Promedio(){
        float suma=0;
        float prom=0;
        for(int i=0;i<n;i++){
            suma = suma + (notas[puntero][i]);
            prom=suma/n;
        }
        return(prom);
    }
    //METODO ACTUALIZAR CONTRASEÑA
    void Contrasena()throws IOException{
       System.out.println("Introduzca la contraseña nueva:");
       contrasenas[puntero]= read.readLine();
    }

    //METODO NUEVO ESTUDIANTE
    String NuevoE()throws IOException{
        System.out.println("Introduzca el nombre del Estudiante");
        String name=read.readLine();
        return name;
    }

    //METODO NUEVA CONTRASEÑA
    String NuevoC()throws IOException{
        System.out.println("Introduzca la contraseña del estudiante");
        String pass=read.readLine();
        return pass;
    }
    //METODO NUEVAS NOTAS
    void NuevoN()throws IOException{
        for(int i=0;i<n;i++){
            System.out.println("Intrduzca la nota "+(i+1));
            notas[puntero][i]=Float.parseFloat(read.readLine());
        }
    }
    //METODO IMPRIMIR ESTUDIANTES
    void ImprimirE(){
        for(int i=0;i<puntero;i++){
            System.out.println(nombre[i]);
        }
    }    
    //METODO VERIFICACION DE USUARIO
    boolean Verificacion()throws IOException{
        boolean z=false;
        System.out.println("Introduzca el usuario: ");
        String name = read.readLine();
        System.out.println("introduzca la contraseña: ");
        String pass=read.readLine();
        for(int i=0;i<puntero;i++){
            if(name.equals(nombre[i])&&pass.equals(contrasenas[i])){
                z=true;
                System.out.println("Estudiante en el sistema");
                temp=puntero;
                puntero=i;
            }
        }
        return z;
    }
    
    /* 
    static int valor(String mensaje) throws IOException{//funcion para errores, solo se admiten numeros

        boolean co=true;
        while(co){
            try {
                System.out.println(mensaje);
                int x = Integer.parseInt(read.readLine());
                co=false;
            } catch (Exception e) {
                System.out.println("\nIngrese un valor valido\n");
            }
        }
        return x;
    }*/

    static String name(String mensaje) {//funcion para errores, solo se admiten letras

        try {
            System.out.println(mensaje);
            return read.readLine();
        } catch (Exception e) {
            System.out.println("\nA ingresado un carracter invalido\n");
            return name(mensaje);
        }
    }
}
    



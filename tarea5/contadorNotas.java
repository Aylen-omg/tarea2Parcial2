
/**
 * Write a description of class notas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class contadorNotas 

{
    int numEstudiantes; 
    int i=0;
    int [] notas;
    public contadorNotas(int numEstudiantes){
        notas= new int [numEstudiantes];
    }

   public void anadirNotas(int nota){
        if(i<notas.length){
            notas [i]=nota;
            i++;
        }else{
            System.out.println("Cantidad de estudiantes completada.");
        }
    }
    
   public double promedioNotas(){
        double promedio = 0;
        int acumulador = 0;
        for(int i = 0; i < notas.length ;i++){
           promedio = promedio + notas[i];
           acumulador++;
        }
        promedio = promedio/acumulador ;
        return promedio;
    }
    
   public double promedioAprobados(){
        double promedio = 0;
        int acum = 0;
        for(int i = 0; i < numEstudiantes;i++){
            if(notas[i] >= 51){
                promedio = promedio + notas[i];
                acum++;
            }
        }
        promedio= promedio/acum;
        return promedio;
    }
    
   public int cantidadReprobados(){
        int reprobados = 0;
        for(int i = 0; i < notas.length;i++){
            if(notas[i] < 51){
                reprobados++;
            }
        }
        return reprobados;
    }
    
   public int cantidadAprobados(){
        int aprobados = 0;
        for(int i = 0; i < notas.length; i++){
            if(notas[i] >= 51){
                aprobados++;
            }
        }
        return aprobados;
    }
    
    public double notaAlta(){
        double notaAlt=0;
        double nota1=0;
        double nota2=0;
        for (int i=0; i< notas.length; i++){
            nota1= notas[i];
            notaAlt= Math.max(nota1,nota2);
            nota2=nota1;
        }
        return notaAlt;
    }

}

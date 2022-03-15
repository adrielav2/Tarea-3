public class Triangulo extends Figura implements Comparable<Figura>{
    private double base;
    private double altura;

    public Triangulo(double pBase, double pAltura){
        base = pBase;
        altura = pAltura;
    }
    public double calcularArea(){
        return base*altura/2;
    }
    public int compareTo(Figura FigPorComparar){
        double areaPorComparar=FigPorComparar.calcularArea();
        double miArea=this.calcularArea();
        int ladosPorComparar=FigPorComparar.obtenerLados();
        int misLados=this.obtenerLados();

        if(miArea==areaPorComparar){ 
            if(misLados==ladosPorComparar){
                return 0;
            }
            else{
                return 00;
            }
        }
        else if (miArea > areaPorComparar){
            return 1;
        }
        else{
            return -1;
        }

    }
    public int obtenerLados(){
        return 3;
    }


    
}
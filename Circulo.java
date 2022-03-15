public class Circulo extends Figura implements Comparable<Figura>{
    private double radio;

    public Circulo(double pradio){
        radio=pradio;
    }
    public double calcularArea(){
        return 3.14*radio*radio;
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
        return 0;
    }


    
}
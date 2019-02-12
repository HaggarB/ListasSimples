
public class Main {

    static linkedList<Double> dobles = new linkedList<>();
    
    public static void fill (int n, int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dobles.add( (Double)Math.abs(Math.floor(Math.random()*(n-m+1)+m)));
            }
            
        }
    }
    public static void main(String[] args) {
        
        dobles.add(30d);
        dobles.add(10d);
        dobles.add(20d);
        dobles.add(30d);
        dobles.add(20d);
        dobles.add(600d);
        dobles.add(30d);
        dobles.add(350d);
        dobles.add(30d);
        
        dobles.addBefore(30d, 10d);
       while( dobles.removeAfter(600d));
       
        /*
        if (dobles.removeBefore(18d)){
            System.out.println("Se borro el valor");
        }else {
            System.out.println("No se puede");
        }
        */
        //dobles.removeAll(9d);
       // fill(1,62000);
       
        for (Double object : dobles) {
            System.out.println(object);
        }
        
        //Node<Double> nodo =  new Node<Double>();
        //nodo.setValue(18d);
        //dobles.add(nodo);
        
    }
    
}

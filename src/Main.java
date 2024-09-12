public class Main {
    public static void main(String[] args) {
        cribaErastotenes(1000000000);
    }

    public static void cribaErastotenes(int n){
        boolean[] primeN = new boolean[(int)n+1];
        for(int i = 0; i < n; i++){
            primeN[i] = true;
        }
        double timeIni = System.nanoTime();
        for(int p = 2; p*p <= n; p++){
            if(primeN[p]){
                for(int i = p*p; i <= n; i += p) {
                    primeN[i] = false;
                }
            }
        }

        for(int i = 2; i <= n; i++){
            if(primeN[i]){
                System.out.print(i + " ");
            }
        }
        System.out.print("\n");

        double timeFini = System.nanoTime();
        System.out.println("Tiempo total utilizado: " + (int)(timeFini - timeIni) + " ns");
    }
}
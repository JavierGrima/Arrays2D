void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Introduce el numero de filas: ");
    int filas = scanner.nextInt();
    System.out.println("Introduce el numero de columnas: ");
    int columnas = scanner.nextInt();
    int[][] matriz = new int[filas][columnas];

    System.out.println("Ingrese los elementos de la matriz " + filas + "x" + columnas + ":");
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            System.out.print("Elemento [" + i + "][" + j + "]: ");
            matriz[i][j] = scanner.nextInt();
        }
    }


    int resultados[][] = new int[3][matriz[0].length];

    for(int j = 0; j<matriz[0].length; j++){
        int suma = 0;
        for(int i = 0; i<matriz.length; i++){
            suma += matriz[i][j];
        }
        resultados[0][j] = suma;
    }

    int valorMax;

    for(int j = 0; j<matriz[0].length; j++){
        valorMax = matriz[0][j];
        for(int i = 0; i<matriz.length; i++){
            if(matriz[i][j] > valorMax){
                valorMax = matriz[i][j];
            }
        }
        resultados[1][j] = valorMax;
    }

    int valorMin;

    for(int j = 0; j<matriz[0].length; j++){
        valorMin = matriz[0][j];
        for(int i = 0; i<matriz.length; i++){
            if(matriz[i][j] < valorMin){
                valorMin = matriz[i][j];
            }
        }
        resultados[2][j] = valorMin;
    }


    for(int j = 0; j<resultados[0].length; j++){
        System.out.print("\nResultados columna [" + j + "]: " +  " | Suma: " + resultados[0][j] + " | Valor maximo: " + resultados[1][j] + " | Valor minimo: " + resultados[2][j]);
    }
}

void main() {
    Scanner scanner = new Scanner(System.in);

    int[][] matriz = new int[20][3];

    System.out.println("Ingresa las notas de cada alumno: ");
    for (int i = 0; i < matriz.length; i++){
        for (int j = 0; j < matriz[i].length; j++){
            System.out.println("Alumno " + ( i + 1) + " | Nota " + (j + 1) + ": ");
            matriz[i][j] = scanner.nextInt();
        }
    }

    int[][] resultados = new int[3][matriz.length];

    for(int i = 0; i < matriz.length; i++){
        int promedio = 0;
        for(int j = 0; j < matriz[i].length; j++){
            promedio += matriz[i][j];
        }
        resultados[0][i] = promedio / matriz[i].length;
    }

    for(int i = 0; i < matriz.length; i++){
        int notaMax = matriz[i][0];
        for(int j = 0; j < matriz[i].length; j++){
            if(matriz[i][j] > notaMax){
                notaMax = matriz[i][j];
            }
        }
        resultados[1][i] = notaMax;
    }

    for(int i = 0; i < matriz.length; i++){
        int notaMin = matriz[i][0];
        for(int j = 0; j < matriz[i].length; j++){
            if(matriz[i][j] < notaMin){
                notaMin = matriz[i][j];
            }
        }
        resultados[2][i] = notaMin;
    }

    for (int i = 0; i < resultados[0].length; i++){
        System.out.println("\nAlumno " + (i + 1) + " | Promedio: " + resultados[0][i] + " | Nota maxima: " + resultados[1][i] + " | Nota minima: " + resultados[2][i]);
    }

    int mejorNota = resultados[1][0];
    int peorNota = resultados[2][0];

    for (int i = 0; i < resultados[0].length; i++){
        for (int j = 0; j < resultados[0].length; j++){
            if (resultados[1][j] > mejorNota) {
                mejorNota = resultados[1][j];
            }
            if (resultados[2][j] < peorNota) {
                peorNota = resultados[2][j];
            }
        }
    }

    System.out.println("\nMejor nota: " + mejorNota + " | Peor nota: " + peorNota);
}
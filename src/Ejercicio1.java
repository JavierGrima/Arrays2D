
void main() {
    Scanner scanner = new Scanner(System.in);

    int[][] matriz = new int[2][3];

    System.out.println("Ingrese los elementos de la matriz 2x3:");
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            System.out.print("Elemento [" + i + "][" + j + "]: ");
            matriz[i][j] = scanner.nextInt();
        }
    }

    int sumas[] = new int[matriz[0].length];

    System.out.println("La suma de cada columnas es: ");
    for(int j = 0; j<matriz[0].length; j++){
        int suma = 0;

        for(int i = 0; i<matriz.length; i++){
            suma += matriz[i][j];
        }
        sumas[j] = suma;
        System.out.println("Columna " + j + ": " + suma);
    }
}

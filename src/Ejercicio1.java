
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

    int sumas[] = new int[matriz[0].length];

    for(int j = 0; j<matriz[0].length; j++){
        int suma = 0;
        for(int i = 0; i<matriz.length; i++){
            suma += matriz[i][j];
        }
        sumas[j] = suma;
    }

    for(int i = 0; i<sumas.length; i++){
        System.out.println("Suma de la columna " + i + ": " + sumas[i]);
    }
}

void main() {
    String[][] matriz = new String[5][5];

    for(int i = 0; i < matriz.length; i++) {
        for(int j = 0; j < matriz[i].length; j++) {

            if (i == 0 || i == 4 || i == j) {
                matriz[i][j] = "X";
            } else {
                matriz[i][j] = " ";
            }
        }
    }

    for(int i = 0; i < matriz.length; i++) {
        for(int j = 0; j < matriz[i].length; j++) {
            System.out.print(matriz[i][j] + " ");
        }
        System.out.println();
    }
}
package ru.job4j.array;

import java.util.Objects;

public class Cinema {
    public static Place checkEmptyPlace(Place[][] places) {
        int[][] quantity = getNearbyZerosQuantity(places);
        for (int i = 0; i < places.length; i++) {
            for (int j = 0; j < places[i].length; j++) {
                 if (quantity[i][j] == 1) {
                     int imin = i == 0 ? i : i - 1;
                     int imax = i == places.length - 1 ? i : i + 1;
                     int jmin = j == 0 ? j : j - 1;
                     int jmax = j == places[i].length - 1 ? j : j + 1;
                     if ((imin != i && quantity[imin][j] == 1)
                     || (imax != i && quantity[imax][j] == 1)
                     || (jmin != j && quantity[i][jmin] == 1)
                     || (jmax != j && quantity[i][jmax] == 1)) {
                     return new Place(i, j);
                     }
                 }
                if (quantity[i][j] >= 2) {
                    return new Place(i, j);
                }
            }
        }
        return null;
    }

    public static int[][] getNearbyZerosQuantity(Place[][] places) {
        int[][] result = new int[places.length][];
        for (int i = 0; i < places.length; i++) {
            result[i] = new int[places[i].length];
            for (int j = 0; j < places[i].length; j++) {
                if (places[i][j] == null) {
                    int imin = i == 0 ? i : i - 1;
                    int imax = i == places.length - 1 ? i : i + 1;
                    int jmin = j == 0 ? j : j - 1;
                    int jmax = j == places[i].length - 1 ? j : j + 1;
                    int count = 0;
                    for (int k = imin; k <= imax; k++) {
                        for (int l = jmin; l <= jmax; l++) {
                            if (!(k == i && l == j) && (i == k || j == l) && places[k][l] == null) {
                                count++;
                            }
                        }
                    }
                    result[i][j] = count;
                } else {
                    result[i][j] = -1;
                }
            }
        }
        return result;
    }

    public static class Place {
        private int row;

        private int cell;

        public Place(int row, int cell) {
            this.row = row;
            this.cell = cell;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Place place = (Place) o;
            return row == place.row && cell == place.cell;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, cell);
        }
    }
}

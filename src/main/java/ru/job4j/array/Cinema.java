package ru.job4j.array;

import java.util.Objects;

public class Cinema {

    public static Place checkEmptyPlace(Place[][] places) {
        for (int i = 0; i < places.length; i++) {
            for (int j = 0; j < places[i].length; j++) {
                if (places[i][j] == null) {
                 int imin = i == 0 ? i : i - 1;
                 int imax = i == places.length - 1 ? i : i + 1;
                 int jmin = j == 0 ? j : j - 1;
                 int jmax = j == places[i].length - 1 ? j : j + 1;
                 int nearbyZeros = 0;
                    for (int k = imin; k <= imax; k++) {
                        for (int l = jmin; l <= jmax; l++) {
                            if (!(k == i && l == j) && (i == k || j == l) && places[k][l] == null) {
                            nearbyZeros++;
                            }
                        }
                    }
                    int nearbyZerosNeed = 2;
                    if ((i == 0 && j == 0) || (i == 0 && j == places[i].length - 1)
                            || (i == places.length - 1 && j == 0) || (i == places.length - 1 && j == places[i].length - 1)) {
                        nearbyZerosNeed = 1;
                    }
                    if (nearbyZeros >= nearbyZerosNeed) {
                     return new Place(i, j);
                    }
                }
            }
        }
        return null;
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

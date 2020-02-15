import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class SudokuBoardTest {

    @Test
    public void easy_2x2() {
        // http://www.menneske.no/sudoku/2/solution.html?number=239
        int[][] input = {
                {0, 1, 0, 0},
                {0, 2, 0, 0},
                {0, 0, 3, 0},
                {0, 0, 1, 0}
        };
        int[][] solution = {
                {4, 1, 2, 3},
                {3, 2, 4, 1},
                {1, 4, 3, 2},
                {2, 3, 1, 4}
        };

        SudokuBoard board = new SudokuBoard(input);
        board.solve();
        assertArrayEquals(solution, input);
    }

    @Test
    public void hard_2x3() {
        int[][] input = {
                {0, 0, 0, 5, 0, 4},
                {0, 0, 0, 0, 2, 6},
                {0, 0, 0, 2, 0, 5},
                {2, 0, 5, 0, 0, 0},
                {3, 2, 0, 0, 0, 0},
                {1, 0, 4, 0, 0, 0}
        };
        int[][] solution = {
                {6, 3, 2, 5, 1, 4},
                {5, 4, 1, 3, 2, 6},
                {4, 1, 3, 2, 6, 5},
                {2, 6, 5, 1, 4, 3},
                {3, 2, 6, 4, 5, 1},
                {1, 5, 4, 6, 3, 2}
        };

        SudokuBoard board = new SudokuBoard(input);
        board.solve();
        assertArrayEquals(solution, input);
    }

    @Test
    public void hard_2x4() {
        // http://www.menneske.no/sudoku/2x4/solution.html?number=55943
        int[][] input = {
                {8, 1, 2, 0, 0, 0, 0, 0},
                {0, 0, 0, 6, 0, 0, 0, 0},
                {1, 6, 0, 0, 7, 0, 0, 2},
                {0, 2, 0, 0, 0, 0, 8, 5},
                {3, 8, 0, 0, 0, 0, 7, 0},
                {2, 0, 0, 7, 0, 0, 1, 3},
                {0, 0, 0, 0, 5, 0, 0, 0},
                {0, 0, 0, 0, 0, 7, 2, 1}
        };
        int[][] solution = {
                {8, 1, 2, 4, 6, 3, 5, 7},
                {5, 7, 3, 6, 2, 1, 4, 8},
                {1, 6, 8, 5, 7, 4, 3, 2},
                {4, 2, 7, 3, 1, 6, 8, 5},
                {3, 8, 5, 1, 4, 2, 7, 6},
                {2, 4, 6, 7, 8, 5, 1, 3},
                {7, 3, 1, 2, 5, 8, 6, 4},
                {6, 5, 4, 8, 3, 7, 2, 1}
        };

        SudokuBoard board = new SudokuBoard(input);
        board.solve();
        assertArrayEquals(solution, input);
    }

    @Test
    public void hard_2x5() {
        // http://www.menneske.no/sudoku/2x5/solution.html?number=279
        int[][] input = {
                {0, 0, 0, 0, 6, 0, 0, 0, 2, 10},
                {0, 3, 0, 0, 0, 0, 0, 0, 0, 1},
                {5, 0, 10, 7, 0, 0, 1, 6, 9, 0},
                {0, 0, 3, 0, 0, 7, 0, 0, 5, 2},
                {0, 8, 0, 0, 0, 0, 10, 5, 0, 0},
                {0, 0, 1, 10, 0, 0, 0, 0, 3, 0},
                {7, 5, 0, 0, 9, 0, 0, 3, 0, 0},
                {0, 10, 2, 3, 0, 0, 7, 1, 0, 5},
                {1, 0, 0, 0, 0, 0, 0, 0, 7, 0},
                {10, 4, 0, 0, 0, 8, 0, 0, 0, 0}
        };

        int[][] solution = {
                {9, 1, 4, 8, 6, 5, 3, 7, 2, 10},
                {2, 3, 7, 5, 10, 6, 4, 9, 8, 1},
                {5, 2, 10, 7, 8, 3, 1, 6, 9, 4},
                {6, 9, 3, 4, 1, 7, 8, 10, 5, 2},
                {3, 8, 9, 6, 2, 1, 10, 5, 4, 7},
                {4, 7, 1, 10, 5, 2, 9, 8, 3, 6},
                {7, 5, 6, 1, 9, 4, 2, 3, 10, 8},
                {8, 10, 2, 3, 4, 9, 7, 1, 6, 5},
                {1, 6, 8, 2, 3, 10, 5, 4, 7, 9},
                {10, 4, 5, 9, 7, 8, 6, 2, 1, 3}
        };

        SudokuBoard board = new SudokuBoard(input);
        board.solve();
        assertArrayEquals(solution, input);
    }

    @Test
    public void easy_3x3() {
        int[][] input = {
                {5, 0, 0, 8, 7, 6, 2, 3, 1},
                {2, 3, 6, 9, 0, 5, 7, 0, 8},
                {1, 8, 0, 0, 0, 0, 9, 5, 0},
                {0, 0, 5, 3, 2, 8, 0, 0, 9},
                {0, 6, 0, 0, 5, 0, 3, 2, 7},
                {3, 1, 2, 0, 0, 7, 0, 8, 0},
                {4, 0, 3, 7, 8, 0, 0, 1, 2},
                {0, 0, 9, 0, 4, 3, 0, 0, 0},
                {0, 7, 0, 0, 0, 0, 4, 0, 0}
        };

        int[][] solution = {
                {5, 9, 4, 8, 7, 6, 2, 3, 1},
                {2, 3, 6, 9, 1, 5, 7, 4, 8},
                {1, 8, 7, 2, 3, 4, 9, 5, 6},
                {7, 4, 5, 3, 2, 8, 1, 6, 9},
                {9, 6, 8, 4, 5, 1, 3, 2, 7},
                {3, 1, 2, 6, 9, 7, 5, 8, 4},
                {4, 5, 3, 7, 8, 9, 6, 1, 2},
                {6, 2, 9, 1, 4, 3, 8, 7, 5},
                {8, 7, 1, 5, 6, 2, 4, 9, 3}

        };

        SudokuBoard board = new SudokuBoard(input);
        board.solve();
        assertArrayEquals(solution, input);
    }

    @Test
    public void medium_3x3() {
        int[][] input = {
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        int[][] solution = {
                {3, 1, 6, 5, 7, 8, 4, 9, 2},
                {5, 2, 9, 1, 3, 4, 7, 6, 8},
                {4, 8, 7, 6, 2, 9, 5, 3, 1},
                {2, 6, 3, 4, 1, 5, 9, 8, 7},
                {9, 7, 4, 8, 6, 3, 1, 2, 5},
                {8, 5, 1, 7, 9, 2, 6, 4, 3},
                {1, 3, 8, 9, 4, 7, 2, 5, 6},
                {6, 9, 2, 3, 5, 1, 8, 7, 4},
                {7, 4, 5, 2, 8, 6, 3, 1, 9}
        };

        SudokuBoard board = new SudokuBoard(input);
        board.solve();
        assertArrayEquals(solution, input);
    }

    @Test
    public void hard_3x3() {
        int[][] input = {
                {1, 0, 0, 6, 0, 2, 0, 7, 0},
                {2, 6, 0, 9, 0, 0, 1, 0, 0},
                {0, 0, 7, 0, 0, 0, 0, 0, 0},
                {0, 8, 0, 4, 0, 0, 0, 0, 7},
                {0, 7, 1, 3, 0, 8, 2, 5, 0},
                {9, 0, 0, 0, 0, 7, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 4, 0, 0},
                {0, 0, 4, 0, 0, 6, 0, 2, 3},
                {0, 2, 0, 1, 0, 4, 0, 0, 6}
        };

        int[][] solution = {
                {1, 5, 9, 6, 4, 2, 3, 7, 8},
                {2, 6, 8, 9, 7, 3, 1, 4, 5},
                {3, 4, 7, 5, 8, 1, 9, 6, 2},
                {5, 8, 2, 4, 1, 9, 6, 3, 7},
                {4, 7, 1, 3, 6, 8, 2, 5, 9},
                {9, 3, 6, 2, 5, 7, 8, 1, 4},
                {6, 9, 3, 7, 2, 5, 4, 8, 1},
                {7, 1, 4, 8, 9, 6, 5, 2, 3},
                {8, 2, 5, 1, 3, 4, 7, 9, 6},
        };

        SudokuBoard board = new SudokuBoard(input);
        board.solve();
        assertArrayEquals(solution, input);
    }    

    @Test
    public void hard_3x4() {
        // http://www.menneske.no/sudoku/3x4/solution.html?number=2012
        int[][] input = {
                {0, 10, 0, 0, 0, 0, 0, 0, 4, 3, 0, 7},
                {8, 0, 6, 0, 11, 3, 0, 0, 0, 10, 0, 0},
                {0, 0, 0, 9, 10, 0, 0, 1, 0, 0, 5, 0},
                {0, 0, 1, 0, 9, 0, 2, 0, 0, 0, 0, 0},
                {0, 6, 0, 0, 0, 11, 0, 4, 12, 0, 0, 10},
                {0, 0, 11, 0, 0, 12, 6, 0, 0, 7, 0, 0},
                {0, 0, 3, 0, 0, 5, 1, 0, 0, 9, 0, 0},
                {4, 0, 0, 12, 2, 0, 11, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 9, 0, 12, 0, 8, 0, 0},
                {0, 11, 0, 0, 5, 0, 0, 2, 8, 0, 0, 0},
                {0, 0, 8, 0, 0, 0, 10, 9, 0, 2, 0, 6},
                {6, 0, 5, 1, 0, 0, 0, 0, 0, 0, 9, 0}
        };

        int[][] solution = {
                {1, 10, 2, 11, 6, 8, 9, 5, 4, 3, 12, 7},
                {8, 12, 6, 5, 11, 3, 4, 7, 1, 10, 2, 9},
                {3, 7, 4, 9, 10, 2, 12, 1, 6, 11, 5, 8},
                {12, 3, 1, 8, 9, 7, 2, 10, 11, 5, 6, 4},
                {2, 6, 9, 7, 8, 11, 5, 4, 12, 1, 3, 10},
                {10, 5, 11, 4, 1, 12, 6, 3, 9, 7, 8, 2},
                {11, 8, 3, 2, 4, 5, 1, 6, 7, 9, 10, 12},
                {4, 9, 7, 12, 2, 10, 11, 8, 3, 6, 1, 5},
                {5, 1, 10, 6, 3, 9, 7, 12, 2, 8, 4, 11},
                {9, 11, 12, 10, 5, 6, 3, 2, 8, 4, 7, 1},
                {7, 4, 8, 3, 12, 1, 10, 9, 5, 2, 11, 6},
                {6, 2, 5, 1, 7, 4, 8, 11, 10, 12, 9, 3}
        };

        SudokuBoard board = new SudokuBoard(input);
        board.solve();
        assertArrayEquals(solution, input);
    }

    @Test
    public void hard_3x5() {
        // Pretty tough to solve takes 4-5 minutes
        // http://www.menneske.no/sudoku/3x5/solution.html?number=2894
        int[][] input = {
                {0, 15, 0, 0, 0, 0, 0, 1, 0, 12, 14, 10, 0, 9, 0},
                {0, 0, 12, 0, 9, 0, 0, 4, 0, 0, 11, 0, 0, 0, 6},
                {7, 6, 0, 0, 0, 10, 0, 11, 0, 13, 0, 1, 0, 0, 2},
                {5, 0, 3, 0, 0, 7, 0, 0, 0, 0, 0, 13, 0, 6, 0},
                {0, 8, 0, 4, 0, 0, 0, 0, 5, 2, 12, 0, 0, 1, 0},
                {0, 0, 0, 1, 0, 0, 0, 14, 6, 15, 0, 0, 0, 0, 9},
                {11, 3, 0, 15, 0, 0, 0, 0, 0, 4, 7, 0, 0, 0, 1},
                {0, 7, 6, 0, 8, 2, 0, 10, 0, 11, 13, 0, 15, 14, 0},
                {10, 0, 0, 0, 1, 8, 0, 0, 0, 0, 0, 9, 0, 2, 12},
                {8, 0, 0, 0, 0, 1, 9, 3, 0, 0, 0, 4, 0, 0, 0},
                {0, 14, 0, 0, 2, 13, 8, 0, 0, 0, 0, 15, 0, 3, 0},
                {0, 4, 0, 7, 0, 0, 0, 0, 0, 6, 0, 0, 8, 0, 14},
                {15, 0, 0, 3, 0, 4, 0, 13, 0, 8, 0, 0, 0, 12, 7},
                {12, 0, 0, 0, 14, 0, 0, 6, 0, 0, 15, 0, 4, 0, 0},
                {0, 9, 0, 2, 4, 15, 0, 12, 0, 0, 0, 0, 0, 5, 0}
        };

        int[][] solution = {
                {4, 15, 13, 11, 3, 6, 7, 1, 2, 12, 14, 10, 5, 9, 8},
                {2, 1, 12, 10, 9, 14, 3, 4, 8, 5, 11, 7, 13, 15, 6},
                {7, 6, 14, 8, 5, 10, 15, 11, 9, 13, 3, 1, 12, 4, 2},
                {5, 12, 3, 9, 15, 7, 4, 8, 11, 1, 2, 13, 14, 6, 10},
                {14, 8, 10, 4, 6, 3, 13, 9, 5, 2, 12, 11, 7, 1, 15},
                {13, 2, 11, 1, 7, 12, 10, 14, 6, 15, 4, 5, 3, 8, 9},
                {11, 3, 2, 15, 12, 9, 14, 5, 13, 4, 7, 8, 6, 10, 1},
                {9, 7, 6, 5, 8, 2, 12, 10, 1, 11, 13, 3, 15, 14, 4},
                {10, 13, 4, 14, 1, 8, 6, 15, 3, 7, 5, 9, 11, 2, 12},
                {8, 11, 15, 6, 13, 1, 9, 3, 12, 14, 10, 4, 2, 7, 5},
                {1, 14, 5, 12, 2, 13, 8, 7, 4, 10, 6, 15, 9, 3, 11},
                {3, 4, 9, 7, 10, 11, 5, 2, 15, 6, 1, 12, 8, 13, 14},
                {15, 5, 1, 3, 11, 4, 2, 13, 14, 8, 9, 6, 10, 12, 7},
                {12, 10, 8, 13, 14, 5, 1, 6, 7, 9, 15, 2, 4, 11, 3},
                {6, 9, 7, 2, 4, 15, 11, 12, 10, 3, 8, 14, 1, 5, 13}
        };

        SudokuBoard board = new SudokuBoard(input);
        board.solve();
        assertArrayEquals(solution, input);
    }

    @Test
    public void hard_4x4() {
        // http://www.menneske.no/sudoku/4/solution.html?number=3654
        int[][] input = {
                {12, 9, 0, 0, 0, 0, 0, 0, 0, 0, 6, 4, 5, 0, 13, 1},
                {0, 1, 8, 0, 0, 0, 0, 15, 0, 13, 0, 9, 4, 0, 3, 0},
                {0, 0, 13, 15, 0, 4, 6, 1, 16, 3, 8, 12, 2, 0, 10, 9},
                {0, 16, 0, 10, 3, 0, 0, 0, 11, 0, 0, 0, 0, 8, 0, 0},
                {0, 0, 7, 5, 10, 0, 0, 12, 0, 0, 0, 11, 9, 0, 1, 8},
                {0, 12, 0, 8, 0, 0, 1, 9, 0, 5, 0, 7, 15, 6, 11, 3},
                {0, 2, 1, 9, 7, 11, 0, 0, 10, 0, 3, 0, 0, 0, 0, 0},
                {0, 14, 11, 0, 0, 0, 0, 0, 9, 0, 0, 0, 7, 13, 2, 10},
                {3, 13, 12, 4, 0, 0, 0, 7, 0, 0, 0, 0, 0, 16, 9, 0},
                {0, 0, 0, 0, 0, 6, 0, 11, 0, 0, 4, 3, 13, 15, 5, 0},
                {11, 7, 15, 14, 13, 0, 8, 0, 2, 16, 0, 0, 10, 0, 4, 0},
                {9, 6, 0, 16, 2, 0, 0, 0, 8, 0, 0, 15, 1, 3, 0, 0},
                {0, 0, 9, 0, 0, 0, 0, 10, 0, 0, 0, 2, 16, 0, 8, 0},
                {7, 4, 0, 12, 15, 8, 14, 5, 3, 9, 1, 0, 11, 2, 0, 0},
                {0, 8, 0, 2, 9, 0, 12, 0, 7, 0, 0, 0, 0, 10, 15, 0},
                {10, 5, 0, 11, 1, 13, 0, 0, 0, 0, 0, 0, 0, 0, 14, 7}
        };

        int[][] solution = {
                {12, 9, 3, 7, 11, 10, 16, 8, 15, 2, 6, 4, 5, 14, 13, 1},
                {14, 1, 8, 6, 12, 2, 7, 15, 5, 13, 10, 9, 4, 11, 3, 16},
                {5, 11, 13, 15, 14, 4, 6, 1, 16, 3, 8, 12, 2, 7, 10, 9},
                {2, 16, 4, 10, 3, 9, 5, 13, 11, 1, 7, 14, 6, 8, 12, 15},
                {13, 15, 7, 5, 10, 3, 2, 12, 6, 14, 16, 11, 9, 4, 1, 8},
                {16, 12, 10, 8, 4, 14, 1, 9, 13, 5, 2, 7, 15, 6, 11, 3},
                {4, 2, 1, 9, 7, 11, 13, 6, 10, 15, 3, 8, 14, 5, 16, 12},
                {6, 14, 11, 3, 8, 5, 15, 16, 9, 4, 12, 1, 7, 13, 2, 10},
                {3, 13, 12, 4, 5, 15, 10, 7, 1, 11, 14, 6, 8, 16, 9, 2},
                {8, 10, 2, 1, 16, 6, 9, 11, 12, 7, 4, 3, 13, 15, 5, 14},
                {11, 7, 15, 14, 13, 1, 8, 3, 2, 16, 9, 5, 10, 12, 4, 6},
                {9, 6, 5, 16, 2, 12, 4, 14, 8, 10, 13, 15, 1, 3, 7, 11},
                {15, 3, 9, 13, 6, 7, 11, 10, 14, 12, 5, 2, 16, 1, 8, 4},
                {7, 4, 16, 12, 15, 8, 14, 5, 3, 9, 1, 10, 11, 2, 6, 13},
                {1, 8, 14, 2, 9, 16, 12, 4, 7, 6, 11, 13, 3, 10, 15, 5},
                {10, 5, 6, 11, 1, 13, 3, 2, 4, 8, 15, 16, 12, 9, 14, 7}
        };

        SudokuBoard board = new SudokuBoard(input);
        board.solve();
        assertArrayEquals(solution, input);
    }

    // Too hard to solve without optimizations
    // @Test
    public void hard_5x5() {
        // http://www.menneske.no/sudoku/5/solution.html?number=4821
        int[][] input = {
                {0, 15, 18, 0, 12, 0, 0, 25, 0, 0, 19, 1, 11, 0, 0, 0, 8, 0, 6, 4, 14, 17, 0, 0, 0},
                {8, 0, 0, 0, 0, 0, 0, 7, 3, 0, 0, 0, 5, 2, 24, 0, 0, 16, 0, 20, 15, 0, 11, 0, 0},
                {17, 0, 7, 3, 0, 0, 0, 0, 0, 0, 0, 25, 0, 16, 0, 18, 22, 23, 0, 0, 6, 10, 0, 0, 4},
                {0, 0, 10, 14, 25, 9, 19, 0, 0, 24, 15, 20, 22, 0, 0, 0, 0, 1, 21, 0, 0, 0, 2, 8, 12},
                {0, 16, 0, 0, 23, 0, 0, 0, 0, 0, 9, 0, 13, 0, 0, 25, 10, 0, 0, 14, 0, 3, 1, 20, 19},
                {19, 0, 0, 0, 0, 0, 2, 17, 14, 0, 0, 13, 10, 0, 18, 0, 4, 20, 0, 3, 9, 0, 15, 0, 8},
                {2, 21, 0, 0, 6, 12, 0, 0, 25, 0, 7, 4, 8, 14, 3, 17, 16, 9, 22, 0, 0, 18, 19, 0, 0},
                {15, 12, 0, 0, 0, 0, 8, 4, 0, 19, 17, 0, 0, 22, 0, 0, 0, 0, 2, 0, 0, 20, 0, 0, 0},
                {0, 8, 0, 1, 0, 0, 0, 0, 0, 18, 0, 0, 0, 11, 6, 0, 0, 0, 14, 0, 0, 0, 12, 0, 0},
                {0, 0, 0, 0, 0, 21, 20, 9, 0, 23, 5, 19, 25, 0, 2, 6, 12, 0, 0, 8, 24, 22, 10, 0, 0},
                {1, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 2, 19, 0, 12, 0, 13, 14, 16, 0, 0, 24, 0, 0, 0},
                {25, 0, 9, 0, 16, 0, 0, 0, 0, 11, 23, 0, 0, 0, 0, 0, 21, 0, 3, 2, 0, 5, 22, 0, 1},
                {22, 0, 24, 10, 4, 8, 0, 14, 0, 1, 0, 0, 21, 0, 0, 5, 0, 17, 0, 19, 13, 2, 25, 0, 16},
                {20, 0, 5, 19, 0, 6, 25, 0, 4, 0, 0, 0, 0, 0, 9, 24, 0, 0, 0, 0, 10, 0, 3, 0, 17},
                {0, 0, 0, 2, 0, 0, 23, 19, 12, 0, 4, 0, 16, 10, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 18},
                {0, 0, 11, 24, 21, 2, 0, 0, 20, 13, 3, 0, 15, 5, 19, 4, 0, 8, 9, 17, 0, 0, 0, 0, 0},
                {0, 0, 6, 0, 0, 0, 12, 0, 0, 0, 14, 8, 0, 0, 0, 13, 0, 0, 0, 0, 0, 11, 0, 2, 0},
                {0, 0, 0, 22, 0, 0, 10, 0, 0, 0, 0, 9, 0, 0, 17, 16, 0, 24, 7, 0, 0, 0, 0, 15, 21},
                {0, 0, 15, 16, 0, 0, 17, 3, 1, 9, 18, 21, 2, 7, 11, 0, 25, 0, 0, 6, 12, 0, 0, 10, 20},
                {18, 0, 12, 0, 8, 7, 0, 5, 11, 0, 16, 0, 24, 13, 0, 0, 19, 2, 10, 0, 0, 0, 0, 0, 9},
                {11, 9, 16, 21, 0, 20, 0, 0, 15, 8, 0, 0, 7, 0, 25, 0, 0, 0, 0, 0, 18, 0, 0, 19, 0},
                {24, 10, 8, 0, 0, 0, 6, 2, 0, 0, 0, 0, 20, 4, 1, 11, 0, 0, 18, 23, 22, 15, 17, 0, 0},
                {6, 0, 0, 15, 20, 0, 0, 12, 18, 3, 0, 11, 0, 21, 0, 0, 0, 0, 0, 0, 0, 9, 4, 0, 2},
                {0, 0, 19, 0, 18, 4, 0, 11, 0, 0, 22, 10, 6, 0, 0, 0, 2, 7, 0, 0, 0, 0, 0, 0, 3},
                {0, 0, 0, 7, 17, 5, 1, 0, 9, 0, 0, 0, 3, 19, 15, 0, 0, 13, 0, 0, 16, 0, 14, 23, 0}
        };

        int[][] solution = {
                {9, 15, 18, 20, 12, 16, 13, 25, 10, 21, 19, 1, 11, 3, 23, 2, 8, 5, 6, 4, 14, 17, 7, 22, 24},
                {8, 22, 21, 6, 1, 23, 4, 7, 3, 12, 10, 14, 5, 2, 24, 9, 17, 16, 19, 20, 15, 25, 11, 18, 13},
                {17, 19, 7, 3, 24, 14, 11, 1, 2, 20, 8, 25, 12, 16, 21, 18, 22, 23, 13, 15, 6, 10, 5, 9, 4},
                {13, 5, 10, 14, 25, 9, 19, 6, 17, 24, 15, 20, 22, 18, 4, 3, 7, 1, 21, 11, 23, 16, 2, 8, 12},
                {4, 16, 2, 11, 23, 15, 18, 8, 22, 5, 9, 17, 13, 6, 7, 25, 10, 12, 24, 14, 21, 3, 1, 20, 19},
                {19, 24, 25, 5, 22, 1, 2, 17, 14, 7, 21, 13, 10, 12, 18, 23, 4, 20, 11, 3, 9, 6, 15, 16, 8},
                {2, 21, 20, 23, 6, 12, 24, 15, 25, 10, 7, 4, 8, 14, 3, 17, 16, 9, 22, 13, 11, 18, 19, 1, 5},
                {15, 12, 14, 18, 10, 11, 8, 4, 6, 19, 17, 24, 9, 22, 16, 7, 1, 25, 2, 5, 3, 20, 21, 13, 23},
                {16, 8, 17, 1, 9, 22, 3, 13, 5, 18, 20, 15, 23, 11, 6, 21, 24, 19, 14, 10, 2, 7, 12, 4, 25},
                {7, 3, 13, 4, 11, 21, 20, 9, 16, 23, 5, 19, 25, 1, 2, 6, 12, 18, 15, 8, 24, 22, 10, 17, 14},
                {1, 17, 23, 8, 7, 3, 5, 18, 21, 22, 6, 2, 19, 25, 12, 10, 13, 14, 16, 9, 4, 24, 20, 11, 15},
                {25, 18, 9, 12, 16, 10, 15, 20, 13, 11, 23, 7, 17, 24, 14, 8, 21, 4, 3, 2, 19, 5, 22, 6, 1},
                {22, 6, 24, 10, 4, 8, 9, 14, 7, 1, 11, 3, 21, 15, 20, 5, 18, 17, 23, 19, 13, 2, 25, 12, 16},
                {20, 13, 5, 19, 14, 6, 25, 16, 4, 2, 1, 22, 18, 8, 9, 24, 15, 11, 12, 7, 10, 23, 3, 21, 17},
                {21, 11, 3, 2, 15, 24, 23, 19, 12, 17, 4, 5, 16, 10, 13, 22, 20, 6, 1, 25, 8, 14, 9, 7, 18},
                {10, 25, 11, 24, 21, 2, 16, 22, 20, 13, 3, 12, 15, 5, 19, 4, 23, 8, 9, 17, 7, 1, 18, 14, 6},
                {5, 7, 6, 9, 19, 25, 12, 21, 24, 4, 14, 8, 1, 23, 10, 13, 3, 15, 20, 18, 17, 11, 16, 2, 22},
                {3, 14, 1, 22, 2, 18, 10, 23, 8, 6, 25, 9, 4, 20, 17, 16, 11, 24, 7, 12, 5, 19, 13, 15, 21},
                {23, 4, 15, 16, 13, 19, 17, 3, 1, 9, 18, 21, 2, 7, 11, 14, 25, 22, 5, 6, 12, 8, 24, 10, 20},
                {18, 20, 12, 17, 8, 7, 14, 5, 11, 15, 16, 6, 24, 13, 22, 1, 19, 2, 10, 21, 25, 4, 23, 3, 9},
                {11, 9, 16, 21, 5, 20, 22, 24, 15, 8, 2, 23, 7, 17, 25, 12, 14, 3, 4, 1, 18, 13, 6, 19, 10},
                {24, 10, 8, 25, 3, 13, 6, 2, 19, 14, 12, 16, 20, 4, 1, 11, 9, 21, 18, 23, 22, 15, 17, 5, 7},
                {6, 23, 22, 15, 20, 17, 7, 12, 18, 3, 13, 11, 14, 21, 8, 19, 5, 10, 25, 16, 1, 9, 4, 24, 2},
                {14, 1, 19, 13, 18, 4, 21, 11, 23, 16, 22, 10, 6, 9, 5, 15, 2, 7, 17, 24, 20, 12, 8, 25, 3},
                {12, 2, 4, 7, 17, 5, 1, 10, 9, 25, 24, 18, 3, 19, 15, 20, 6, 13, 8, 22, 16, 21, 14, 23, 11}
        };

        SudokuBoard board = new SudokuBoard(input);
        board.solve();
        assertArrayEquals(solution, input);
    }
}


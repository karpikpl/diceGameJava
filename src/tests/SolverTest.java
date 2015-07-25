package tests;

import com.dicegame.Reader;
import com.dicegame.Solver;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by pkarpala on 7/25/2015.
 */
public class SolverTest {

    @Test
    public void solve_should_returnCorrectAnswer_When_Case1() throws Exception {
        // Arrange
        Reader reader = new Reader(Utils.ReadResourceString("./tests/resources/1.in"));
        String expectedAnswer = Utils.ReadResourceString("./tests/resources/1.out");
        Solver solver = new Solver(reader);

        // Act
        String answer = solver.solve();

        // Assert
        org.junit.Assert.assertEquals(expectedAnswer, answer);
    }

    @Test
    public void solve_should_returnCorrectAnswer_When_Case2() throws Exception {
        // Arrange
        Reader reader = new Reader(Utils.ReadResourceString("./tests/resources/2.in"));
        String expectedAnswer = Utils.ReadResourceString("./tests/resources/2.out");
        Solver solver = new Solver(reader);

        // Act
        String answer = solver.solve();

        // Assert
        org.junit.Assert.assertEquals(expectedAnswer, answer);
    }

    @Test
    public void solve_should_returnCorrectAnswer_When_Case3() throws Exception {
        // Arrange
        Reader reader = new Reader(Utils.ReadResourceString("./tests/resources/3.in"));
        String expectedAnswer = Utils.ReadResourceString("./tests/resources/3.out");
        Solver solver = new Solver(reader);

        // Act
        String answer = solver.solve();

        // Assert
        org.junit.Assert.assertEquals(expectedAnswer, answer);
    }

    @Test
    public void testCalculate() throws Exception {
        // Arrange
        float expected = 2.5f;

        // Act
        float result = Solver.calculate(1, 4);

        // Assert
        Assert.assertEquals(expected, result, 0.0001);
    }
}

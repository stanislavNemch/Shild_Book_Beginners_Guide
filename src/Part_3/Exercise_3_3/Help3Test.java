package Part_3.Exercise_3_3;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Help3Test {

    @Test
    void testIfOption() throws IOException {
        // Arrange
        String input = "1\nq\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        String[] args = {};
        Help3.main(args);

        // Assert
        String output = outContent.toString();
        assertTrue(output.contains("Оператор if:"));
    }

    @Test
    void testSwitchOption() throws IOException {
        // Arrange
        String input = "2\nq\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        String[] args = {};
        Help3.main(args);

        // Assert
        String output = outContent.toString();
        assertTrue(output.contains("Традиционный оператор switch:"));
    }

    @Test
    void testForOption() throws IOException {
        // Arrange
        String input = "3\nq\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        String[] args = {};
        Help3.main(args);

        // Assert
        String output = outContent.toString();
        assertTrue(output.contains("Цикл for:"));
    }

    @Test
    void testWhileOption() throws IOException {
        // Arrange
        String input = "4\nq\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        String[] args = {};
        Help3.main(args);

        // Assert
        String output = outContent.toString();
        assertTrue(output.contains("Цикл while:"));
    }

    @Test
    void testDoWhileOption() throws IOException {
        // Arrange
        String input = "5\nq\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        String[] args = {};
        Help3.main(args);

        // Assert
        String output = outContent.toString();
        assertTrue(output.contains("Цикл do-while:"));
    }

    @Test
    void testBreakOption() throws IOException {
        // Arrange
        String input = "6\nq\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        String[] args = {};
        Help3.main(args);

        // Assert
        String output = outContent.toString();
        assertTrue(output.contains("Оператор break:"));
    }

    @Test
    void testContinueOption() throws IOException {
        // Arrange
        String input = "7\nq\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        String[] args = {};
        Help3.main(args);

        // Assert
        String output = outContent.toString();
        assertTrue(output.contains("Оператор continue:"));
    }

    @Test
    void testInvalidOption() throws IOException {
        // Arrange
        String input = "8\nq\n"; // 8 is not a valid option
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        String[] args = {};
        Help3.main(args);

        // Assert
        String output = outContent.toString();
        assertTrue(output.contains("Выберите вариант (или q для завершения):"));
    }
}
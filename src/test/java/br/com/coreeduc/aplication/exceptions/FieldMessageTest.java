package br.com.coreeduc.aplication.exceptions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FieldMessageTest {

    @Test
    public void testConstructorAndGetters() {
        String fieldName = "exampleField";
        String message = "Example error message";

        FieldMessage fieldMessage = new FieldMessage(fieldName, message);

        assertAll(
                () -> assertThat(fieldMessage.getFieldName()).isEqualTo(fieldName),
                () -> assertThat(fieldMessage.getMessage()).isEqualTo(message)
        );
    }

    @Test
    public void testSetters() {
        String fieldName = "exampleField";
        String message = "Example error message";

        FieldMessage fieldMessage = new FieldMessage();

        fieldMessage.setFieldName(fieldName);
        fieldMessage.setMessage(message);

        assertAll(
                () -> assertThat(fieldMessage.getFieldName()).isEqualTo(fieldName),
                () -> assertThat(fieldMessage.getMessage()).isEqualTo(message)
        );
    }

    @Test
    public void testEqualsAndHashCode() {
        FieldMessage fieldMessage1 = new FieldMessage("fieldName", "message");
        FieldMessage fieldMessage2 = new FieldMessage("fieldName", "message");
        assertEquals(fieldMessage1.getMessage(), fieldMessage2.getMessage());
        assertEquals(fieldMessage1.getFieldName(), fieldMessage2.getFieldName());
    }

    @Test
    public void testNotEquals() {
        FieldMessage fieldMessage1 = new FieldMessage("fieldName1", "message1");
        FieldMessage fieldMessage2 = new FieldMessage("fieldName2", "message2");

        assertThat(fieldMessage1).isNotEqualTo(fieldMessage2);
    }
}
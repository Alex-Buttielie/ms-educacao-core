package br.com.coreeduc.architecture.exceptions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FieldMessageTest {

    @Test
    public void testConstructorAndGetters() {
        var fieldName = "exampleField";
        var message = "Example error message";
        var fieldMessage = new FieldMessage(fieldName, message);
        assertAll(
                () -> assertThat(fieldMessage.getFieldName()).isEqualTo(fieldName),
                () -> assertThat(fieldMessage.getMessage()).isEqualTo(message)
        );
    }

    @Test
    public void testSetters() {
        var fieldName = "exampleField";
        var message = "Example error message";
        var fieldMessage = new FieldMessage();
        fieldMessage.setFieldName(fieldName);
        fieldMessage.setMessage(message);
        assertAll(
                () -> assertThat(fieldMessage.getFieldName()).isEqualTo(fieldName),
                () -> assertThat(fieldMessage.getMessage()).isEqualTo(message)
        );
    }

    @Test
    public void testEqualsAndHashCode() {
        var fieldMessage1 = new FieldMessage("fieldName", "message");
        var fieldMessage2 = new FieldMessage("fieldName", "message");
        assertEquals(fieldMessage1.getMessage(), fieldMessage2.getMessage());
        assertEquals(fieldMessage1.getFieldName(), fieldMessage2.getFieldName());
    }

    @Test
    public void testNotEquals() {
        var fieldMessage1 = new FieldMessage("fieldName1", "message1");
        var fieldMessage2 = new FieldMessage("fieldName2", "message2");
        assertThat(fieldMessage1).isNotEqualTo(fieldMessage2);
    }

}
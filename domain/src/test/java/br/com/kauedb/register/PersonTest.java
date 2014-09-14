package br.com.kauedb.register;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void shouldCreatePersonWithoutId(){

        final String firstName = "John";
        final String lastName = "Doe";

        Person person = Person.Builder.create()
                .withFirstName(firstName)
                .withLastName(lastName)
                .build();

        assertNotNull(person);
        assertEquals(person.getFirstName(), firstName);
        assertEquals(person.getLastName(), lastName);
        assertNull(person.getId());
    }

    @Test
    public void shouldCreatePersonWithId(){
        final Integer id = 1;
        final String firstName = "John";
        final String lastName = "Doe";

        final Person person = Person.Builder.create()
                .withFirstName(firstName)
                .withLastName(lastName)
                .withId(id)
                .build();

        assertThat(person, is(notNullValue()));
        assertThat(person.getFirstName(), is(firstName));
        assertThat(person.getLastName(), is(lastName));
        assertThat(person.getId(), is(id.longValue()));
    }


}
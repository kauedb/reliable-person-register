package br.com.kauedb.register;

/**
 * Created by kauedb.
 */
public class Person {

    private final Long id;
    private final String firstName;
    private final String lastName;

    private Person(Builder builder) {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Long getId() {
        return id;
    }

    public static class Builder {

        private String firstName;
        private String lastName;
        private Long id;

        private Builder() {
        }

        public static Builder create() {
            return new Builder();
        }

        public Builder withFirstName(final String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(final String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Person build() {
            return new Person(this);
        }

        public Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public Builder withId(Integer id) {
            return withId(id.longValue());
        }
    }
}

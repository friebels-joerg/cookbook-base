package de.friebels.cookbook.domain;

import java.util.Objects;
import java.util.UUID;

import de.friebels.domain.StringAttribute;

import static de.friebels.cookbook.domain.Constraint.checkExactLengthString;

public class Id extends StringAttribute {

    private Id(final String value) {
        super(checkExactLengthString(value, "value", 36));
    }

    public static Id of(final String value) {
        return new Id(value);
    }

    public static Id generate() {
        return new Id(UUID.randomUUID().toString());
    }
}

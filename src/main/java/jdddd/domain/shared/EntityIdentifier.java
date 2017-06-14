package jdddd.domain.shared;

import java.util.UUID;

public interface EntityIdentifier<T extends Entity<T>> extends ValueObject {

	UUID toUUID();
}

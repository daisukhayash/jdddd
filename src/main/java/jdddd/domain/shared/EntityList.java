package jdddd.domain.shared;

import java.util.ArrayList;

public class EntityList<E extends Entity<E>> extends ForwardingList<E> {

	public EntityList() {
		super(new ArrayList<E>());
	}

	public E getByIdentifier(EntityIdentifier<E> identifier) {
		for (E entity : list) {
			if (entity.getIdentifier().equals(identifier)) {
				return entity;
			}
		}
		return null;
	}

	public EntityList<E> getByIdentifierAll(EntityIdentifier<E> identifier) {
		EntityList<E> ret = new EntityList<E>();
		for (E entity : list) {
			if (entity.getIdentifier().equals(identifier)) {
				ret.add(entity);
			}
		}
		return ret;
	}

	public boolean hasEntity(E entity) {
		return indexOf(entity) == -1 ? false : true;
	}

	public boolean addOrReplace(E entity) {
		int index = indexOf(entity);
		if (index == -1) {
			add(entity);
		} else {
			set(index, entity);
		}
		return true;
	}

	public boolean put(E entity) {
		return addOrReplace(entity);
	}
}
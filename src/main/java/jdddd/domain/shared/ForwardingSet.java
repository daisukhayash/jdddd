package jdddd.domain.shared;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ForwardingSet<E> implements Set<E> {

	protected final Set<E> set;

	public ForwardingSet(Set<E> set) {
		this.set = set;
	}

	public void forEach(Consumer<? super E> action) {
		set.forEach(action);
	}

	public int size() {
		return set.size();
	}

	public boolean isEmpty() {
		return set.isEmpty();
	}

	public boolean contains(Object o) {
		return set.contains(o);
	}

	public Iterator<E> iterator() {
		return set.iterator();
	}

	public Object[] toArray() {
		return set.toArray();
	}

	public <T> T[] toArray(T[] a) {
		return set.toArray(a);
	}

	public boolean add(E e) {
		return set.add(e);
	}

	public boolean remove(Object o) {
		return set.remove(o);
	}

	public boolean containsAll(Collection<?> c) {
		return set.containsAll(c);
	}

	public boolean addAll(Collection<? extends E> c) {
		return set.addAll(c);
	}

	public boolean retainAll(Collection<?> c) {
		return set.retainAll(c);
	}

	public boolean removeAll(Collection<?> c) {
		return set.removeAll(c);
	}

	public void clear() {
		set.clear();
	}

	public boolean equals(Object o) {
		return set.equals(o);
	}

	public int hashCode() {
		return set.hashCode();
	}

	public Spliterator<E> spliterator() {
		return set.spliterator();
	}

	public boolean removeIf(Predicate<? super E> filter) {
		return set.removeIf(filter);
	}

	public Stream<E> stream() {
		return set.stream();
	}

	public Stream<E> parallelStream() {
		return set.parallelStream();
	}
}

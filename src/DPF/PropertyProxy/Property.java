package DPF.PropertyProxy;

class Property<T>
{
  private T value;

  public Property(T value)
  {
    this.value = value;
  }

  public void setValue(T value)
  {
    // do some logging here
    this.value = value;
  }

  public T getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o)
  {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Property<?> property = (Property<?>) o;

    return value != null ? value.equals(property.value) : property.value == null;
  }

  @Override
  public int hashCode()
  {
    return value != null ? value.hashCode() : 0;
  }
}

public class Insurance implements Comparable<Insurance>{
    private final long id;
    private final int price;

    public Insurance(long id, int price) {
        this.id = id;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Insurance insurance = (Insurance) o;

        if (id != insurance.id) return false;
        return price == insurance.price;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + price;
        return result;
    }

    @Override
    public int compareTo(Insurance insurance) {
        return Integer.compare(price, insurance.getPrice());
    }
}

package collections;

import java.util.Objects;

public class WeatherData implements Comparable<WeatherData>{
    private int temp;
    private int dayOfYear;

    public WeatherData(int temp, int dayOfYear) {
        this.temp = temp;
        this.dayOfYear = dayOfYear;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getDayOfYear() {
        return dayOfYear;
    }

    public void setDayOfYear(int dayOfYear) {
        this.dayOfYear = dayOfYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeatherData that = (WeatherData) o;
        return temp == that.temp &&
                dayOfYear == that.dayOfYear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(temp, dayOfYear);
    }

    @Override
    public int compareTo(WeatherData o) {
        int compareResult = Integer.compare(temp, o.getTemp());
        return compareResult != 0 ? compareResult : Integer.compare(dayOfYear, o.getDayOfYear());
    }
}

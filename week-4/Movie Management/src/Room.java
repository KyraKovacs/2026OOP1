import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

public class Room
{
    private int number;
    private Movie movie;
    private List<Seat> seats;

    public Room(int number, Movie movie, List<Seat> seats)
    {
        this.setNumber(number);
        this.setMovie(movie);
        this.seats=new ArrayList<>();
    }

    public int getNumber()
    {
        return this.number;
    }

    public Movie getMovie()
    {
        return this.movie;
    }

    public List<Seat> getSeats()
    {
        return this.seats;
    }

    public void setNumber(int number)
    {
        this.number=number;
    }

    public void setMovie(Movie movie)
    {
        this.movie=movie;
    }

    public void setSeats(List<Seat> seats)
    {
        this.seats=seats;
    }

    public static double getProfitInRoom(Movie movie, Seat seat) {
        return movie.getPriceInEurocents() * seat.getAdditionalChargeAmountInEurocents();
    }

}

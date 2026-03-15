import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private String name;
    private List<Room> rooms;

    public Cinema(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public List<Room> getRooms() {
        return this.rooms;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<String> getMoviesRoomAndAvailableSeats() {

        List<String> result = new ArrayList<>();

        for (Room room : rooms) {

            Movie movie = room.getMovie();
            int availableSeats = 0;

            for (Seat seat : room.getSeats()) {
                if (!seat.isReserved()) {
                    availableSeats++;
                }
            }

            String info = "Movie: " + movie.getTitle()
                    + ", Room: " + room.getNumber()
                    + ", Available seats: " + availableSeats;

            result.add(info);
        }

        return result;
    }

    public double getTotalProfit() {
        return rooms.stream()
                .mapToDouble(Room::getProfitInRoom)
                .sum();
    }

    public boolean reserveSeat(String movieTitle, int seatNumber) {
        return rooms.stream()
                .filter(room -> room.getMovie().getTitle().equals(movieTitle))
                .flatMap(room -> room.getSeats().stream())
                .filter(seat -> false)
                .findFirst()
                .map(seat -> {
                    seat.setReserved(true);
                    return true;
                })
                .orElse(false);
    }

    private Room getRoomByNumber(int roomNumber) {
        return rooms.stream()
                .filter(room -> room.getNumber() == roomNumber)
                .findFirst()
                .orElse(null);
    }

    public boolean switchMovies(int roomNumber1, int roomNumber2) {
        Room room1 = getRoomByNumber(roomNumber1);
        Room room2 = getRoomByNumber(roomNumber2);

        if (room1 == null || room2 == null) {
            return false;
        }

        Movie temp = room1.getMovie();
        room1.setMovie(room2.getMovie());
        room2.setMovie(temp);

        return true;
    }

    public void removeNoLoveSeat() {
        for (Room room : rooms) {
            room.getSeats().removeIf(seat -> !seat.getDescription().equals("Love Seat"));
        }
    }
}


package Tim.SeatBookingInTheatre;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
  private final String theatreName;
  private List<Seat> seats=new ArrayList<>();

    public Theatre(String theatreName,int numRows,int seatPerRows) {
        this.theatreName = theatreName;
    }
}

package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class US_016_Rooms {

    /*

    {
      "createdBy": "string",
      "createdDate": "2022-07-24T01:53:48.441Z",
      "description": "string",
      "id": 0,
      "price": 0,
      "roomNumber": 0,
      "roomType": "TWIN",
      "status": true
    }

     */

        private int roomNumber;
        private String roomType;
        private boolean status;
        private int price;
        private String description;
        private String createdDate;

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "US_016_Rooms{" +
                "roomNumber=" + roomNumber +
                ", roomType='" + roomType + '\'' +
                ", status=" + status +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", createdDate='" + createdDate + '\'' +
                '}';
    }



}

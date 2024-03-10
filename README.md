# Hotel Reservation System API

This project is a Java Spring Boot application for managing hotel reservations. It provides endpoints for retrieving a list of hotels and adding new hotels to the system.

## Getting Started

To run the application locally, follow these steps:

### Prerequisites

- Java Development Kit (JDK) installed on your machine
- Maven installed on your machine
- MySQL installed on your machine

### Installation

1. Clone the repository
2. Navigate to the project directory
3. Build the project using Maven
4. Run the application


## API Endpoints

### Get All Hotels

Retrieve a list of all hotels in the database.

- **URL:** `/hotels`
- **Method:** `GET`
- **URL Params:** None
- **Success Response:**
  - **Code:** 200 OK
  - **Content:**
    ```json
    [
      {
          "hotel_id": 1,
          "name": "Grand Hotel",
          "location": "New York",
          "price": 250.00,
          "rating": 4.80,
          "total_rooms_available": 150,
          "contact_email": "info@grandhotel.com",
          "contact_phone": "123-456-7890",
          "website": "http://www.grandhotel.com"
      },
      {
          "hotel_id": 2,
          "name": "Seaside Resort",
          "location": "Miami",
          "price": 180.00,
          "rating": 4.20,
          "total_rooms_available": 100,
          "contact_email": "info@seasideresort.com",
          "contact_phone": "987-654-3210",
          "website": "http://www.seasideresort.com"
      },
      {
          "hotel_id": 3,
          "name": "Mountain Lodge",
          "location": "Aspen",
          "price": 300.00,
          "rating": 4.50,
          "total_rooms_available": 75,
          "contact_email": "info@mountainlodge.com",
          "contact_phone": "555-555-5555",
          "website": "http://www.mountainlodge.com"
      },
      {
          "hotel_id": 4,
          "name": "City Plaza Hotel",
          "location": "Chicago",
          "price": 200.00,
          "rating": 4.00,
          "total_rooms_available": 120,
          "contact_email": "info@cityplazahotel.com",
          "contact_phone": "111-222-3333",
          "website": "http://www.cityplazahotel.com"
      },
      {
          "hotel_id": 5,
          "name": "Beachfront Inn",
          "location": "San Diego",
          "price": 220.00,
          "rating": 4.30,
          "total_rooms_available": 80,
          "contact_email": "info@beachfrontinn.com",
          "contact_phone": "444-555-6666",
          "website": "http://www.beachfrontinn.com"
      },
      {
          "hotel_id": 9,
          "name": "Ocean Breeze Resort",
          "location": "Maui",
          "price": 280.00,
          "rating": 4.60,
          "total_rooms_available": 100,
          "contact_email": "info@oceanbreezeresort.com",
          "contact_phone": "555-123-4567",
          "website": "http://www.oceanbreezeresort.com"
      }
    ]
    ```

### Add New Hotel

Add a new hotel to the database.

- **URL:** `/hotels`
- **Method:** `POST`
- **Request Body:**
  ```json
  {
    "name": "Seaside Oasis Resort",
    "location": "Tropical Island",
    "price": 500.00,
    "rating": 4.9,
    "total_rooms_available": 100,
    "contact_email": "info@seasideoasisresort.com",
    "contact_phone": "987-654-3219",
    "website": "http://www.seasideoasisresort.com"
  }


* **Success Response:**
  * **Code:** 201 CREATED
  * **Content:**
    ```json
    {
      "hotel_id": 12,
      "name": "Seaside Oasis Resort",
      "location": "Tropical Island",
      "price": 500.00,
      "rating": 4.9,
      "total_rooms_available": 100,
      "contact_email": "info@seasideoasisresort.com",
      "contact_phone": "987-654-3219",
      "website": "http://www.seasideoasisresort.com"
    }
    ```
* **Error Response:**
  * **Code:** 400 BAD REQUEST
  * **Content:** `{ "status": "400 BAD REQUEST", "error": "Bad Request", "timestamp": "2024-03-10T08:00:00" }`


Screenshots
-----------

### GET Request
![Get All Hotels](screenshots/Get%20All%20Hotels.png)

### POST Request
![Add New Hotel](screenshots/Add%20New%20Hotel.png)







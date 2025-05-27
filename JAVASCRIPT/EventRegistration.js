const events = [
  { name: "Community Cleanup", date: "2025-06-15", availableSeats: 50 },
  { name: "Tree Planting", date: "2024-12-01", availableSeats: 0 },
  { name: "Charity Run", date: "2023-11-20", availableSeats: 30 }
];

const today = new Date();

events.forEach(event => {
  const eventDate = new Date(event.date);

  if (eventDate < today || event.availableSeats <= 0) {
  } else {
    console.log(`Event: ${event.name}, Date: ${event.date}, Seats: ${event.availableSeats}`);

    try {
      if (event.availableSeats <= 0) {
        throw new Error("No seats available");
      }
      event.availableSeats--;
      console.log(`Registration successful. Seats left: ${event.availableSeats}`);
    } catch (error) {
      console.error(`Registration failed: ${error.message}`);
    }
  }
});

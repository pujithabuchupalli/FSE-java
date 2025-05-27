const eventName = "Community Cleanup";
const eventDate = "2025-06-15";
let availableSeats = 50;

const eventInfo = `Event: ${eventName}, Date: ${eventDate}, Available Seats: ${availableSeats}`;
console.log(eventInfo);

availableSeats--;
console.log(`Seats after registration: ${availableSeats}`);

availableSeats++;
console.log(`Seats after cancellation: ${availableSeats}`);

function Event(name, date, availableSeats) {
  this.name = name;
  this.date = date;
  this.availableSeats = availableSeats;
}

Event.prototype.checkAvailability = function() {
  return this.availableSeats > 0;
};

const event1 = new Event("Community Cleanup", "2025-06-15", 50);

console.log(event1.checkAvailability());

for (const [key, value] of Object.entries(event1)) {
  console.log(`${key}: ${value}`);
}

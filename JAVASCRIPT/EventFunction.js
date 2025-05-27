const events = [];

// Closure to track total registrations per category
function registrationTracker() {
  const counts = {};
  return {
    register: (category) => {
      counts[category] = (counts[category] || 0) + 1;
    },
    getTotal: (category) => counts[category] || 0
  };
}

const tracker = registrationTracker();

function addEvent(event) {
  events.push(event);
}

function registerUser(event) {
  if (event.availableSeats > 0) {
    event.availableSeats--;
    tracker.register(event.category);
    console.log(`Registered for ${event.name}. Seats left: ${event.availableSeats}`);
  } else {
    console.log(`No seats available for ${event.name}`);
  }
}

function filterEventsByCategory(events, callback) {
  return events.filter(callback);
}

// Example usage:
addEvent({ name: "Cleanup", date: "2025-06-15", category: "Environment", availableSeats: 5 });
addEvent({ name: "Marathon", date: "2025-07-20", category: "Health", availableSeats: 3 });

registerUser(events[0]);
registerUser(events[0]);

const envEvents = filterEventsByCategory(events, e => e.category === "Environment");
console.log(envEvents);

console.log("Total Environment registrations:", tracker.getTotal("Environment"));

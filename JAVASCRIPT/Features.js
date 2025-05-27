const events = [
  { name: "Music Festival", seats: 5, category: "music" },
  { name: "Baking Workshop", seats: 3, category: "cooking" },
  { name: "Jazz Night", seats: 0, category: "music" }
];

const filterEvents = (eventsList = [], category = "") => {
  const clonedEvents = [...eventsList];
  return clonedEvents.filter(({ category: cat }) => cat === category);
};

const showEventDetails = ({ name, seats }) => 
  `Event: ${name} | Seats Available: ${seats}`;

const musicEvents = filterEvents(events, "music");

musicEvents.forEach(event => {
  console.log(showEventDetails(event));
});
